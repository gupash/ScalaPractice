import scala.annotation.tailrec

// Greatest Common Divisor - Tail Recursion
def gcd(num1: Int, num2: Int): Int =
  if (num2 == 0) num1
  else gcd(num2, num1 % num2)
gcd(28, 7)


/*
  GCD with tail Rec - If the tail rec annotation is
  given and the function is not tail recursive,
  compile time error is thrown
*/
@tailrec
def gcdW(num1: Int, num2: Int): Int =
  if (num2 == 0) num1
  else gcdW(num2, num1 % num2)
gcdW(25, 5)


//Factorial
def factorial(num: Int): Int = if (num == 0) 1 else num * factorial(num - 1)
factorial(3)

//Factorial with Tail Recursion (But have to pass accumulator)
@tailrec
def fact(num: Int, acc: Int): Int = {
  if (num == 0) acc else fact(num - 1, num * acc)
}
fact(5, 1)

//Factorial with Tail Recursion without external provided acc
def factR(num: Int): Int = {
  def loop(num: Int, acc: Int): Int =
    if (num == 0) acc else loop(num - 1, num * acc)
  loop(num, 1)
}
factR(4)