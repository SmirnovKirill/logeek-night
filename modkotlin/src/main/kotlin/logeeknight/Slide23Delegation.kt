package logeeknight

    interface DbConnection {
        fun select()

        fun update()
    }

    class DbConnectionWithTransactions(db: DbConnection) : DbConnection by db {
        override fun update() { /*Implementation with transactions */}
    }

    class DelegationExample {
        val test: String by lazy { heavyMethod() }

        private fun heavyMethod(): String {
            return "Took a lot of time to compute"
        }
    }

