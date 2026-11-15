package ch07.ex02;

public class HankookTire extends Tire {
    public int maxRotation;
    public int accumulatedRatation;
    public String location;

    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
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
