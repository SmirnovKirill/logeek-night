package logeeknight

data class Guy(
    val name: String?,
    val lastName: String?,
    val address: String?
)
{
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        var name: String? = null
        var lastName: String? = null
        var address: String? = null

        fun build() = Guy(name, lastName, address)
    }
}

val builder = Guy.builder().apply {
    name = "John"
    lastName = "Smith"
}
val guy = builder.apply {
    address = "Maple str, 8"
}.build()