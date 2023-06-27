// to comment

//VALUES are immutable constants.
val hello: String = "Nameste!"

// VARIABLES are mutable
var helloThere: String = hello
helloThere +=  " Scala!"
println(helloThere)

val immutableHelloThere = helloThere + " There"
print(immutableHelloThere)

val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.146297123
val piSinglePrecision: Float = 3.1463292123F
val bigNumber = 123456789
val smallNumber: Byte = 127

println("Getting started with Scala " + immutableHelloThere)

println(f"Pi is about $piSinglePrecision%.3f")

println(f"Zero padding on the left: $numberOne%05d")

println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

println(s"I can be used to include any expression; like ${2+33}")

val theUltimateAnswer: String = "To life, the 361 universe, and number 42 64"

val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

//Booleans
val isGreater = 1>2
val isLesser = 1<2
val impossible = isGreater & isLesser
val anotherWay = isGreater && isLesser
val andAnotherWay = isGreater || isLesser

val neo: String = "Neo"
val bestSuperHero: String = "Neo"
val isBest: Boolean = neo == bestSuperHero

//Assignment
// take value of pi and then prints it within a string with three decimal places
//of precision to the right
val doublePi: Double = pi * 2;
println(f"$pi%.3f multipled by 2 is $doublePi%.3f")



