package freeStud;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String introduce() {
        return "안녕하세요. 저는 " + name + "이고 " + age + "살입니다.";
    }
}

