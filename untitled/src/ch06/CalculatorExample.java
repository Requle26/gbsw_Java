package ch06;

public class CalculatorExample {
    static void main(String[] args) {
        int result = Calculator.add(1, 2);
        double doubleResult = Calculator.add(1.5, 3.5);
        int result2 = Calculator.sub(5, 3);

        System.out.println(result);
        System.out.println(result2);

        Calculator area = new Calculator();
        System.out.println(area.areaRectangle(3, 4));

    }
}
