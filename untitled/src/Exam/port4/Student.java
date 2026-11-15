package Exam.port4;

public class Student {
    private String name;
    private int score;

    public int getStudentNo() {
        return studentNo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final int studentNo;

    public Student(String name, int score, int studentNo) {
        this.studentNo = studentNo;
        this.name = name;
        this.score = score;
    }



}
