import scala.io.Source

object Main {
  val greetingBegin: String = "Hello, "

  def main(args: Array[String]): Unit = {
    val name: String = args(0)

    println(greetingBegin + name)

    println("\n")
    println(getUniqueValues)

    ReadFile()
  }

  def ReadFile(): Unit = {
    println("\n\nFollowing is the content read of README.md:\n")

    Source.fromFile("../README.md").foreach {
      print
    }
  }

  def getUniqueValues: Set[String] = {
    val obj: Map[String, String] = Map("a" -> "Hello", "b" -> "World", "c" -> "Hello", "d" -> "World")

    return obj.values.toSet
  }
}