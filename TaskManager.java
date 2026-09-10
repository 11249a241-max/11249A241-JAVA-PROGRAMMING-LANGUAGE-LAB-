public class TaskManager {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting task counter...\n");

        Thread counterThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("📋 Task Progress: " + i + "/5");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        counterThread.start();
        counterThread.join();

        System.out.println("\n Task completed successfully!");
    }
}
