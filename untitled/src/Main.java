public class Main {
    public static void main(String[] args) {
        String a = "string";
        char ch = 'l'; //아스키 코드 번호 사용 가능
        int b = 158;
        int bin = 0b11; //2진수
        int oct = 012; //8진수
        int hex = 0x10; //16진수
        float c = 0.1f;
        double d = 169.9;
        boolean bool = false;

        Person person1 = new Person("김성일", 17);
        Person person2 = new Person("김성일", 17);

        int num1 = 10;
        int num2 = 3;
        double num3 = (double)num1/num2;

        System.out.println((float)num3);

        int[] intArr = {1, 2, 3};
        //자료형[] -> 지정한 자료형만 있는 길이 고정된 배열
        //자료형[][] -> 2차원 배열 / 자료형[][][] -> 3차원 배

        Week week = Week.MONDAY;
        System.out.println(week.name);
        System.out.println(week.code);

        String testStr = "test";
        System.out.println(testStr.charAt(0));

        Person person3 = new Person(null, 27);
        person3.speak("hi");


        int i=1;

        while(i<=a.length()){
            System.out.println(a.charAt(i-1));
            i++;
        }
    }

    public static class Creature {
        String name;
    }

    public static class Person extends Creature{
        String name;
        int age;

        public void speak(String word) {
            System.out.println(word);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age + '}';
//            return super.toString();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
//            return super.equals(obj);
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }
    }
}