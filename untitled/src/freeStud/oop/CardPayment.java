package freeStud.oop;

public class CardPayment implements Payment{
    @Override
    public String pay(int amount) {
        if (amount <= 0) {
            return "0원 이하로 송금하실 수 없습니다.";
        }
        return "카드로 " + amount + "원 결제했습니다.";
    }
}
