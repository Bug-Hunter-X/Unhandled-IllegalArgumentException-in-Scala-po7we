```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    try {
      if (x > 0) {
        x + y
      } else {
        throw new IllegalArgumentException("x must be positive")
      }
    } catch {
      case e: IllegalArgumentException => {
        println("Error: " + e.getMessage())
        0 // Or handle the error appropriately
      }
    }
  }
}

val obj = new MyClass(-1)
val result = obj.myMethod(5)
println(result) //Prints 0
val obj2 = new MyClass(1)
val result2 = obj2.myMethod(5)
println(result2) //Prints 6
```