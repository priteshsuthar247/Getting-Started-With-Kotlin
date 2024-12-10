//  Default data type of Numbers is Int

fun main() {
    val minIntValue = Int.MIN_VALUE
    val maxIntValue = Int.MAX_VALUE

    println("The range of integer variables is from $minIntValue to $maxIntValue.")

    val minByteValue = Byte.MIN_VALUE
    val maxByteValue = Byte.MAX_VALUE

    println("The range of byte variables is from $minByteValue to $maxByteValue.")

    val minShortValue = Short.MIN_VALUE
    val maxShortValue = Short.MAX_VALUE

    println("The range of short variables is from $minShortValue to $maxShortValue.")

    val minLongValue = Long.MIN_VALUE
    val maxLongValue = Long.MAX_VALUE

    println("The range of long variables is from $minLongValue to $maxLongValue.")

    val minFloatValue = Float.MIN_VALUE
    val maxFloatValue = Float.MAX_VALUE

    println("The range of float variables is from $minFloatValue to $maxFloatValue.")

    val minDoubleValue = Double.MIN_VALUE
    val maxDoubleValue = Double.MAX_VALUE
    println("The range of double variables is from $minDoubleValue to $maxDoubleValue.")

//  Inorder to declare a floating point variable we need to add f at the end of the value
//  Because by default Kotlin assigns it as a double.

    val floatVariable = 2.47f
    println(floatVariable)
    println("Datatype of floatVariable is: " + floatVariable::class.simpleName)

    val doubleVariable = 2.47
    println(doubleVariable)
    println("Datatype of floatVariable is: " + doubleVariable::class.simpleName)

    val charVariable = 'P'
    println(charVariable)

    val booleanVariable = true
    println(booleanVariable)
}