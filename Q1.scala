import scala.io.StdIn

object Q1 {
  private def reverseString(myString: String): String = {
    if (myString.isEmpty) ""
    else reverseString(myString.tail) + myString.head
  }

  def main(args: Array[String]): Unit = {
    print("Enter Your String : ")
    val oString: String = StdIn.readLine()
    val rString: String = reverseString(oString)

    println("Original String is : " + oString)
    println("Reversed String is : " + rString)
  }
}