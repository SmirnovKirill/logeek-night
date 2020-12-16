package logeeknight

    fun smartCast(obj: Any?): Boolean {
        if (obj !is String) {
            return false
        }

        return obj.startsWith("Kotlin is #1")
    }

