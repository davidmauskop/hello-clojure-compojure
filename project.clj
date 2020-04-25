(defproject hello-compojure "0.1.0-SNAPSHOT"
  :description "A 'hello, world' server with compojure"
  :url "https://github.com/dmauskop/hello-clojure-compojure"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [compojure "1.6.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler hello-compojure.handler/app}
  :profiles {:dev {:dependencies [[ring/ring-mock "0.3.2"]]}})
