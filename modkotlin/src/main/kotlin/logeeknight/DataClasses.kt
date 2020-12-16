package logeeknight


    val order = Order(id = "1", price = 100.0)
    val order2 = order.copy(id = "2", side = Side.SELL)

    fun processOrder(order: Order) {
        val (orderId, side, _, currency) = order2
        println("$orderId, $side, $currency")
    }

