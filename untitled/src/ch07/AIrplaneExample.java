package ch07;

public class AIrplaneExample {
    static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff(); // 이륙
        sa.fly(); // 비행 (일반)
        sa.mode = SupersonicAirplane.SUPERSONIC;
        sa.fly(); // 비행 (초음속)
        sa.mode = SupersonicAirplane.NORNAL;
        sa.fly(); // 비행 (일반)
        sa.land(); // 착륙
    }
}
