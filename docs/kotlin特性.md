## Lambda 表达式的语法
Lambda 表达式是 Kotlin 中实现高阶函数的一种方式。高阶函数是指能够接收其他函数作为参数或将函数作为返回值的函数。而 Lambda 表达式则是一种可以被传递和操作的匿名函数。
在 Kotlin 中，Lambda 表达式可以直接作为高阶函数的参数，这使得高阶函数的调用更加简洁和灵活。使用 Lambda 表达式，我们可以避免在调用高阶函数时重复定义一个新的函数。
简单介绍一下kotlin中的Lambda，
在 Kotlin 中，Lambda 表达式的语法是使用花括号 {} 包裹参数列表和代码块，中间用 -> 连接。具体语法如下：
```
{ 参数列表 -> 代码块 }
```
其中，参数列表可以为空，也可以包含一个或多个参数，每个参数都包含一个参数名和类型，用冒号 : 分隔。代码块可以包含一条或多条语句，如果只有一条语句，则可以省略花括号。Lambda 表达式的返回值类型可以自动推导出来，也可以使用 return 关键字显式指定返回值。

#### 不带参数的 Lambda 表达式
```
val sayHello = { println("Hello, world!") }
sayHello()
```
#### 带一个参数的 Lambda 表达式
```
val double = { n: Int -> n * 2 }
println(double(5))
```
#### 带多个参数的 Lambda 表达式
```
val sum = { a: Int, b: Int -> a + b }
println(sum(3, 5))
```
#### 带返回值的 Lambda 表达式
```
val greater = { a: Int, b: Int -> if (a > b) a else b }
println(greater(3, 5))
```
#### 带类型推导的 Lambda 表达式
```
val list = listOf(1, 2, 3, 4, 5)
val evenList = list.filter { it % 2 == 0 }
println(evenList)
```
写时稍微注意的地方
如果 Lambda 表达式的参数列表只有一个参数，可以省略参数名，并用 it 代替参数名。例如：
 ```
val list = listOf(1, 2, 3)
list.forEach { println(it) }
```
如果 Lambda 表达式的参数列表为空，可以用空括号表示。例如：
```
val action = { println("Hello") }
```

如果 Lambda 表达式的主体只有一条语句，可以省略花括号。例如：
```
val sum = { x: Int, y: Int -> x + y }
```
 Lambda 表达式可以有多个语句，这时需要用花括号包裹起来，并用 return 关键字返回结果。例如：
 ```
val max = { x: Int, y: Int ->
    val temp = if (x > y) x else y
    temp
}
```
Lambda 表达式可以定义在函数外部，并且可以被命名和赋值。例如：
```
val myLambda: (Int) -> Int = { x -> x * x }
```
## 函数引用的使用
函数引用是指将一个函数作为参数传递或者将其赋值给一个变量或者属性的方式。函数引用可以使代码更加简洁、易于阅读和维护。
常见的引用方法
#### 引用顶层函数：
```
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter(::isEven)
    println(evenNumbers)
}

fun isEven(number: Int) = number % 2 == 0
```
使用 :: 操作符引用了 isEven 函数，并将其传递给了 filter 函数。这样做可以使代码更加简洁，不需要定义一个 lambda 表达式来过滤偶数。
#### 引用对象的成员函数：
```
data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.map(Person::name)
    println(names)
}
```
使用 :: 操作符引用了 Person 类的 name 属性，并将其传递给了 map 函数。这样做可以使代码更加简洁，不需要定义一个 lambda 表达式来提取人名。
#### 引用构造函数：
```
data class Person(val name: String, val age: Int)

fun main() {
    val createPerson = ::Person
    val person = createPerson("Alice", 29)
    println(person)
}
```
使用 :: 操作符引用了 Person 类的构造函数，并将其赋值给了一个变量。然后我们使用这个变量来创建一个 Person 对象。