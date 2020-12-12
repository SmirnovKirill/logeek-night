package logeeknight.slide9

data class Person(
    val name: String,
    val lastName: String
) {
    companion object {
        @JvmStatic
        fun from(string: String): Person {
            return Person(string.split(" ")[0], string.split(" ")[1])
        }
    }
}

fun personFrom(string: String): Person {
    return Person(string.split(" ")[0], string.split(" ")[1])
}