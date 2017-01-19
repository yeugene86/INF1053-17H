val xs = List(1,2,3)

println(xs(1))

xs.head :: List(2,3)

xs.foreach(x => println(x))


// Range
1 to 5
1 until 6
(1 to 10 by 3).map(2*_)

()

() => 1 + 3

for (x <- xs) yield println(x)

for (x <- xs if x%2 == 0) yield x*10

xs.filter(x => x%2==0).map(y => y * 10)

xs.filter(_%2==0).map(10*)

val ys = List(9.1,10.4,11.5)

for ((x,y) <- xs zip ys) yield x*y

(xs zip ys). map { case (x,y) => x*y }

for (x <- xs; y <- ys) yield x*y

xs flatMap {x => ys map {y => x*y}}

// map of map different de flatMap
for (x <- xs) yield {
  for (y <- ys) yield {
    x*y
  }
}

for (x <- xs; y <- ys) {
  println("%d/%.1f = %.1f".format(x,y, x*y))
}










