package freeStud.solution.s01;

public class TossPayment implements Payment {
    @Override
    public String pay(int amount) {
        return ("토스페이로 " + amount + "원 결제했습니다.");
    }

    @Override
    public String getPaymentName() {
        return "토스페이";
    }
}
