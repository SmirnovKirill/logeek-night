package logeeknight.slide7

import kotlin.reflect.KProperty

class Lazy<T>(private val initializer: () -> T) {
    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        if (value != null) {
            return value!!
        }

        value = initializer()
        println("Value has been initialized")
        return value!!
    }
}


class DelegationExample {
    val test: String by Lazy { "test" }
}


fun main() {
    val example = DelegationExample()
    println(example.test)
    println(example.test)
    println(example.test)
}