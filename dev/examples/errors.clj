(ns examples.errors
  (:require
    [clojure.string :as str]
    [io.github.humbleui.paint :as paint]
    [io.github.humbleui.ui :as ui])
  (:import
    [io.github.humbleui.skija Paint]))

(set! *warn-on-reflection* true)

(def ui
  (ui/valign 0.5
    (ui/halign 0.5
      (ui/column
        (ui/dynamic ctx [{:keys [leading font-ui fill-text]} ctx]
          (ui/label (/ 1 0)))))))