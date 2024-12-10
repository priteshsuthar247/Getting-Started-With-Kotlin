/** # Arrays
 * - There are two ways to declare an array.
 *
 * I.
 * ``` kotlin
 * val firstArray: Array<Int> = arrayOf(45, 96, 8, 36)
 * ```
 * II.
 * ``` kotlin
 * val firstArray = arrayOf(98, 22, 6, 30)
 * ```
 * - We can even create arrays in kotlin which can have different datatypes.
 * ``` kotlin
 * val firstArray = arrayOf("Some Text", 556, 'd', 2.6)
 * ```
 */
fun main() {
    val firstArray = arrayOf("Some Text", 556, 'd', 2.6)
    println("Size of firstArray: " + firstArray.size)
    println(firstArray[2])

    /**
     * - Using is keyword to print only the variable whose datatype is Double.
     */
    
    for (i in firstArray) {
        if (i is Double) println(i)
    }
}