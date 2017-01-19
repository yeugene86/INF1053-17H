// Petit commentaire
/*
Gros commentaire
 */

1 + 2

println("Hello, world!")

val list = List(1,2,3,4,5,6)

//Map reduce
list.filter(_%2==0)

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


def x