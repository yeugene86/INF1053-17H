val v42 = 42
Some(3) match {
  case Some(`v42`) => println("42")
  case _ => println("Not 42")
}


val mesXs =List(1,2,3,4,5,6)

mesXs match {
    // :: pour reconnaitre la tete et la queue. Pour que la liste puisse reconnaitre ls tete et la queue.
  case x :: xs => println("c'est une liste")
    //Pour savoir si la liste est vide elle commance a Nil. pour remplir la liste,
    // on prend le Nil et le remplace par la valeur.
  case x :: Nil => println("c'est une tete")
  case Nil => println("c'est n'importe quoi")
}


// Il faut toujours utiliser case avant sinon ca ne mrche pas.
// Voici des exemples de classes.
case class Address(name:String, street: String)
case class Pays(name:String, code: Int)

  val maison = new Address(name = "ET", street = "Yonge")
  val madagascar = new Pays(name = "Madagascar", code = 261)

madagascar match {

  case Pays (name,code)=> println(name + ", " + code)
  case _ => println("Not an address") //the default case
}