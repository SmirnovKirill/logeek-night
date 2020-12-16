package logeeknight

    data class Person(
        val name: String,
        val lastName: String
    )

    fun findNamesIndices(name: String, people: List<Person>?): List<Int> {
        if (people.isNullOrEmpty()) {
            //people.add(Person("Igor", "Katamaranov")) Not allowed to do that, list is immutable!
            return emptyList()
        }

        return people.withIndex().filter { it.value.name == name }.map { it.index }
    }

    fun findTwoNameIndices(first: String, second: String, people: List<Person>?): List<Int> {
        return findNamesIndices(first, people) + findNamesIndices(second, people)
    }

