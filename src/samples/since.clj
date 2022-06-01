(ns samples.since)

(use 'clojure.test)

; Original version here:
; https://stackoverflow.com/questions/32511405/how-would-time-ago-function-implementation-look-like-in-clojure

(defn time-ago [time]
  (let [now (java.util.Date. (System/currentTimeMillis))
        diff-in-millis (- (.getTime now) (.getTime time))
        diff (quot diff-in-millis 1000)
        units [{:name "second" :limit 60 :in-second 1}
               {:name "minute" :limit 3600 :in-second 60}
               {:name "hour" :limit 86400 :in-second 3600}
               {:name "day" :limit 604800 :in-second 86400}
               {:name "week" :limit 2629743 :in-second 604800}
               {:name "month" :limit 31556926 :in-second 2629743}
               {:name "year" :limit Long/MAX_VALUE :in-second 31556926}]]
    (if (< diff 5)
      "just now"
      (let [unit (first (drop-while #(or (>= diff (:limit %))
                                         (not (:limit %))) 
                                    units))]
        (-> (/ diff (:in-second unit))
            Math/floor
            int
            (#(str % " " (:name unit) (when (> % 1) "s") " ago")))))))


(samples.since/time-ago (new java.util.Date 1640860312000))

(deftest justnow
  (is (= (time-ago (new java.util.Date)) "just now")))

(deftest some-days-behind
  (let [day (* 24 60 60 1000)
        four-days (* 4 day)
        current-time (.getTime (new java.util.Date))
        four-days-ago (- current-time four-days)]
    (is (= (time-ago (new java.util.Date four-days-ago)) "3 days ago"))))


; Run tests:
(clojure.test/run-tests 'samples.since)
