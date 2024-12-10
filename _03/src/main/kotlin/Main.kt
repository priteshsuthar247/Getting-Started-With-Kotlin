fun main() {
    var x = 9
    val y = 4

    println("$x + $y = ${x + y}")
    println("$x - $y = ${x - y}")
    println("$x * $y = ${x * y}")
    println("$x / $y = ${x / y}")
    println("$x % $y = ${x % y}")

    x += 1
    println(x)

    x -= 6
    println(x)

    x *= 10
    println(x)

    x /= 2
    println(x)

    x %= 3
    println(x)

    var z = 0
    println(z++)
    println(z)
    println(++z)

    val avgScore = 6.9
    if (avgScore >= 10) {
        println("Scored less 10")
    } else if (avgScore >= 5.5) {
        println("Scored more than 5.5")
    }
    else {
        println("Failed")
    }

    var yourIQ = 250

    when {
        yourIQ >=300 -> println("You need more practice.")
        yourIQ >=200 -> println("Your IQ is $yourIQ")
        yourIQ in 100..200 -> println("Work harder.")
        else -> println("Keep working moore.")
    }

    when (yourIQ) {
        300 -> println("You need more practice.")
        200 -> println("Your IQ is $yourIQ")
        in 100..250 -> println("Work harder.")
        else -> println("Keep working moore.")
    }
}