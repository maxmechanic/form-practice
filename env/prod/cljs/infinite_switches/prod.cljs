(ns input-practice.prod
  (:require
   [input-practice.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
