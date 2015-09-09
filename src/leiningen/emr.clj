(ns leiningen.emr
  (:require [amazonica.aws.elasticmapreduce :as emr]))

(defn ^:no-project-needed emr
  "I don't do a lot."
  [project & args]
  (println "Listing clusters")
  (prn (emr/list-clusters)))
