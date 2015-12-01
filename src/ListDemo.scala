
trait List[T]{

  def isEmpty : Boolean
  def head : T
  def tail : List[T]

  //def singleton[T] (elem : T) = new Cons[T](elem, new Nil[T])

}

/** Using val here in class parameters makes the class override the default methods from the trait */

class Cons[T] (val head : List[T],val tail : List[T]) extends List[T]{

  def isEmpty = false
}


class Nil[T] extends List[T] {

  override def isEmpty: Boolean = true

  // Here "Nothing" return type works because it is a sub type of every AnyRef sub class (here List) and as part of Polymorphism it can be passed
  override def head: Nothing = throw new NoSuchElementException("Nil.head")

  override def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}