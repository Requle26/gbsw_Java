package freeStud.solution.s01;

public class KakaoPayment implements Payment {
    @Override
    public String pay(int amount) {
        return ("카카오페이로 " + amount + "원 결제했습니다.");
    }

    @Override
    public String getPaymentName() {
        return "카카오페이";
    }
}
