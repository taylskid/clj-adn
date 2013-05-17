(ns clj-adn.config)

(def token "INSERT TOKEN HERE")

(defn url [action]
  (str "https://alpha-api.app.net/stream/0/" action "?access_token=" token))