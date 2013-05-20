(ns clj-adn.users
  (:require [clj-http.client :as http]
            [cheshire.core :as json])
  (:use [clj-adn.config]))

(defn lookup
  ([]
    (http/get (url "users" "me")))
  ([user]
    (http/get (url "users" user))))

(defn follow [user]
  (http/post (url "users" user "follow")))

(defn unfollow [user]
  (http/delete (url "users" user "follow")))

(defn followers 
  ([]
  (http/get (url "users" "me" "followers")))
  ([user]
    (http/get (url "users" user "followers"))))

(defn mute [user]
  (http/post (url "users" user "mute")))

(defn unmute [user]
  (http/delete (url "users" user "mute")))

(defn muted []
    (http/get (url "users" "me" "muted")))

(defn block [user]
  (http/post (url "users" user "block")))

(defn unblock [user]
  (http/delete (url "users" user "block")))

(defn blocked []
  (http/get (url "users" "me" "blocked")))