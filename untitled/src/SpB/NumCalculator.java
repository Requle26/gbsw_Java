package SpB;

public class NumCalculator {
    public <T extends Number> double sum(T data) {
        return data.doubleValue() + 10;
    }
}
