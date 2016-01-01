import java.util.Date

//Partially Applied functions
def date = new Date
val logWithDateBound = log(date, _ : String)

logWithDateBound("message1" )
Thread.sleep(1000)
logWithDateBound("message2" )
Thread.sleep(1000)
logWithDateBound("message3" )
def log(date: Date, message: String)  = {
  println(date + "----" + message)
}


//Functions with variable Arguments
def printMe(name: String*) = {
  for (elem <- name) {
    println(elem)
  }
}

printMe("Ashish", "Aman", "Rahul", "Sumit")


//Anonymous Functions
var printX = (x: String) => println(x)
val giveX = (x: Int) => x
printX ("Ashish")
val dig = giveX(5)


//Higher Order Functions - Functions which take other functions as arguments or return functions
def convertAndPrint(f: Int => String, v: Int) = f(v)
def layout(x: Int) = "["+x.toString+"]"
println(convertAndPrint(layout, 10))


/*Currying Functions - Transforms a function with multiple
  arguments into a chain of functions taking a single argument*/
def strcat1 (str1: String) (str2: String) = str1 + str2

//This second strcat2 form is not currying, this this just the use of anonymous
//functions which look like currying in this case
def strcat2 (str1: String) = (str2: String) => str1 + str2

strcat1("Ashish")("Gupta")
//this is the way to call currying functions if you don't want to pass all arguments as once
strcat1("Manjhi")_
strcat2("Amit")("tyagi")


//Closure
var factor = 3
val multiplier = (i:Int) => i * factor
println(multiplier(5))