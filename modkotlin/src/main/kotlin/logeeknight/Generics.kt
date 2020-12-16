package logeeknight

import com.fasterxml.jackson.databind.ObjectMapper

interface Producer<out T> {
        fun produce(): T
    }

    fun generalizeProducers(producers: List<Producer<String>>) {
        val anyProducer: List<Producer<Any>> = producers
        anyProducer.forEach { println(it.produce()) }
    }

    interface Consumer<in T> {
        fun consume(src: T)
    }

    fun specifyConsumers(producers: List<Consumer<Number>>) {
        val intConsumer: List<Consumer<Int>> = producers
        intConsumer.forEach { it.consume(1) }
    }

    inline fun <reified T: Any> String.readJson(): T {
        val mapper = ObjectMapper()
        return mapper.readValue(this, T::class.java)
    }

    fun readOrder(src: String, order: Order) {
        val orderFromJson = src.readJson<Order>()
    }

