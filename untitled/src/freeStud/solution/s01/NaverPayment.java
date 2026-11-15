package freeStud.solution.s01;

public class NaverPayment implements Payment {
    @Override
    public String pay(int amount) {
        return ("네이버페이로 " + amount + "원 결제했습니다.");
    }

    @Override
    public String getPaymentName() {
        return "네이버페이";
    }
}
