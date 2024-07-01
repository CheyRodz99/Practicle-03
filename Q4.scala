object Q4 {
  private def sumofEvennumbers(numbers:List[Int]): Int = {
    numbers.filter(num => num%2 == 0).sum
  }
  def main(args: Array[String]): Unit = {
    val numbers:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    val sumofEven:Int = sumofEvennumbers(numbers)

    println(s"The sum of even numbers in the $numbers is : "+sumofEven)
  }
}
