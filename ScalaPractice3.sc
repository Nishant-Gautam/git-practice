println("HelloWorld")

//Functions
def squareIt(x:Int) : Int = {
  x*x
}

def cubeIt(x:Int) : Int = {
  x*x*x
}

println(squareIt(6))
println(cubeIt(6))

//Functions can take other functions as parameters
def transformInt(x:Int, f: Int => Int): Int = {
  f(x)
}

val result = transformInt(5, cubeIt)
print(result)

transformInt(10, x => x*x*x)

transformInt(10, x => x/2)

transformInt(3, x => {val y = x*2; y*y})

val n = 10
println(n)

def fibonacci(x:Int): Unit = {
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

fibonacci(5)

// Exercise

