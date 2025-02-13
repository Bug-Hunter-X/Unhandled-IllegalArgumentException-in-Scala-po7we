```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x > 0) {
      x + y
    } else {
      throw new IllegalArgumentException("x must be positive")
    }
  }
}

val obj = new MyClass(-1)
obj.myMethod(5)
```