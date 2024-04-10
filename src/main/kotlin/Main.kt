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

