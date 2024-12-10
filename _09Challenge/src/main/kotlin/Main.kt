fun main() {
    val firstArray = arrayOf(94, 64, 523, 35, 95)
    println(findGreatest(firstArray))
    println(findSmallest(firstArray))
    println(findingMinAndMax(firstArray, true))
    println(findingMinAndMax(firstArray, false))
}

fun findGreatest(arr: Array<Int>): Int {
    var max = arr[0]
    for (i in arr) {
        if (i > max) max = i
    }
    return max
}

fun findSmallest(arr: Array<Int>): Int {
    var min = arr[0]
    for (i in arr) {
        if (min> i) min = i
    }
    return min
}

fun findingMinAndMax(arr: Array<Int>, search: Boolean): Int {
    var max = arr[0]
    var min = arr[0]
    if (search) {
        for (i in arr) {
            if (i > max) max = i
        }
        return max
    }
    else {
        for (i in arr) {
            if (min> i) min = i
        }
        return min
    }
}