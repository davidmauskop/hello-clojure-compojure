(ns hello-compojure.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [hello-compojure.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello, world!"))))

  (testing "health check"
    (let [response (app (mock/request :get "/health-check"))]
      (is (= (:status response) 200))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
