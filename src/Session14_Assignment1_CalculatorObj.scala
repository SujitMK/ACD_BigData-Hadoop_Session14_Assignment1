

object Session14_Assignment1_CalculatorObj {
  
  // main method/object
  
  def main(args: Array[String]): Unit = {

    val calc: Session14_Assignment1_Calculator = new Session14_Assignment1_Calculator
    
    println("")
    println( "****************  CALCULATOR BASIC FUNCTIONALITY DEMONSTRATION  ****************" )
    println("")
    
    println("** For Whole Numbers")
    println("")
    
    //Using calculator for whole number operations
    println( "The Addition Of 100 + 50 = "+ calc.add(100,50) )
    println("")

    println( "The Subtraction Of 100 - 50 = "+ calc.sub(100,50) )
    println("")

    println( "The Multiplication Of 100 x 50 = "+ calc.multi(100,50) )
    println("")

    println( "The Division Of 100 ÷ 50 = "+ calc.div(100,50) )
    println("")

    // Using calculator for rational number operations.
    
    println("** For Rational Numbers")
    println("")
    
    println( "The Addition Of 2/4 + 1/6 = "+ calc.add((2,4),(1,6)).productIterator.toList.mkString("","/","") )
    println("")

    println( "The Subtraction Of 1/3 - 6/7 = "+ calc.sub((1,3),(6,7)).productIterator.toList.mkString("","/",""))
    println("")

    println( "The Multiplication Of 9/5 x 15/9 = "+ calc.multi((9,5),(15,9)).productIterator.toList.mkString("","/","") )
    println("")

    println( "The Division Of 7/9 ÷ 3/2 = "+ calc.div((7,9),(3,2)).productIterator.toList.mkString("","/","") )
    println("")
  }
}
