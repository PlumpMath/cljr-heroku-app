(ns cljr.heroku.app.test.todo.model.todolist
  (:use [cljr.heroku.app.todo.model.todolist])
  (:use [clojure.test]))

;;(deftest test-all
;;  (is (= 2 (count (all)))))

;;(deftest test-create
;;  (is (. "Home" String/equals (:name (create {:name "Home"}))))
;;  (is (. "Business" String/equals (:name (create {:name "Business"})))))

;;(deftest test-get-name
;;  (is (. "Home" String/equals (:name (first (get-name 1))))))

(deftest test-get-tdl-mdb
  (is (= "Home" (:name (get-tdl-mdb)))))

(deftest test-get-all-tdl-mdb
  (is (= 2 (count (get-all-tdl-mdb)))))

