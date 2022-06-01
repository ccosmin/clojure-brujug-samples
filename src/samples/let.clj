(ns samples.let)

(let [a 0
      s "a string"]
  s)

(let [a 0]
  (let [a 1]
    (println a))
  a)

