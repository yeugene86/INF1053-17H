
val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

numbers(3) = 10

numbers(3)

0 +: numbers :+ 4

val xs = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

6 :: xs

0 +: xs :+ 6

val sxs = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

sxs + 6

val hostPort = ("localhost", 80)

hostPort._1

hostPort match {
  case ("localhost", port) => println("My ",port)
  case (host, port) => host
}

"localhost" -> 80

"localhost" -> 80 match {
  case ("localhost", port) => println("My ",port)
  case (host, port) => host
}

val ports = Map( "http" -> 80, "ftp" -> 21, "https" -> 443)

scala.language.postfixOps

ports.filter(("ftp" -> 21)==)

val portFTP = ports.get("ftp")

portFTP.isDefined
portFTP.isEmpty

//if (portFTP != null && portFTP.equals(""))

portFTP match {
  case Some(21) => println("copie ton fichier")
  case None => println("pas de copie")
}

xs.map((i: Int) => i * 2)

// sortir le lambda
def timesTwo(i: Int):Int = i * 2
// 3 appels equivalents
xs.map(x => timesTwo(x))
xs.map(timesTwo(_))
xs.map(timesTwo)

xs.foreach((i: Int) => i * 2)

val zs = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

zs.partition(_ % 2 == 0)

List(1, 2, 3).zip(List("a", "b", "c"))

xs.find((i: Int) => i > 0)

List(List(1, 2), List(3, 4)).flatten

val nestedNumbers = List(List(1, 2), List(3, 4))

nestedNumbers.flatMap(x => x.map(_ * 2))

