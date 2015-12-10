package dataimpl

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
