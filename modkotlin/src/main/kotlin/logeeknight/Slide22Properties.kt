package logeeknight

    interface User {
        val email: String
    }

    class GenericUser(unprocessedEmail: String) : User {
        override val email = unprocessedEmail //Can override properties
            get() = field.toLowerCase() //Can override getters

        fun extractDomain(): String? {
            val matcher = ".*@(.*)".toRegex().matchEntire(email) ?: return null

            return matcher.groupValues[1] //Compact syntax for Java API calls
        }
    }

