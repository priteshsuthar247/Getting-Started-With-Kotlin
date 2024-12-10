/**
 * # Variables
 * #### Types of Variables
 * I.
 * Values of the variables declared using ```var``` can be changed.
 *
 * ``` kotlin
 * var userName: String = "Pritesh"
 * ```
 * II.
 * Values of the variables declared using ```val``` cannot be changed.
 *
 * ``` kotlin
 * val age: Int = 20
 * ```
 *
 * #### Declaring Datatypes
 *
 * Datatype of variables can be declared in two ways either via explicitly declaring its type or just giving them its value.
 * In both the cases once the variable is declared its type cannot be changed.
 *
 * I.
 * ``` kotlin
 * var userName: String = "Pritesh"
 * ```
 * II.
 * ``` kotlin
 * var userName = "Pritesh"
 * ```
 *
 *
 */

fun main() {
    var userName = "Pritesh"
    println("Name: $userName")

    userName = "Suthar"
    println("Name: $userName")

    val age = 20
    println("Age: $age")

}