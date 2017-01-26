//Le wild card est le " _ "
//
//val (k1,k2, k3,) = (1,2,3)
//println(k3)

val xs =List(1,2,3)
println(xs(2))
//il imprime la ou l'array est a son index pas le nombre meme.

//marche qui te donne la liste
xs.head :: List(2,3)
//Marche bizarement te donne la liste d'une liste.
xs.tail :: List(2,3)

xs.foreach(x => println(x))

1 to 5

1 until 6

(1 to 10 by 3).map(2*_)
()

()=> 1+2
for {x <- xs} yield println(x)
for (x <- xs if x%2 == 0) yield x* 10
//En sucre. Facon facile a comprendre.
xs.filter(x=> x%2 == 0).map(y => y *10)
//Enlever le sucre. "De-sugarizer"
xs.filter(_%2 == 0).map(10*)


val ys =List(9,10,11)

for ((x,y) <- xs zip ys) yield x*y
//est équivalent à
(xs zip ys) map { case (x,y) => x*y }
//pour chaque tuple il les prends et les multiplie
(xs zip ys)

//La meme chose. il les prends les tuples
// fait um map et le map cherche une Lambda function
// le case fait que si c'est un tuple il vas executer la multiplication
(xs zip ys) map { case (x,y) => x*y }
//LES "FOR" EN SCALA SONT PAS LES MEME QUE DANS LES AUTRES LANGUAGES


for (x <- xs; y <- ys) yield x*y
//est équivalent à
xs flatMap {x => ys map {y => x*y}}


