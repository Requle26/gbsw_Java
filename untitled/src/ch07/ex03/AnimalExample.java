package ch07.ex03;

public class AnimalExample {
    static void animalSound(Animal animal) {
        animal.sound();
    }

    static void main(String[] args) {
//        변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");

//        추상 클래스이기 때문에 객체 생성 불가
//        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

//       하나의 부모 타입으로 다양한 자식 객체를 다룰 수 있는 특성인
//       다형성을 이용해 sound 호출
        animalSound(dog);
        animalSound(cat);
    }
}
