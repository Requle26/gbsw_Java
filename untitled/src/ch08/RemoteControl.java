package ch08;

public interface RemoteControl {
    // 인터페이스 내의 모든 필드는 상수로 간주된다 !!!
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 10;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
