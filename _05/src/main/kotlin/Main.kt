/**
 * # Functions
 * ### Types of functions
 * - Basic Function
 * ``` kotlin
 * fun test() {
 * }
 * ```
 * - Function with parameters.
 * ``` kotlin
 * fun test(x: Int) {
 * }
 * ```
 * - Function with return type
 * ``` kotlin
 * fun test(): Int {
 * }
 * ```
 */
fun sayHello(name: String) {
    println("Hello $name")
}

fun getData(data: Boolean) = if (!data) "You are not connected to the Internet" else "You are connected to the Internet"

fun showMessage(internetConnectivity: Boolean) {

    println(getData(internetConnectivity))
}

/**
 *  - Using ```vararg``` to dynamically add parameters to the function
 */
fun doSum(vararg variables: Int) {
    var result = 0
    for (i in variables) {
        result += i
    }
    println(result)
}

fun main() {
    val userName = "Pritesh"
    val internetConnectivity = false
    sayHello(userName)
    showMessage(internetConnectivity)
    doSum(1, 56, 35)
}
