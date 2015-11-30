
abstract class IntSet {
  def contains(x: Int): Boolean

  def incl(x: Int): IntSet
}

object Empty extends IntSet {

  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NotEmpty(x, Empty, Empty)
  override def toString = "."
}

class NotEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NotEmpty(elem, left incl x, right)
    else if (x > elem) new NotEmpty(elem, left, right incl x)
    else this

  override def toString = "{" + left + " " + elem + " " + right + "}"
}

object intSets {

  def main(args: Array[String]) {

    val t1 = new NotEmpty(8, Empty, Empty)
    val t2 = t1 incl 5
    val t3 = t1 incl 9

    println(t1)
    println(t2)
    println(t3)
  }
}
