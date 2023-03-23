; #1
(defn slope 
  "Takes 2 lists, calculates slope."
  [one two]
  (/
   (- (last one) (last two))
      (- (first one) (first two))
))

; #2
(defn square?
  "True if num given is square of integer."
  [n]
  (true? (== n
  (Math/pow (Math/floor (Math/sqrt n)) 2))
  )
)

; #3
(defn replace-first 
  "Replaces first item in list with given item."  [li givenlist]
  (if (empty? givenlist)
      '()
  (cons li (rest givenlist)))
  )

; #4
(defn all-odd?
  "True if all items in list are odd."
  [givenlist] 
  (if (empty? givenlist)
    true
  (if(odd? (first givenlist))
      (all-odd? (rest givenlist))
    false))
)

; #5
(defn filter-odd
  "Returns list with only odds from original"
  [otters] 
  (if (empty? otters)
      '()
  (if (odd? (first otters))
    (cons (first otters) (filter-odd (rest otters)))
  (filter-odd (rest otters))))
)

; #6
(defn product
  "Returns product of all nums in list"
  [shrek]
  (if (empty? shrek)
      1
  (* (first shrek) (product (rest shrek))))
)

; #7
(defn smallest
  "Returns smallest number in list" 
  [xs]

 (if (= 1 (count xs))
   (first xs)
   
 (if (<= (first xs) (smallest (rest xs)))
   (first xs) 
   (smallest (rest xs)))
 )
)

; #8
(defn remove-first
  "First instance of given number removed from list."
  [q nodup] 

  (if (empty? nodup)
      '()
    
  (if (= q (first nodup))
      (rest nodup)
    
      (cons (first nodup) (remove-first q (rest nodup)))
    ))
  )

; #9
(defn selection-sort 
  "Recursive selection sort."
  [squid]
  (if (empty? squid)
    squid

(cons 
(smallest squid)
(selection-sort 
 (remove-first   
    (smallest squid) squid)
 ))))

  
