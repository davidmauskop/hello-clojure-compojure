(ns hello-compojure.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app
  (GET "/" [] "Hello, world!")
  (GET "/health-check" [] "")
  (route/not-found "Not Found"))
