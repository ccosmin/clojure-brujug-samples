(ns samples.functions)

+

(fn [] "result")

((fn [] "result"))

(defn myfunc [] "result")
(myfunc)

(def myfunc (fn [] "result"))
(myfunc)

(defn f [] (println "XXXX"))

(defn myfunc
  "This function does nothing"
  [] "")

#(str "result")
(#(str "result"))

(clojure.string/split "Val,1,2,3,4" #",")
