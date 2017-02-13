var val1: Int = 1
var val2: Int = 0

def f(f1: Int, f2: Int) ={
  val1 = f1 + f2
  val2 = f1
}

var x = 0
for (x <- 1  to 20){
  print(val1 + " ")
  f(val1,val2)
}


def fibo(fib1: Int):Int={
  if (fib1 == 0){
    0
  }else{
    if(fib1 == 1){
      1
    }else{
      fibo(fib1-1)+fibo(fib1-2)
    }
  }
}
fibo(10)

var  fiArray = Array(0,1)

def fibTable(num: Int): Unit={
  fiArray(num) = fiArray(num-1) + fiArray(num-2)
}
fibTable(2)