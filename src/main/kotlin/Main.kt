import java.math.BigDecimal

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val a= 10
    println(a)
    var test = "ASDG";
    println(test)

    val b: Int = 10
    println(b)

    val c: String = "SDFG"
    println(c)
    println(1+2+3)
    println(8.8/4)
    var ab = 5
    val bc = 3
    ab = a / b
    println(a)
    println('A'.code)
    val fTest: Float =11.toFloat()
    println(fTest)
    var test2 = BigDecimal(2)
    println(test2)
    printUpperCase("hello")
    printLength("hello")
    val add = add(3, 5)
    println(add)
    printMessage("Hello")
    fun multiply(a: Int, b: Int): Int = a * b

// Usage
    println(multiply(4, 2)) // Output: 8

    fun greet(name: String, greeting: String = "Hello") {
        println("$greeting, $name!")
    }

// Usage with default argument
    greet("Alice") // Output: Hello, Alice!

// Usage with named argument
    greet(name = "Bob", greeting = "Welcome") // Output: Welcome, Bob!

    fun <T> printVarargs(vararg items: T) {
        for (item in items) {
            println(item)
        }
    }

// Usage
    printVarargs(1, 2, 3, 4) // Pass integers
    printVarargs("Hello", "World", "!") // Pass strings

    fun <T> wrapPrint(vararg items: T) {
        printVarargs(*items) // Using the spread operator to pass a vararg
    }

// Usage
    wrapPrint("One", "Two", "Three")

    fun <T> printWithPrefix(prefix: String, vararg items: T) {
        for (item in items) {
            println("$prefix $item")
        }
    }

// Usage
    printWithPrefix("Number:", 1, 2, 3)

    val maybeNull: String? = null

    try {
        // Using the !! operator to assert that 'maybeNull' is not null.
        val definitelyNotNull: String = maybeNull!!
        println(definitelyNotNull)
    } catch (e: NullPointerException) {
        println("Caught NullPointerException: ${e.message}")
    }

    myTopLevelFunction()
    MyClass.myStaticMethod()
    val myClass = MyClass()
    myClass.myMethod()
}

fun printUpperCase(str: String?) {
    if (str != null) {
        // str is automatically cast to non-nullable String in this block
        println(str.toUpperCase()) // No explicit cast needed
    }
}

fun printLength(obj: Any) {
    if (obj is String) {
        // obj is automatically cast to String in this block
        println(obj.length) // No explicit cast needed
    }
}

fun add(a: Int, b: Int): Int {
    return a + b
}
fun printMessage(message: String) {
    println(message)
}

