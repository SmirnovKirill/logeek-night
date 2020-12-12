package logeeknight.slide6

import com.google.common.base.Stopwatch
import java.util.concurrent.TimeUnit

fun measuringTime(action: () -> Unit, stopwatchConsumer: (Stopwatch) -> Unit) {
    val stopwatch = Stopwatch.createStarted()

    try {
        action()
    } finally {
        stopwatch.stop()
        stopwatchConsumer(stopwatch)
    }
}

fun main() {
    val action = {
        var j = 0
        for (i in 1..1_000_000) {
            j += i
        }

        println("Sum equals $j")
    }

    measuringTime(action) { print("Getting the sum took ${it.elapsed(TimeUnit.MILLISECONDS)} ms") }
}