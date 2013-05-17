(ns adnbot.config)

(def token "PUT YOUR TOKEN HERE")

(defn url [action]
  (str "https://alpha-api.app.net/stream/0/" action "?access_token=" token))