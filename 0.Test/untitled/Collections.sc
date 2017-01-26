val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
numbers(3)
//On ne peut pas faire cela car les variables sont immutables
//numbers(3) = 10

0 +: numbers :+ 4

//
val xs = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
//Pour rajouter au debut de la liste le nombre 6
6 :: xs
//Pour ajouter a la fin sans faire un liste non flat.
0 +: xs :+ 6

//Set does not keep the order and does have duplicates
val xsx = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

xsx +6

val hostPort = ("localhost", 80)
hostPort._1
//Il prend le pattern qui match. Pattern Matching. Tres important
hostPort match {
  case ("localhost", port) => println("My",port)
  case (host, port) => host
}

//Creation d'un petit tuple
//1->2
"localhost " -> 80 match {
case ("localhost", port) => println("My ",port)
case (host, port) => host
}

//Creation d'un map de Int
val ports = Map ("http" -> 80, "ftp" -> 21, "https"-> 443)
scala.language.postfixOps
ports.filter(("ftp" -> 21)==)
// Une autre option plus visuelle moins comme du chinois au bas
//   ports.filter(x=> ("ftp" -> 21)==x)

//ports.get("ftp")
//On peut aussi dire Car le fondateur de scala voulait que
// Scala soit un Domain Specific Language
//ports get "ftp"
val portFTP = ports.get("ftp")

portFTP.isDefined
portFTP.isDefined

//Ci-dessous ne se fait plus car ca vas aller pour trop longtemps
// if(portFTP != null && portFTP.equals(""))

//Il faut que ca soit synchrone.
portFTP match {
  case Some(21) => println("copie ton fichier")
  case None => println("pas de copie")
}


//MAP : Lambda function
xs.map((i: Int)=> i*2) //A un equivalent qui est:

def p(i:Int)=i*2 // Sortir le Lambda
xs.map(x => p(x)) //Quand on simplifie
xs.map(p(_))//Quand on simplifie
xs.map(p)// Finalement on a cela.


xs.foreach((i: Int)=> i*2)//foreach ne ramene jamais rien. Mais on
// peut le donner une valeur pour l'affecter a l'interieur

//Repartitionner les tableaux
val zs = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
zs.partition(_ % 2 == 0)//Faire deux tableau paires et impaires.

// Difference est que le zip te rend deux listes mais le partition
// les partitionnent
List(1, 2, 3).zip(List("a", "b", "c"))

xs.find((i: Int) => i > 0)// Unaire, ramene une seule valeur

List(List(1, 2), List(3, 4)).flatten // Contraire de Partition

val nestedNumbers = List(List(1, 2), List(3, 4)) // fait le flatten et le map ensemble
