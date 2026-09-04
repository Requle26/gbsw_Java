import java.util.Scanner;

public class RSP {
    static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String inputA = scanner1.nextLine();
        if (inputA.equals("R") || inputA.equals("S") || inputA.equals("P")) {
            Scanner scanner2 = new Scanner(System.in);
            String inputB = scanner2.nextLine();
            if (inputB.equals("R") || inputB.equals("S") || inputB.equals("P")) {
                if (inputA.equals(inputB)) {
                    System.out.println("무승부");
                    return;
                } else if (inputA.equals("R") && inputB.equals("S")) {
                    System.out.println("A승");
                    return;
                } else if (inputA.equals("S") && inputB.equals("P")) {
                    System.out.println("A승");
                    return;
                } else if (inputA.equals("P") && inputB.equals("R")) {
                    System.out.println("A승");
                    return;
                }
                System.out.println("B승");
                return;
            }
        }
        System.out.println("예외");
    }
}