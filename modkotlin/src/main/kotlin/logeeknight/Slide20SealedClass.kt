package logeeknight

    sealed class HttpRequest {
        abstract val url: String

        abstract fun send()
    }

    class GetRequest(override val url: String) : HttpRequest() {
        override fun send() { /* Implementation goes here*/ }
    }

    class PostRequest<T>(override val url: String, val body: T) : HttpRequest() {
        override fun send() { /* Implementation goes here*/ }
    }

    fun main() {
        GetRequest("http://kotlinlang.org").send()
        GetRequest("http://java.com").send()
        val requestBody = Any()
        PostRequest("http://openjdk.java.net", requestBody).send()
    }

    fun getRequestName(request: HttpRequest) =
        when(request) {
            is GetRequest -> "GET"
            is PostRequest<*> -> "POST"
        }

