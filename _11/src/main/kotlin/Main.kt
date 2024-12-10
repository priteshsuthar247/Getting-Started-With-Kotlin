/**
 * # Initializers Block
 * It is used to initialize a variable when the value passed to the constructor is needed to go under some validation before being used in the class.
 */
fun main() {
    val firstUser = Users("Mercedes", "Female", 25)
    val secondUser = Users("Alex", "Male", 19)

    println("First Users Data \nName: ${firstUser.name}\nGender: ${firstUser.gender}\nAge: ${firstUser.age}\n")
    println("Second Users Data \nName: ${secondUser.name}\nGender: ${secondUser.gender}\nAge: ${secondUser.age}\n")
}

class Users (var name : String, gender : String, age : Int) {
    var age : Int?
    var gender : String?
    init {
        if(age > 18 && gender.lowercase().startsWith("m")) {
            this.gender =gender
            this.age = age
        } else {
            println("We are looking for male candidates who are above the age of 18")
            this.age = null
            this.gender = null
        }
    }
}