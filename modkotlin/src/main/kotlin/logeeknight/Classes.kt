package logeeknight

    interface L1Quote {
        val negativePriceAllowed: Boolean

        companion object {
            @JvmStatic
            fun createEquity(): L1Quote = EquityL1Quote()

            fun createFuture(): L1Quote = FuturesL1Quote()
        }
    }

    open class L1QuoteBase: L1Quote {
        override val negativePriceAllowed: Boolean = false

        protected open fun identifyLocation(): String {
            // Some work here
            return "someValue"
        }
    }

    private class EquityL1Quote: L1QuoteBase() {
        override fun identifyLocation(): String {
            // Some different work here
            return "differentValue"
        }
    }

    private class FuturesL1Quote: L1QuoteBase() {
        override val negativePriceAllowed: Boolean
            get() = true
    }

    interface Codec<T> {
        fun encode(src: T): ByteArray
    }

    object StringCodec: Codec<String> {
        override fun encode(src: String): ByteArray {
            // Some work
            return ByteArray(0)
        }
    }

    val encoded = StringCodec.encode("Value")

    fun main() {
        println(encoded)
    }