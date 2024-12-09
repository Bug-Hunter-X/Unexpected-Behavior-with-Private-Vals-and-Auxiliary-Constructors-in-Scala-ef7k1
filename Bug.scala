```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
}

val obj1 = new MyClass(5)
val obj2 = new MyClass()

println(obj1.value) // Output: 5
println(obj2.value) // Output: 0

class MyOtherClass(private val value: Int) {
  def this() = this(0)
  def getValue: Int = value // Accessor method
}

val obj3 = new MyOtherClass(10)
val obj4 = new MyOtherClass()

println(obj3.getValue) // Output: 10
println(obj4.getValue) // Output: 0
```