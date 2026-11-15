package ch08;

public class SmartTelevisionExample {
    static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        // SmartTelecision 객체는 두 인터페이스를 구현했으므로
        // RemoteCOntrol 타입이라 할 수도 있고
        // Searchable 타입이라 할 수도 있다.

        // 다만 RemoteControl, Searchable 등 한 타입으로 간주되면,
        // 해당 인터페이스에서 제공하는 상수/메서드만 참조 가능하다.
        RemoteControl rc = tv;
        rc.turnOn();
        Searchable searchable = tv;
        searchable.search("interface");
        tv.search("interface2");
        tv.turnOff();

    }
}
