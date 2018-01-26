

class Session14_Assignment1_Calculator {
  
  // class to declare and define calculator 
  
  // Addition,Subtraction, Multiplication and Division methods for Whole numbers
  
  def add(n1:Int, n2:Int): Int = 
  {
    n1+n2
  }
  
  def sub(n1:Int, n2:Int): Int = 
  {
    n1-n2
  }
  
  def multi(n1:Int, n2:Int): Int = 
  {
    n1*n2
  }
  
  def div(n1:Int, n2:Int): Int = 
  {
    n1/n2
  }
  
   // Addition,Subtraction, Multiplication and Division methods for Rational numbers
  
  def add(n1:(Int, Int),n2:(Int, Int)) : (Int, Int) = 
  {
    simplify((n1._1*n2._2) + (n1._2*n2._1), (n1._2*n2._2))
  }
  
   def sub(n1:(Int, Int),n2:(Int, Int)) : (Int, Int) = 
  {
    simplify((n1._1*n2._2) + (n1._2*n2._1), (n1._2*n2._2))
  }
  
    def multi(n1:(Int, Int),n2:(Int, Int)) : (Int, Int) = 
  {
    simplify((n1._1*n2._1), (n1._2*n2._2))
  }
    
     def div(n1:(Int, Int),n2:(Int, Int)) : (Int, Int) = 
  {
    simplify((n1._1*n2._2) , (n1._2*n2._1))
  }
     
     // GCD of rational numbers
  def gcd(n1:Int, n2:Int): Int = 
  {

    val end:Int = if (n1 < n2) n1+1 else n2+1
    
    val div1 = List.range(1, end).filter(n1%_==0)
    val div2 = List.range(1, end).filter(n2%_==0)
    
    //Will consider all numbers in div2 those present in div1
    
    (for{n <- div2 if div1.contains(n)} yield n).max                 //Maximum number from div2 that present div1 is returned
  }
  
  def simplify (n1:Int, n2:Int): (Int, Int) = {

    val gcdValue:Int = gcd(Math.abs(n1),Math.abs(n2))                //Absolute values are passed in case any param is negative
    (n1/gcdValue, n2/gcdValue)
  }
  
}