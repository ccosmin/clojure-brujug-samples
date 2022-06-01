(defn fib []
  (map first 
       (iterate 
        (fn [[a b]] [b (+ a b)]) [0N 1N])))

(take 100 (fib))
