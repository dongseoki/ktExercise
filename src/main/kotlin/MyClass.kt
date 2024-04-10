class MyClass {
    fun myMethod() {
        println("Called myMethod from MyClass in B.kt")
    }

    companion object {
        fun myStaticMethod() {
            println("Called myStaticMethod from MyClass in B.kt")
        }
    }
}

fun myTopLevelFunction() {
    println("Called myTopLevelFunction in B.kt")
}