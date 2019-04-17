(defproject bills-exerc "0.1.0-SNAPSHOT"
  :description "Billing Services for Mexico: learning purpose"
  :url "https://github.com/marcossimoes/bills-exerc"
  :license {:name "Proprietary"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot bills-exerc.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})