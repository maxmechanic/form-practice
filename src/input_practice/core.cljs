(ns input-practice.core
  (:require
   [reagent.core :as r]
   [goog.math :refer [randomInt]]))

;; -------------------------
;; Views
(def input-types ["button"
                  "checkbox"
                  "color"
                  "date"
                  "datetime-local"
                  "email"
                  "file"
                  "hidden"
                  "image"
                  "month"
                  "number"
                  "password"
                  "Note"
                  "radio"
                  "range"
                  "reset"
                  "search"
                  "submit"
                  "tel"
                  "text"
                  "time"
                  "url"
                  "week"])

(defn get-input-type []
  (->> input-types
       (count)
       (randomInt)
       (nth input-types)))

(defn root []
  [:div {:style {:display "flex"
                 :flex-wrap "wrap"
                 :position "absolute"
                 :width "100%"
                 :height "100%"
                 :left 0
                 :top 0
                 :justify-content "center"}}

   (for [num (take 500 (range))]
     ^{:key num} [:div {:style {:padding "0.25em" :display "flex" :justify-content "center"}}
                  [:input {:type (get-input-type) :style {}}]])])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [root] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
