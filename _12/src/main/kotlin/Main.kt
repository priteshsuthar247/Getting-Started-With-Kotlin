/**
 * # Secondary constructors
 * These are used when objects of the same class needs to be created with different parameters.
 * A class can have:
 * - Multiple secondary constructors.
 * - Primary constructor and secondary constructor.
 *
 * Keyword to declare secondary constructor is ```constructor()```. It can also have its own body.
 * When a class has both type of constructors we need to pass the value's of secondary constructor to primary constructor.
 * This is done by adding ```this()``` at the end of secondary constructor.
 */

fun main() {
    val firstUser = Users("Pritesh", "pritesh.suthar247@gmail.com", 9104107585)
    val secondUser = Users("Pritesh", 9104107585)
    val thirdUser = Users("Pritesh", "pritesh.suthar247@gmail.com")
}

class Users(var name: String?, var emailID: String?, var mobileNo: Long?) {

    constructor(name: String?, emailID: String?) : this(name, emailID, null)
    constructor(name: String?, mobileNo: Long?) : this(name, null, mobileNo)

    init {
        displayData(name, emailID, mobileNo)
    }
    fun displayData(name: String?, emailID: String?, mobileNo: Long?) {
        println("Name: $name, Email Address: $emailID, Mobile No.: $mobileNo")
    }
}