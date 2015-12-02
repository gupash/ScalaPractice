
object nth {

  /**
    * This method takes as Input the nth position of a list and returns the element at that location
    *
    * @param n Location of Element
    * @param xs List Object
    * @tparam T Type of List
    * @return Element at nth position
    */
  def nth[T](n : Int, xs : List[T]) : T =
    if(xs.isEmpty) throw new IndexOutOfBoundsException("List is Empty")
    else if(n == 0) xs.head
    else nth(n-1, xs.tail)

  def main(args: Array[String]) {

    // Declaring the list
    val myList = new Cons(6, new Cons(5, new Cons(6, new Cons(10, new Nil))))
    println("Is List Empty : "+myList.isEmpty)
    println("List Head : "+myList.head)
    println("List Tail : "+myList.tail)
    println("Loc of given element in list : "+nth(2, myList))
  }
}
