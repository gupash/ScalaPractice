//Array Declaration 1
var myArray : Array[String] = new Array[String] (3)
myArray(0) = "Ashish"
myArray(1) = "Amit"
myArray(2) = "Rahul"

myArray.foreach(println)

//Array Decalaration 2
var uArray = new Array[Int](3)
uArray(0) = 1
uArray(1) = 2
uArray(2) = 3

//Array Declaration 3
var tarray = Array("Ashish", "Amit", "Anshul")
var mtarray = Array(1,2,3)

//Traversing array and general for loop
for (elem <- tarray) {
  println(elem)
}

mtarray.foreach(println)

for(i <- 1 to 5){
  println(i)
}

var x = List(1,2,3)

val y = List("Ashish", "Amit", "Aman")

val myset = Set(1,4,6,8,9)

val myMap = Map("Ashish" -> 1, "Amit" -> 2, "Aman" -> 3)

//Tuple
val myTuple = (1, "Ashish")

//Option class in scala
val isThere: Option[Int] = Some(5)




