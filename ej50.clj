(defn convertir_a_romano [n]
(let [romanos[[1000 "M"]
  [900 "CM"]
  [500 "D"]
  [400 "CD"]
  [100 "C"]
  [90 "XC"]
  [50 "L"]
  [40 "XL"]
  [10 "X"]
  [9 "IX"]
  [5 "V"]
  [4 "IV"]
  [1 "I"]]]

  (loop [num n num_convertido "" simbolos romanos]
    
    ;si 0 = fin

    ;sino  
    ;preg: el valor del primer romano es menor o igual que mi num?
    ;si:recur:  resto el valor a n, escribo esa letra en num_convertidos y vuelvo a dar una vuelta. 
    
    ;no: recur: volvemos a dar una vuelta sacando el primer valor de simbolos 
    
    
    
    )
)  
  
  
  )  
  
  
  