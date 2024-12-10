/**
 * # Loops, Break, Continue, And Labels
 */
fun main() {
    forLoop()
    whileLoop()
    continueStatement()
    breakStatement()
    labels()
}

fun whileLoop() {
    var variable = 0
    while (variable < 5) {
        println(variable)
        variable++
    }
}

fun continueStatement() {
    for (i in 1..5) {
        if (i == 3) continue
        println(i)
    }
}

fun breakStatement() {
    for (i in 1..5) {
        if (i == 3) break
        println(i)
    }
}

/**
 * - Using labels we can break or continue from the whole section
 */
fun labels() {
    outer@ for (i in 1..5) {
        println(i)
        for (j in 'a'..'e') {
            print(j)
            if (j == 'c') break@outer
        }
        println()
    }
}

fun forLoop() {
    for (i in 1..5 step 2) {
        println(i)
    }
    for (i in 1 until 5 step 2) {
        println(i)
    }
    for (i in 5 downTo 1) {
        println(i)
    }
    for (i in 5 downTo 1 step 2) {
        println(i)
    }
}