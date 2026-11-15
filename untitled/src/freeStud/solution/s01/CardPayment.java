package freeStud.solution.s01;

public class CardPayment implements Payment {
    @Override
    public String pay(int amount) {
        return ("카드로 " + amount + "원 결제했습니다.");
    }

    @Override
    public String getPaymentName() {
        return "카드";
    }
}
