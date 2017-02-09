package Singleton

/**
  * Created by Julien on 2/6/2017.
  */
class _Signleton {

}

object  _Signleton{

  //  def getInstance(): Unit = {}

  def demoMethod() = {
    System.out.println("demoMethod for signleton")
  }
}

object SingletonScalaDemo{
  def main(args: Array[String]): Unit = {
    _Signleton.demoMethod()
  }
}

