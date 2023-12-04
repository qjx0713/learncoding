

fun main() {
    /**
     *  map 函数：将集合中的每个元素都应用一个函数，并返回一个新的集合。
     */
    /*    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers) // 输出 [1, 4, 9, 16, 25]*/

    /**
     * filter 函数：返回一个新的集合，其中包含满足给定条件的所有元素。
     */
    /*    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // 输出 [2, 4]*/

    /**
     * reduce 函数：将集合中的所有元素合并成一个值，具体的合并方式由指定的函数决定。
     */
    /*    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.reduce { acc, i -> acc + i }
    println(sum) // 输出 15*/

    /**
     * fold 函数：与 reduce 函数类似，但是可以指定一个初始值。
     */
    /*    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.fold(0) { acc, i -> acc + i }
    println(sum) // 输出 15*/

    /**
     * forEach 函数：对集合中的每个元素执行指定的操作，没有返回值。
     */
    /*    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { println(it) } // 依次输出 1、2、3、4、5*/

    /**
     * groupBy 函数：根据指定的键将集合分组，返回一个 Map 对象。
     */
  /*  data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("Alice", 20),
        Person("Bob", 22),
        Person("Charlie", 20),
        Person("David", 25)
    )
    val groupedPeople = people.groupBy { it.age }
    println(groupedPeople) // 输出 {20=[Person(name=Alice, age=20), Person(name=Charlie, age=20)], 22=[Person(name=Bob, age=22)], 25=[Person(name=David, age=25)]}
*/
    /**
     * flatMap 函数：对集合中的每个元素应用一个函数，并将结果合并成一个新的集合。
     */
/*    val words = listOf("hello", "world", "kotlin")
    val chars = words.flatMap { it.toList() }
    println(chars) // 输出 [h, e, l, l, o, w, o, r, l, d, k, o, t, l, i, n]*/

    /**
     * sortedBy 函数：按照指定的排序规则对集合进行排序，并返回一个新的集合。
     */
/*    data class Person(val name: String, val age: Int)
    val people = listOf(
        Person("Alice", 20),
        Person("Bob", 22),
        Person("Charlie", 20),
        Person("David", 25)
    )
    val sortedPeople = people.sortedBy { it.age }
    println(sortedPeople) // 输出 [Person(name=Alice, age=20), Person(name=Charlie, age=20), Person(name=Bob, age=22), Person(name=David, age=25)]*/

    /**
     * takeWhile 函数：返回集合中从开始位置开始的连续元素，直到遇到第一个不满足给定条件的元素。
     */
/*    val numbers = listOf(1, 2, 3, 4, 5)
    val result = numbers.takeWhile { it < 3 }
    println(result) // 输出 [1, 2]*/

    /**
     *  any 函数：判断集合中是否存在满足给定条件的元素，返回一个布尔值。
     */
/*    val numbers = listOf(1, 2, 3, 4, 5)
    val result = numbers.any { it % 2 == 0 }
    println(result) // 输出 true*/

    /**
     * let 函数接收一个lambda表达式，其返回值为lambda表达式中最后一行的结果，let 函数的参数则被传递到lambda表达式中。该函数主要用于避免空指针异常，简化对可空对象的判空操作。
     */
/*    val str: String? = "Hello World"
    str?.let {
        // str不为null的情况下才会执行下面的语句
        println(it.length) // 输出 11
    }*/

    /**
     * also 函数和 let 函数很像，但是它返回的是调用对象本身，而不是最后一行的结果。also 函数的参数同样会传递到lambda表达式中。
     */
/*    val list = mutableListOf<Int>()
    list.also {
        // 对list进行一些操作，返回的是list本身
        it.add(1)
        it.add(2)
    }.also {
        // 进一步操作list，返回的还是list本身
        it.add(3)
    }
    println(list) // 输出 [1, 2, 3]*/

    /**
     * with 函数不是扩展函数，而是一个独立函数，它接收两个参数：一个对象和一个lambda表达式。lambda表达式中的代码可以直接访问该对象的属性和方法，从而省去了在每个语句中重复引用对象的麻烦。
     */

/*    data class Person(val name: String, var age: Int)

    val person = Person("Tom", 20)
    with(person) {
        age += 1
        println("My name is $name and I'm $age years old.")
    } // 输出 "My name is Tom and I'm 21 years old."*/


    /**
     * run 函数和 let 函数非常相似，它也是接收一个lambda表达式，返回的是lambda表达式中最后一行的结果，但它和 let 的区别在于它的调用对象可以通过 this 关键字访问，而不是通过lambda表达式的参数。
     */
/*    val str: String = "Hello World"
    val result = str.run {
        // 这里可以通过 this 访问 str 对象
        println(this) // 输出 "Hello World"
        length
    }
    println(result) // 输出 11*/

    /**
     * apply 函数和 also 函数也很相似，它同样返回调用对象本身，但是它不接受lambda表达式的参数，而是在lambda表达式中直接操作调用对象。
     */
    data class Person(var name: String, var age: Int)

    val person = Person("Tom", 20)
    person.apply {
        name = "Jerry"
        age = 21
    }
    println(person.name) // 输出 "Jerry"
    println(person.age) // 输出 21
}
