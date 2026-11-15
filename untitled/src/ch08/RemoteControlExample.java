package ch08;

public class RemoteControlExample {
    static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
