(ns clj-adn.config
  (:require [clojure.string :as string))

(def token "INSERT TOKEN HERE")

(defn url
  ([action]
    (str "https://alpha-api.app.net/stream/0/" action "?access_token=" token))
  ([& url-parts]
    (url (string/join "/" url-parts))))
