package dataimpl

object RegexTest {

    def main(args: Array[String]) {
      val pattern = "Scala".r
      val str = "Scala is Scalable and cool"

      val x = (pattern findPrefixMatchOf str).get
      println(x)
    }
}
