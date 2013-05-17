(ns clj-adn.posts
  (:require [clj-http.client :as http]
            [cheshire.json :as json])
  (:use [clj-adn.config]))

(defn post [message]
  (http/post (url "posts") {:form-params {:text message} :content-type :json}))