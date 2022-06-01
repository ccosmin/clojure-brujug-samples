(ns samples.seq)

(seq '(1 2 3 4 5))

(cons 4 (seq '(1 2 3 4 5)))

(def v (take 10 (iterate inc 1)))

v

(first v)
(rest v)
(cons 11 v)

(rest [])
(next [])

; test if collection is empty
(seq [])

(if (seq []) "collection not empty" "collection empty")

(class (.listFiles (java.io.File. ".")))

(map #(.getName %) (.listFiles (java.io.File. ".")))

(take-while (fn [arg](< arg 4)) v)
(drop-while #(< % 4) v)
