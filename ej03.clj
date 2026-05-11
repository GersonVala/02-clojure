; Definir la función sig-mul-10 que reciba un número entero y devuelva el primer
; múltiplo de 10 que lo supere


; funcion sigmult10 (numero)
;(siguiente multiplo de 10)
; mod devuelve el resto . Ejemplo mod 13 10 = 3
; restamos 10 - el resultado de mod (3) nos da la distancia que nos falta para el siguiente modulo.
; = 7 nos falta para llegar a 20, entonces sumamos el numero
(defn sig-mul-10 [a]

  (+ a (- 10 (mod a 10))))

(sig-mul-10 13)