import scala.io.StdIn

object Q3 {
  private def calculateAverage(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.0
    val scaledAverage = average * 100
    val roundedAverage = Math.round(scaledAverage)
    roundedAverage / 100.0
  }

  def main(args: Array[String]): Unit = {
    print("Enter the first Number : ")
    val num1: Int = StdIn.readInt()
    print("Enter the second Number : ")
    val num2: Int = StdIn.readInt()

    println("The Average of two numbers are : " + calculateAverage(num1, num2))
  }
}
