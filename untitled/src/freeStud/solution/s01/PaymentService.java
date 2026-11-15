package freeStud.solution.s01;

public class PaymentService {
    public Payment payment;
    public PaymentService(Payment payment) {
        this.payment = payment;
    }
    public void processPayment(int amount) {
        System.out.println("결제 수단 : " + payment.getPaymentName());
        System.out.println("결제 결과 : " + payment.pay(amount));
    }
}
