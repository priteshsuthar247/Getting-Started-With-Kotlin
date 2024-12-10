fun main() {
    // When we want to keep a variable's value null we need declare the variable in the following way
    var text: String? = "Value Assigned"
    text = null
    // If we want to perform some operations on the variable when it has some value.

    // The long way
//    if (text != null)
//    {
//        println(text.length)
//    }
//    else {
//        println("Value is null")
//    }
    // The short way
    println(text?.length)

    // Using the Elvis operator

    val newText = text ?: "The value is not null."
    println(newText)

    // Working

//    if (text != null) {
//        newText =text
//    }
//    else {
//        newText = "The value is not null."
//        println(newText)
//    }
    // if the value is null and want to raise the exception.
//    println(text!!.length)

}