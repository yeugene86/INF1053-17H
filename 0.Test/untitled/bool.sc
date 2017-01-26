// Petit commentaire
/*
Gros commentaire
 */

1 + 2

println("Hello, world!")

val list = List(1,2,3,4,5,6)

//Map reduce
list.filter(_%2==0)
//Deuxieme facon de l'ecrire
list.filter(x => x%2==0)

//mutability - Variables
//var x = 5
val x = 5

//Functional
//good define function
def f(x: Int) = { x*x }
f(1)
//Without the = its a Unit-returning procedure; cause havoc
def f1(x: Int) { x*x }
f1(1)

// Vaut mieux mettre n'importe quoi que de ne rien mettre
//good
def f2(x: Any) = println(x)
//bad : Manque de precicion
//def f3(x) = println(x)

type R = Double
def f4(x: R)= x+2.3
f4(5)


def g(x:   R => R, a: R) = x(a)
g(f4,5)

def h(x: => R) = x - 2.1
h(1)
//
h(g(f4,2))


def i(x:R)={x+1}
def j(x: => R) = x + 2.3
i(8)
j(i(8))
j{
  val c = 1.2
  c
}

//Lambda function .. Tres importante
(x:R) => x+1

//Est une facon plus facile de faire quand on a un lambda function
(1 to 5).map(_*2)
//La facon de faire originalement sans les raccourcis est
(1 to 5).map(x => x * 2)
// fonction importante
(1 to 5).reduceLeft( _+_ )
//est semblable a cela
(1 to 5).sum

import scala.language.postfixOps
//Est innitialement comme cela. Mais puisque cela est comme dire (x*2) semblable a (2*x)
(1 to 5).map(_*2)
//donc puisque tu peux le dire de 2 facons:
(1 to 5).map(2*)
//Mais on peut toujours le modifier:
(1 to 5).map(2*)

//Currying est deffinir 2 ensembles de parametres. ci-dessous on voit les 2 facons. une avec un esemble qui definit les parametres et l'autre en 2
val zscore_final = (mean:R, sd:R) => (x:R) => (x-mean)/sd
// val zscor.e(mean:R, x:R, sd:R) = (x-mean)/sd
// (1,2,3) -> Tuple

//sucre syntaxique pour opérateurs infixés.
//Le point dit que le + est une fonction de "Int" puisque le nombre "5" est un int

5.+(3); 5 + 3
(1 to 5) map (_*2)




