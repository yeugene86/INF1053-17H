//Pattern Matching

val verite = true

if (verite) println("Real News")

else println("Fake news")


verite match {
  case true =>
    println("Real News")
  case false =>
    println("Fake News")
}

case class Veritee()

val news = new Veritee()

news match{
  case Veritee() =>
    println("Real News")
  case _ =>
    println("Fake News")
}
