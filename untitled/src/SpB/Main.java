package SpB;

public class Main {
    static void main(String[] args) {
        DataStorage<String> nameStorage = new DataStorage<>("Hello");
        DataStorage<Integer> ageStorage = new DataStorage<>(17);
        DataStorage<Double> scoreStorage = new DataStorage<>(10.5);

        System.out.println(nameStorage.getData());
        System.out.println(ageStorage.getData());
        System.out.println(scoreStorage.getData());

        nameStorage.setData("안녕");
        System.out.println(nameStorage.getData());
    }
}