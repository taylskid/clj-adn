(ns clj-adn.config
  (:require [clojure.string :as string]))

(def token "INSER TOKEN HERE")

(defn url
  [& url-parts]
  (str "https://alpha-api.app.net/stream/0/" (string/join "/" url-parts) "?access_token=" token))
