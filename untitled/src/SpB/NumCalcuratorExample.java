package SpB;

public class NumCalcuratorExample {
    static void main(String[] args) {
        NumCalculator calculator = new NumCalculator();

        System.out.println(calculator.sum(10));     // 20.0
        System.out.println(calculator.sum(3.5));    // 13.5
        System.out.println(calculator.sum(100L));   // 110.0
    }
}
