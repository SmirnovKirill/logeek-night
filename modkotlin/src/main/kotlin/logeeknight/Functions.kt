package logeeknight

import kotlin.math.max

    data class PagedRequest(
        val filter: Map<String, List<String>> = mapOf(),
        val sort: LinkedHashMap<String, String> = linkedMapOf(),
        val page: Page = Page()
    ) {
        data class Page(val current: Int = 1, val size: Int = 15)
    }

    tailrec fun sum(items: List<Int>, i: Int = 0): Int {
        if (i == items.size - 1)
            return items[i]
        return sum(items, i + 1)
    }

    tailrec fun maxDiv(n: Int, m: Int): Int =
        when {
            n == m -> n
            n > m -> maxDiv(n - m, m)
            else -> maxDiv(n, m - n)
        }

    val request = PagedRequest(page = PagedRequest.Page(current = 11))

    fun main() {
        println(request)
        println(maxDiv(15, 25))
    }
