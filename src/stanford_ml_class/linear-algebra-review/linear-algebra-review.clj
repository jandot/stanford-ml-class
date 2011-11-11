(use '(incanter core io stats))

; define a vector A (= m x 1 matrix)
(def A (matrix [1 2 3 4 5]))
A

; get the 4th element
(sel A :rows 3)

; define a 4x3 matrix A. This happens row-by-row
(def A (matrix [[1 0][2 5][3 1]]))
A

;;;; Scalar addition, substraction, multiplication, division
(plus 5 A)
(minus 5 A)
(mult 5 A)
(div A 5)

;;;; Matrix addition, substraction
;;;; Scalar multiplication, division (again)
; B needs same dimensions as A
(def A (matrix [[1 0][2 5][3 1]]))
(def B (matrix [[4 0.5][2 5][0 1]]))
A
B
(plus A B)
(minus B A)
(mult 3 A)

(def C (matrix [[4 0][6 3]]))
(mult 1/4 C) ; = matrix division by 4

; Exercise
(mult 2 (matrix [[4 5][1 7]]))
(minus
	(mult 1/2 (matrix [4 6 7]))
	(mult 3 (matrix [2 1 0])))

; C needs same number of rows as A has number of columns (i.e. 3)
(def A (matrix [[1 3][4 0][2 1]]))
(def B (matrix [1 5]))
(mmult A B)

(def A (matrix [[1 2 1 5][0 3 0 4][-1 -2 0 0]]))
(def B (matrix [1 3 2 1]))
(mmult A B)

(def A (matrix [[1 0 3][2 1 5][3 1 2]]))
(def B (matrix [1 6 2]))
(mmult A B)

(def A (matrix [[1 2104][1 1416][1 1534][1 852]]))
(def B (matrix [-40 0.25]))
(mmult A B)

(def A (matrix [[1 3 2][4 0 1]]))
(def B (matrix [[1 3][0 1][5 2]]))
(mmult A B)

(def A (matrix [[1 3][2 4][0 5]]))
(def B (matrix [[1 0][2 3]]))
(mmult A B)

(def A (matrix [[1 2104][1 1416][1 1534][1 852]]))
(def B (matrix [[-40 200 -150][0.25 0.1 0.4]]))
(mmult A B)

;;; Identity matrix
(def A (matrix [[1 2 3][4 5 6]]))
(def I (matrix [[1 0 0][0 1 0][0 0 1]]))
(mmult A I)

;;;; Matrix inverse and transpose
(def A (matrix [[3 4][2 16]]))
(def B (solve A)) ; (solve) = inverse
B
(mmult A B) ; should return identity matrix

(def A (matrix [[1 2 0][3 5 9]]))
(trans A)
