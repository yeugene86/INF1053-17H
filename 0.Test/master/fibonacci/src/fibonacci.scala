/**
  * Created by Julien on 2/1/2017.
  */
class fibonacci {
  var val1: Int = 1
  var val2: Int = 0

  def f(f1: Int, f2: Int) ={
    val1 = f1 + f2
    val2 = f1
  }

  var x: Int = 0
  for (x <- 1  to 20){
    println(val1)
    f(val1,val2)
  }
}
