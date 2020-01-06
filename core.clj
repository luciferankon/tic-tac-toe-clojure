(ns tic-tac-toe.core)

(def winning-combinations #{[1 2 3] [4 5 6] [7 8 9] [1 4 7] [2 5 8] [3 6 9] [1 5 9] [3 5 7]})

(defn won?
  [moves]
  (let [is-superset? (->> moves
                          (into #{})
                          (partial every?))]
    (boolean (some is-superset? winning-combinations))))

(won? [1 2 3])