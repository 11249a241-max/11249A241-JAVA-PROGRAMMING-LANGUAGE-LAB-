// 1. Define the Payment interface
interface Payment {
    void pay(double amount); // Abstract method (no body)
}

// 2. Implement UPIPayment class
class UPIPayment implements Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment of ₹" + amount + " using ID: " + upiId);
        System.out.println("Connecting to UPI gateway... Payment Successful!");
    }
}

// 3. Implement CardPayment class
class CardPayment implements Payment {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Card Payment of ₹" + amount + " for Card: XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Encrypting data... OTP Verified... Payment Successful!");
    }
}

// 4. Main class renamed to PaymentSystem
public class PaymentSystem {
    public static void main(String[] args) {
        // Loose coupling / abstraction in action
        Payment paymentGateway;

        // User chooses UPI
        paymentGateway = new UPIPayment("user@okaxis");
        paymentGateway.pay(1500.0);

        System.out.println();

        // User chooses Card
        paymentGateway = new CardPayment("1234567890123456");
        paymentGateway.pay(4500.0);
    }
}
