package ch06.practice;

public class Student {
    public final String studentId;
    public final String name;
    public int korean;
    public int english;
    public int math;
    private static int studentCount = 0;

    public Student(String studentId, String name, int korean, int english, int math) {
        this.studentId = studentId;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        studentCount++;
    }

    public int getTotal() {
        return this.korean + this.english + this.math;
    }

    public double getAverage() {
        int totalScore = this.getTotal();
        double result = totalScore / 3.0;
        return Math.round(result * 10) / 10.0;
    }

    public void printInfo() {
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("국어: " + korean);
        System.out.println("영어: " + english);
        System.out.println("수학: " + math);
        System.out.println("총점: " + getTotal());
        System.out.println("평균: " + getAverage());
    }

     public void setScores(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public static int getStudentCount() {
        return studentCount;
    }
 }
