//Fibonacci sequence
//f(0) = 0. f(1) = 1; f(x) = f(x-1) + f(x-2)
//0,1,1,2,3,5,8,13,


def fibonacci(x:Int): Unit = {
  if(x<1){
    println("Invalid Input!!")
    return
  }
  var idx = x
  var first = 0
  var second = 1
  while(idx>=0){
    val temp = first + second
    println(s"$temp")

    first = second
    second = temp
    idx -= 1
  }

}

fibonacci(6)
fibonacci(0)
fibonacci(7)
fibonacci(1)