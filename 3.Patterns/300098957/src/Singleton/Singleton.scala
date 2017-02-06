package Singleton

/**
  * Created by to-boreal on 2017-02-06.
  */
class _Singleton {

}

// Companion Object
object _Singleton {
  def demoMethod( ): Unit = {
    System.out.println("demoMethod for singleton")
  }
}

object SingletonScalaDemo {
  def main(args: Array[String]): Unit = {
    _Singleton.demoMethod()
  }
}


