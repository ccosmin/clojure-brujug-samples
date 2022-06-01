(ns samples.flowcontrol)

(if true "returns this")
(if true "returns this" "else branch")

(if-not true "not returned" "else branch")

(when true "return this value")
(when-not false "return this value")

(do 
  (println "this is printed to standard out")
  "this is returned")

(defn fact [n]
  (if (= n 1) 
    1M
    (* n (fact (dec n)))))

(fact 100000)

(defn fact [n]
  (loop [current n 
         fact 1M]
    (if (= current 1)
      fact
      (recur (dec current) (* current fact)))))

(fact 1000000)

; list comprehension
(for [x [1 2 3]
      y [1 2 3]]
  (* x y))

(for [x (range 1 100)
      :let [y (* x x)]
      :when (< y 100)]
  x)
