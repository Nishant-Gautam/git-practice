def reverse(num: Int): Int = {
  var temp = 0
  var copyNum = num

  while(copyNum > 0){
    temp = temp * 10 + (copyNum%10)
    copyNum /= 10
  }
  println(temp)
  temp
}

def checkPalindrome(num: Int): Boolean = {
  val temp = reverse(num)

  var ans = temp == num
  println("palindrome? " + ans)
  ans
}

val num = 1221
val result = checkPalindrome(num)
