(ns samples.symbols)

+

(class +)

str

true

false

nil

(if nil "nil is true" "nil is false")
(if `() "empty list is true" "empty list is true")
(if [] "empty vector is true" "empty vector is false")
(if 0 "zero is true" "zero is false")

(nil? nil)
(true? false)
(true? true)
(true? [])

(zero? 0)
