val v42 = 42
Some(`v42`) match {
  case Some(`v42`) => println("42")
  case _ => println("Not 42")
}

val mesXs = List(1,2,3)

mesXs match {
  case x :: xs =>
    println("la tete est",x)
    println("la queue est",xs)
  case Nil => println("n'importe quoi")
}

case class Address(name: String, street: String)
case class Pays(name: String, code: Int)

val maison = new Address(name = "ET", street = "Yonge")
val madagascar = new Pays(name = "Madagascar", code = 261)

madagascar match {
//  case Address(name, street) => println(name + ", " + street)
  case Pays(name, code) => println(name + ", " + code)
  case _ => println("not an address") // the default case
}







