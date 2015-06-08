object HelloWorld {
  def main(greeting: String): Unit = println(greeting)
}

val greeting: String = "Hello, World!"

HelloWorld.main(greeting)

object Greeter {
  def greet(name: String, surname: String): Unit = {
    println("\nWelcome")
    println(name + " " + surname)
  }
}

Greeter.greet("John", "Appleseed")
