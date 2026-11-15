package ch07.ex03;

public class SmartPhone extends Phone {
    // 추상클래스는 직접 객체화시킬 수 없지만,
    // SmartPhone 등 추상클래스를 상속받은 클래스가 객체화되려면,
    // 내부적으로는 Phone 객체 생성이 필요하다.
    // 따라서 기존 상속에서 배웠던 것과 마찬가지로,
    // 생성 과정에서 부모 객체도 생성될 수 있도록 처리해주어야 한다.
    public SmartPhone(String owner) {
        super(owner);
    }

    // 메소드
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}


