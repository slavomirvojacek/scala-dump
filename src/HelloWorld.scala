object HelloWorld {
  def main(greeting: String) {
    println(greeting)
  }
}

var greeting: String = "Hello, World!"

HelloWorld.main(greeting)

object Greeter {
  def greet(name: String, surname: String) {
    println("\nWelcome")
    println(name + " " + surname)
  }
}

Greeter.greet("John", "Appleseed")
