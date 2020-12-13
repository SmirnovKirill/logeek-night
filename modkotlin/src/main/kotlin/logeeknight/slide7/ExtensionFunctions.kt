package logeeknight.slide7

fun main() {
    val nullCollection: List<String>? = null
    println("is null collection null or empty: ${nullCollection.isNullOrEmpty()}")

    val collection = listOf("not null", null)
    println("is collection null or empty: ${collection.isNullOrEmpty()}")

    collection.forEach {
        println("is '$it' null or blank: ${it.isNullOrBlank()}")
    }
}