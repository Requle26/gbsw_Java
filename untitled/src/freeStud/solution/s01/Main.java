package freeStud.solution.s01;

public class Main {
    static void main(String[] args) {
        Payment card = new CardPayment();
        PaymentService service = new PaymentService(card);

        service.processPayment(50000);

        System.out.println();

        Payment kakao = new KakaoPayment();
        service = new PaymentService(kakao);

        service.processPayment(30000);

        System.out.println();

        Payment naver = new NaverPayment();
        service = new PaymentService(naver);

        service.processPayment(20000);

        System.out.println();

        Payment toss = new TossPayment();
        service = new PaymentService(toss);

        service.processPayment(10000);
    }
}
