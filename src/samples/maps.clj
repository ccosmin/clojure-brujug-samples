(ns samples.maps)

{"one" 1 "two" 2}

({"one" 1 "two" 2} "one")

({"one" 1} "two")

(def mymap {"one" 1 "two" 2})

(get mymap "one")
(get mymap "three" "if-not-found")

:one

(def mymap {:one 1 :two 2})

(mymap :one)
(:one mymap)
mymap

(assoc mymap :five 5)
(dissoc mymap :one)

(def nestedmap {:l1 {:x "x" :y "y"} :l2 "level2"})
(get-in nestedmap [:l1 :x])
(select-keys nestedmap [:l2])

{:author "John Doe" :title "some title"}

(defrecord Book [author title])

(->Book "another author" "title")
