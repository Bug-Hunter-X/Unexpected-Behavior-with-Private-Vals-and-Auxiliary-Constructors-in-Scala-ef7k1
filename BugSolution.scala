```scala
class MyOtherClass(private val value: Int) {
  def this() = this(0)
  def getValue: Int = value // Accessor method
}

val obj3 = new MyOtherClass(10)
val obj4 = new MyOtherClass()

println(obj3.getValue) // Output: 10
println(obj4.getValue) // Output: 0
```