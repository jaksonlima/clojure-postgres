(ns clojure-postegres.core
  (:require [next.jdbc :as jdbc]
            [next.jdbc.sql :as sql]))

(def db-spec
  {:dbtype "postgresql"
   :dbname "clojure-postgres"
   :host "localhost"
   :port 5432
   :user "admin"
   :password "12345"})

(defn create-table []
  (jdbc/execute! db-spec ["CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, name VARCHAR(50), age INT)"]))

(defn insert-user [name age]
  (sql/insert! db-spec :users {:name name :age age}))

(defn get-users []
  (sql/query db-spec ["SELECT * FROM users"]))

(defn my-loop []
  (println "Application is running...")
  (Thread/sleep 100)
  (recur))

(defn my-while []
  (while true
    (println "Application is running...")
    (Thread/sleep 1000)))

(defn my-while-min-cpu []
  (while true
    (Thread/sleep 1000)))

(defn -main [& args]
  (create-table)
  (insert-user "lima" 27)
  (insert-user "jack" 28)
  (println (get-users))
  (my-while-min-cpu))

