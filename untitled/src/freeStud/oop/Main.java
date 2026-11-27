package freeStud.oop;

public class Main {
    public static void main(String[] args) {

        Payment payment = new CardPayment();

        System.out.println(payment.pay(30000));

        payment = new KakaoPayment();

        System.out.println(payment.pay(15000));
    }
}