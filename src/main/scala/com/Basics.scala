package com

object Basics extends App {
    //defining a value
    val meaningOfLife: Int = 42//const int meaningOfLife = 42;
   // Int, Boolean, Char, Double, Float, String
    val aBoolean: Boolean = false // type is optional

    //strings and string operations
    val aString = "I love Scala"
    val aComposedString = "i" + " " + "love " + "Scala"
    val anInterpolatedString = s"The meaning of life is $meaningOfLife"

    // expressions = structures that can be reduced to a value
    val anExpression = 2 + 3
    /* In scala everything is a expression that can be reduced to a value */

    val ifExpression = if (meaningOfLife > 43) 56 else 999
    val chainedIfExpression =
      if (meaningOfLife > 43) 56
      else if (meaningOfLife < 0) -2
      else if (meaningOfLife > 999) 78
      else 0

    val aCodeBlock: Int = {
      //definitions
      val aLocalValue = 67

      //value of block is the value of the last expression
      aLocalValue + 3
    }

    val ey: Double = 1.0

  // define a function
    def myFunction(x: Int, y: String): String = y + " " + x // x is converted to string from scala

  // recursive functions
    def factorial(n: Int): Int =
      if (n <= 1) 1
      else n *  factorial(n -1)

    val h : Int= factorial(5)
  // In Scala we dont use loops or iteration, we use RECURSION!
  val k: Int = 2
  //the Unit type; value == 'void' in other languages
  // type of SIDE EFFECTS (for example println give Unit which means void in another languages)
  println("I love Scala")

  def myUnitReturningFunction(): Unit = {
    println("I dont love returning Unit")
  }
  val a: Unit  = myUnitReturningFunction()

}

