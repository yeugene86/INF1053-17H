import  week7._

/**
  * Created by Julien on 1/26/2017.
  */
object Solution {
  def main(args: Array[String]): Unit = {
    val problem = new WaterPouring(Vector(9,4))

    // Solution si la solution
//    problem.solutions(6).foreach(println)

    problem.solutions(2).foreach(println)
  }
}
