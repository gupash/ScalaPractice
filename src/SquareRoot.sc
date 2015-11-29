//Square Root Function

def isGoodEnough(guess: Double, num: Double): Boolean = math.abs(guess * guess - num) / num < 0.001
def improve(guess: Double, num: Double): Double = (guess + num / guess) / 2
def sqrIter(guess: Double, num: Double): Double =
  if (isGoodEnough(guess, num)) guess
  else sqrIter(improve(guess, num), num)

def sqrt(num: Double) = sqrIter(1, num);
sqrt(4)

/*
    Square root Function with "Function in Function" approach,
    to limit the visibility of other functions so
    that only sqrt function is visible
*/

def sqrtSim(num: Double) = {
  def isGoodEnough(guess: Double, num: Double): Boolean = math.abs(guess * guess - num) / num < 0.001
  def improve(guess: Double, num: Double): Double = (guess + num / guess) / 2
  def sqrIter(guess: Double, num: Double): Double =
    if (isGoodEnough(guess, num)) guess
    else sqrIter(improve(guess, num), num)
  sqrIter(1, num)
}
sqrtSim(9)

/*
    "Function in Function" approach,
    with Reduction in duplicate parameters since
    inner methods can access outer parameters
*/
def sqrtRed(num: Double) = {
  def isGoodEnough(guess: Double): Boolean = math.abs(guess * guess - num) / num < 0.001
  def improve(guess: Double): Double = (guess + num / guess) / 2
  def sqrIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrIter(improve(guess))
  sqrIter(1)
}
sqrtRed(9)


