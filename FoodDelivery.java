class OrderPlacement extends Thread {
    public void run() {
        try {
            System.out.println("Order placement started...");
            Thread.sleep(1000);
            System.out.println("Food order placed successfully.");
            Thread.sleep(1000);
            System.out.println("Order confirmed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class OrderDelivery extends Thread {
    public void run() {
        try {
            System.out.println("Delivery process started...");
            Thread.sleep(1500);
            System.out.println("Food is being prepared.");
            Thread.sleep(1000);
            System.out.println("Food is out for delivery.");
            Thread.sleep(1000);
            System.out.println("Food delivered successfully.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class FoodDelivery {
    public static void main(String[] args) {
        OrderPlacement placement = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        placement.start();
        delivery.start();
    }
}