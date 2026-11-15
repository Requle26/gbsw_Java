package freeStud;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("김성일", 17);

        student.name = "김성일";
        student.age = 17;

        System.out.println(student.introduce());
    }
}