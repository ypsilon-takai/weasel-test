(defproject cljs-repl-test "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://exampl.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2665"]
                 [compojure "1.1.8"]
                 [hiccup "1.0.5"]
                 [domina "1.0.2"]
                 [cheshire "5.3.1"]
                 [cljs-ajax "0.3.3"]
                 [org.clojure/tools.nrepl "0.2.5"]
                 [cider/cider-nrepl "0.8.1"]
                 [com.cemerick/piggieback "0.1.5"]
                 [weasel "0.5.0"]]
  :cljsbuild {:builds [{}]}
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :main ^{:skip-aot true} cljs-repl-test.server)
