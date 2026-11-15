package ch07.ex02;

public class Tire {
    public int maxRotation;
    public int accumulatedRatation;
    public String location;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public Boolean roll() {
        ++accumulatedRatation;

        if (accumulatedRatation < maxRotation) {
            int leftRotation = maxRotation - accumulatedRatation;
            // 타이어 수명이 남은 경우
            System.out.println(location + "Tire 수명: " + leftRotation + "회");
            return true;
        } else {
            // 타이어 수명이 다한 경우
            System.out.println("***" + location + " Tire 펑크 ***");
            return false;
        }
    }
}
