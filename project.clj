(defproject clojure-postegres "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [seancorfield/next.jdbc "1.2.659"]
                 [org.postgresql/postgresql "42.2.6"]]
  :repl-options {:init-ns clojure-postegres.core})
