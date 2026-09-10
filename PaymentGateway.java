public class PaymentGateway {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(" Initializing Payment Gateway...\n");

        Thread paymentThread = new Thread(new PaymentProcessor());
        paymentThread.start();
        paymentThread.join();

        System.out.println("\n Payment lifecycle complete!");
    }

    static class PaymentProcessor implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(" Payment Processing...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
