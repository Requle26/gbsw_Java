package freeStud.oop;

public class BankTransfer implements Payment{
    @Override
    public String pay(int amount) {
        if (amount <= 0) {
            return "0원 이하로 송금하실 수 없습니다.";
        }
        return "은행으로 " + amount + "원 송금했습니다.";
    }
}
