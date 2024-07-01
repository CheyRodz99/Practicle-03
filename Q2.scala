object Q2 {
  private def newList(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val myList: List[String] = List("Hello", "Scala", "Programming", "is", "Really", "Awesome")
    val mynewList: List[String] = newList(myList)
    println("Filtered List : " + mynewList)
  }
}
