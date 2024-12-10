/**
 * # Default Arguments in Constructors
 * - Only primary constructors can have default arguments and named arguments.
 * - In some cases the secondary constructor's work can be replaced with default arguments.
 */
fun main() {
    val firstUser = Users(name = "Pritesh", emailID = "pritesh.suthar247@gmail.com", mobileNo = 9104107585)
    firstUser.age = "25"
    firstUser.displayAge()
    val secondUser = Users(name = "Pritesh", mobileNo = 9104107585)
    val thirdUser = Users(name = "Pritesh", emailID = "pritesh.suthar247@gmail.com")
}

/**
 * # ```lateinit```
 * - Using the ```lateinit``` keyword a variable's value can be assigned later, rather than initializing its value on declaration.
 * - This keyword can only be used in class and on non-primitive datatypes.
 * - Just add ```lateinit``` at the starting when creating a variable.
 */
class Users(var name: String? = null, var emailID: String? = null, var mobileNo: Long? = null) {

    lateinit var age : String

    init {
        displayData(name, emailID, mobileNo)
    }

    fun displayData(name: String?, emailID: String?, mobileNo: Long?) {
        println("Name: $name, Email Address: $emailID, Mobile No.: $mobileNo")
    }

    fun displayAge() {
        if (::age.isInitialized) {
            println("Age: $age")
        } else {
            println("Age not initialized.")
        }
    }
}