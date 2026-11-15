package freeStud.today2;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer = 0;
        int f1 = 0;
        int f2 = 1;
        for (int i = 0; i < num; i++) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println(f1);

    }
}
