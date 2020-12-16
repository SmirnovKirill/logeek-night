package logeeknight;

    public class Classes {
        void doSomeWork() {
            L1Quote equity = L1Quote.createEquity();
            L1Quote future = L1Quote.Companion.createFuture();

            boolean negativePriceAllowed = equity.getNegativePriceAllowed();
        }
    }

