(defproject congomongo
  "0.5.2"
  :description "Clojure-friendly API for MongoDB"
  :url "https://github.com/congomongo/congomongo"
  :mailing-list {:name "CongoMongo mailing list"
                 :archive "https://groups.google.com/forum/?fromgroups#!forum/congomongo-dev"
                 :post "congomongo-dev@googlegroups.com"}
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"
            :distribution :repo}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/data.json "0.2.6"]
                 [org.mongodb/mongo-java-driver "3.6.3"]
                 [org.clojure/clojure "1.9.0" :scope "provided"]]
  ;; if a :dev profile is added, remember to update :aliases below to
  ;; use it in each with-profile group!
  :profiles {:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10 {:repositories [["snapshots" "https://oss.sonatype.org/content/repositories/snapshots/"]]
                   :dependencies [[org.clojure/clojure "1.10.0-master-SNAPSHOT"]]}}
  :aliases {"test-all" ["with-profile" "default:1.4,default:1.5,default:1.6,default:1.7,default,default:1.8:default,1.9:default,1.10" "test"]})
