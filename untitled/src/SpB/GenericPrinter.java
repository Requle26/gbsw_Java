package SpB;

public class GenericPrinter {
    public <T extends Number> void printNumber(T data) {
        System.out.println(data);
    }
}
