def sieveOfEratosthenes(n: Int): Array[Boolean] = {
  val primes = Array.fill(n + 1)(true)
  primes(0) = false
  primes(1) = false

  for (p <- 2 to Math.sqrt(n).toInt if primes(p)) {
    for (i <- p * p to n by p) {
      primes(i) = false
    }
  }
  primes
}

def printPrimeNumbers(n: Int): Unit = {
  val primes = sieveOfEratosthenes(n)
  for (i <- 2 until primes.length if primes(i)) {
    println(i)
  }
}


val n = 50
printPrimeNumbers(n)

