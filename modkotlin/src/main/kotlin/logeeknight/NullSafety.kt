package logeeknight

import org.apache.commons.lang3.StringUtils
import java.lang.IllegalArgumentException


    enum class Side {
        BUY,
        SELL
    }

    data class Order(val id: String,
                     val side: Side = Side.BUY,
                     val price: Double,
                     val currency: String = "USD")

    val orderId = "0"

    val orders = mapOf("1" to Order("1", Side.BUY, 10.5, "USD"))

    val orderPriceTxt = orders[orderId]
        ?.let { "${it.price} ${it.currency}" }
        ?: throw IllegalArgumentException("No order was found by id $orderId")

    val orderSide = orders[orderId]?.side

    val src: String? = null

    val splitString = if (StringUtils.isNotBlank(src)) {
        src!!.split("|")
    } else {
        emptyList()
    }

    val probableInt: Any? = null

    val item: Int? = probableInt as? Int

    fun main() {
        println(orderPriceTxt)
        println(orderSide)
        println(splitString)
        println(item)
    }
