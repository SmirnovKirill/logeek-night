package logeeknight

import com.google.common.base.Stopwatch
import java.util.concurrent.TimeUnit

fun measuringTime(action: () -> Unit, millisConsumer: (Long) -> Unit) {
    val stopwatch = Stopwatch.createStarted()
    try {
        action()
    } finally {
        millisConsumer(stopwatch.elapsed(TimeUnit.MILLISECONDS))
    }
}

fun main() {
    val action = {/*Doing something*/}
    measuringTime(action) { print("Took $it ms") }
}


