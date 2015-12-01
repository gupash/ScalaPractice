package demo

abstract class IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
  def union(other: IntSet): IntSet
}

object Empty extends IntSet {

  def contains(x: Int): Boolean = false // Can leave the return type Boolean here
  def incl(x: Int): IntSet = new NotEmpty(x, Empty, Empty)
  override def toString = "."
  def union(other: IntSet): IntSet = other
}

class NotEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def contains(x: Int): Boolean = // Can leave the return type Boolean here
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet = // Can leave the return type IntSet here
    if (x < elem) new NotEmpty(elem, left incl x, right)
    else if (x > elem) new NotEmpty(elem, left, right incl x)
    else this

  override def toString = "{" + left + " " + elem + " " + right + "}"

  def union(other: IntSet): IntSet = ((left union right) union other) incl elem
}

object intSets {

  def main(args: Array[String]) {

    val t1 = new NotEmpty(8, Empty, Empty)
    val t2 = t1 incl 5
    val t3 = t1 incl 9

    println(t1)
    println(t2)
    println(t3)

    println(t2 contains 5)
    println(t3 union t2)
  }
}
