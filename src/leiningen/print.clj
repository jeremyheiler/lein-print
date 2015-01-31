(ns leiningen.print
  (:require [clojure.edn :as edn]
            [clojure.pprint :refer [pprint]])
  (:refer-clojure :exclude [print]))

(defn print
  "Print the project map or the specific value."
  [project & ks]
  (if (seq ks)
    (pprint (get-in project (map edn/read-string ks)))
    (pprint project))
  (flush))
