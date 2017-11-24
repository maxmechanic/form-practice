(ns ^:figwheel-no-load input-practice.dev
  (:require
   [input-practice.core :as core]
   [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
