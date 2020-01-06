(ns tic-tac-toe.core)

(defn incl? [list elem]
  (not (nil? (some #(= elem %) list)))
  )

(defn subset? [superset subset]
  (every? #(incl? superset %) subset)
  )

(def winning-combinations [[1 2 3] [4 5 6] [7 8 9] [1 4 7] [2 5 8] [3 6 9] [1 5 9] [3 5 7]])

(defn won? [moves]
  (not (nil? (some #(subset? moves %) winning-combinations)))
  )

(won? [1 2 3])