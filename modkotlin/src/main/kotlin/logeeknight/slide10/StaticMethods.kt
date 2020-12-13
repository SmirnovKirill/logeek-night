package logeeknight.slide10

import com.fasterxml.jackson.databind.ObjectMapper

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

object OBJECT_MAPPER : ObjectMapper()