import java.util.Scanner

/**
 * # Classes
 */
class Car {
    var manufacturer = ""
    var model = ""
    var fuel = ""
    var gears = 0

    val sc = Scanner(System.`in`)

    fun getData() {
        println("Enter Manufacturers Name: ")
        manufacturer = readln()

        println("Enter Model Name: ")
        model = readln()

        println("Enter Fuel Type: ")
        fuel = readln()

        println("Enter Number Of Gears: ")
        gears = sc.nextInt()
    }

    fun displayData() {
        println("Manufacturers Name: $manufacturer")

        println("Model Name: $model")

        println("Fuel Type: $fuel")

        println("Number Df Gears: $gears")
    }
}

/**
 * # Constructors
 * A constructor can be created in the following way.
 * ```kotlin
 * class Employee(name: String, empId: Int, salary: Double, shift: String) {
 *
 * }
 * ```
 *
 * #### There are two ways to use the value which is being passed to the constructor.
 * - In this the values are passed as a parameter to the constructor and then the value is passed to the local variable.
 * - A value is passed as a parameter when we first perform some operations on the value and then use it in our class.
 *  ``` kotlin
 *  class Employee(name: String, empId: Int, salary: Double, shift: String) {
 *     var name = name.isNotBlank()
 *     var empId = empId
 *     var salary = salary
 *     var shift = shift.trim()
 * }
 * ```
 *
 * - In this the value is being passed as a property so that it can be used directly in the class without needing to pass it to the another variable.
 * - It is used when we just want to use the passed value without performing any operations on it.
 * ``` kotlin
 * class Employee(var name: String, var empId: Int, var salary: Double, var shift: String) {
 * }
 * ```
 */
class Employee(name: String, var empId: Int, var salary: Double, shift: String) {
    var name = name.isNotBlank()
    var shift = shift.trim()

    fun displayData() {
        println("Name: $name")
        println("Employee Id: $empId")
        println("Salary: $$salary")
        println("Shift: $shift")
    }
}

fun main() {
    val car1 = Car()
    car1.getData()
    car1.displayData()

    val emp1 = Employee("",256,55999.99,"Night")
    emp1.displayData()
}