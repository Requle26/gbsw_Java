package ch08;


// 상속 - extends A
// 구현 - implements A

// 상속과 구현의 주요 차이점
// 상속은 하나의 클래스만 가능하지만
// 구현은
public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);


    }
}
