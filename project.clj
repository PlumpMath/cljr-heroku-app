(defproject cljr-heroku-app "1.0.0-SNAPSHOT"
  :description "cljr-heroku-app"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure.contrib/trace "1.3.0-SNAPSHOT"]
                 [ring/ring-jetty-adapter "0.3.11"]
                 [compojure "0.6.4"]
                 [congomongo "0.1.7"]
                 [hiccup "0.3.6"]]               
  :dev-dependencies [[swank-clojure "1.3.3"]
                     [lein-ring "0.4.5"]]
  :ring {:handler cljr.heroku.app.todo.core/application}
  :repositories {"sonatype-oss-public" "http://oss.sonatype.org/content/groups/public/"})
