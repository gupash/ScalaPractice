package dataimpl

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

