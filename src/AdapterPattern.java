// Adaptee (Legacy Payment System)
class LegacyPaymentSystem {
    public String processPayment(int amount) {
        return "Processed payment of " + amount + " in legacy system.";
    }
}

// Target (New Payment Gateway)
interface NewPaymentGateway {
    String makePayment(int amount);
}

// Adapter
class PaymentAdapter implements NewPaymentGateway {
    private LegacyPaymentSystem legacySystem;

    public PaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public String makePayment(int amount) {
        return legacySystem.processPayment(amount);
    }
}

// Main class
public class AdapterPattern {
    public static void main(String[] args) {
        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem();
        NewPaymentGateway paymentAdapter = new PaymentAdapter(legacySystem);

        System.out.println(paymentAdapter.makePayment(100));
    }
}
