import scalaz.Memo
lazy val fib: Int => BigInt = Memo.mutableHashMapMemo {
  case 0 => 0
  case 1 => 1
  case n => fib(n-2) + fib(n-1)
}