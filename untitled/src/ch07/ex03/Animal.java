package ch07.ex03;

public abstract class Animal {
    public String kind;
    // 해당 추상 클래스의 행위도 추상적인 경우 (기본 기능을 구현할 수 없는 경우)
    // ex) 강아지, 고양이는 울 수 있지만,
    // '동물'이라는 개념은 어떻게 우는지 알 수가 없다.
    // 이후 이 추상 메서드는 해당 추상 클래스를 상속받은 실체 클래스들에서
    // 반드시 구현을 해주어야 한다.

    public abstract void sound();
}
