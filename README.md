# hello-clojure-compojure

Deploy a basic server to [render.com](https://render.com) using
Clojure, with compojure and ring.

### Deployment

Fork this repo and click the button below.

[![Deploy to Render](https://render.com/images/deploy-to-render-button.svg)](https://render.com/deploy)

Render automatically redeploys the server when you push changes.

### Server logic

The main server logic is defined by this code (found in [src/hello_compojure/handler.clj](src/hello_compojure/handler.clj)):

```clojure
(defroutes app
  (GET "/" [] "Hello, world!")
  (GET "/health-check" [] "")
  (route/not-found "Not Found"))
```

The `/health-check` endpoint allows Render to execute zero-downtime deploys and
to automatically restart your server if it goes down.

### Local development 

Use `lein ring server` to run the server locally, with hot reloading set up by
default.

### References

- [render docs](https://render.com/docs)
- [compojure wiki](https://github.com/weavejester/compojure/wiki)
- [lein-ring plugin](https://github.com/weavejester/lein-ring)
- If you want to make this server more production-ready it may help to start with
  [ring-defaults](https://github.com/ring-clojure/ring-defaults).

### Acknowledgements

This code was adapted from the Leiningen template for compojure:
[compojure-template](https://github.com/weavejester/compojure-template). Many
thanks to [James Reeves](https://github.com/weavejester), who wrote much of the most 
essential code that this project depends on.
