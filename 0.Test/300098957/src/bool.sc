
// Petit commentaire
/*
gros commentaire
 */

1 + 2

println("Hello wonderful world ")


val list = List(1,2,3,4,5,6)

list.filter(_%2==0)

type R = Double

def f(x: R) = x + 1

def g(x: => R) = x + 2.3

(x:R) => x + 1

(x:Int) => x%2==0


val (a:R, b:R) = (1.0,2.6) // tuple

println(a)

(1 to 5).map( x => x * 2)

(1 to 5).map(_*2)

(1 to 5).map(2*_)

import scala.language.postfixOps

(1 to 5).map(2*)


(1 to 5).reduce( (a,b) => a + b )

(1 to 5).reduceLeft( _+_ )

(1 to 5).sum

val (x:R) = 1.5 // uple

// currying

def zscore_final(mean:R, sd:R)(implicit x:R) = (x-mean)/sd

def zscore(mean:R, sd:R, x:R) = (x-mean)/sd

5.+(3); 5 + 3

6 *(3)

class Naturel {
  def *(x:Int) = x*3
}

val nat = new Naturel()

nat.*(3)

nat * 3

def sum(args: Int*) = args.sum

sum(1,2,3)

(1,2,3)

val (i1, i2, i3, i4) = (1,2,3,4)

println(i1)


