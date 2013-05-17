(ns clj-adn.users
  (:require [clj-http.client :as http]
            [cheshire.core :as json])
  (:use [clj-adn.config]))

(defn retrieve-self []
  (http/get (url "users/me")))

(defn retrieve-user [user]
  (http/get (url (str "users/" user))))

(defn follow [user]
  (http/post (url (str "users/" (str user "/follow")))))

(defn unfollow [user]
  (http/delete (url (str "users/" (str user "/follow")))))

(defn mute [user]
  (http/post (url (str "users/" (str user "/mute")))))

(defn unmute [user]
  (http/delete (url (str "users/" (str user "/mute")))))