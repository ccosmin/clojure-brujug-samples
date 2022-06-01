(ns samples.threadingmacros)

(-> "a very long string" 
    .toUpperCase 
    (clojure.string/split #" "))

(->> ["a" "split" "very" "long" "string"]
     (filter #(> (count %) 2))
     (map #(.toUpperCase %))
     (reduce str))
