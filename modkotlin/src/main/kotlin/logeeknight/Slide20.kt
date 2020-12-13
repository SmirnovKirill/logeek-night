package logeeknight

sealed class HttpRequest {
    abstract val url: String

    abstract fun send()
}

class GetRequest(override val url: String) : HttpRequest() {
    override fun send() { /* Implementation goes here*/ }
}

class PostRequest(override val url: String) : HttpRequest() {
    override fun send() { /* Implementation goes here*/ }
}

fun main() {
    GetRequest("http://kotlinlang.org").send()
    GetRequest("http://java.com").send()
    PostRequest("http://openjdk.java.net").send()
}

fun getRequestName(request: HttpRequest): String {
    return when(request) {
        is GetRequest -> "GET"
        is PostRequest -> "POST"
    }
}