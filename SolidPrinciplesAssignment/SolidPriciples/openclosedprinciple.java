package SolidProperties;

interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI.");
    }
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card.");
    }
}

class PaymentService {
    void makePayment(Payment payment) {
        payment.pay();
    }
}

public class openclosedprinciple {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.makePayment(new UpiPayment());
        service.makePayment(new CreditCardPayment());
    }
}
