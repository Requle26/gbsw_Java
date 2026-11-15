package ch07;

public class SupersonicAirplane extends Airplane {
    public static final int NORNAL = 1;
    public static final int SUPERSONIC = 2;

    public int mode = NORNAL;

    @Override
    public void fly() {
        if (mode == NORNAL) {
            super.fly();
        } else {
            System.out.println("초음속 비행합니다.");
        }
    }
}
