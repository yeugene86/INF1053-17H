def memoize[I, O](f: I => O): I => O = new mutable.HashMap[I, O]() {self =>
  override def apply(key: I) = self.synchronized(getOrElseUpdate(key, f(key)))
}

lazy val fib: Int => BigInt = memoize {
  case 0 => 0
  case 1 => 1
  case n => fib(n-1) + fib(n-2)
}

// is there a subset of s which has sum = t
def isSubsetSumAchievable(s: Vector[Int], t: Int) = {
  // f is (i, j) => Boolean i.e. can the first i elements of s add up to j
  lazy val f: ((Int, Int)) => Boolean = memoize {
    case (_, 0) => true        // 0 can always be achieved using empty list
    case (0, _) => false       // we can never achieve non-zero if we have empty list
    case (i, j) =>
      val k = i - 1            // try the kth element
      f(k, j - s(k)) || f(k, j)
  }
  f(s.length, t)
}