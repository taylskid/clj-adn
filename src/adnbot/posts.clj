(ns adnbot.posts
  (:require [clj-http.client :as http])
  (:use [adnbot.config]))

(defn post [message]
  (http/post (url "posts") {:form-params {:text message} :content-type :json}))