package logeeknight.slide6

data class Person(
    val name: String,
    val lastName: String
)


fun createUser(): Person {
    return Person("Andrey", "Breslav")
}

fun main() {
    val (name, lastName) = createUser()
    println("name is $name, lastName is $lastName")
}
