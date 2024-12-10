/**
 * # Aim
 * - Take a desired range of numbers.
 * - Make a function which checks whether the number is Odd or Even.
 * - Print only the even numbers.
 * - Display the number of even numbers.
 */
fun main() {
    var counter = 0
    for (numbers in 1..10) {
        if (checkEvenOrOdd(numbers)) {
            counter++
            println(numbers)
        }
    }
    println(counter)
}

fun checkEvenOrOdd(i: Int): Boolean {
    return i%2 == 0
}