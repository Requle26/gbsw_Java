package ch09.ex02;

public class Anonymous {
    Person field = new Person() {
        public void work() {
            System.out.println("출근합니다.");
        }
        @Override
        void wake() {
            super.wake();
        }
    };

    void method1() {
        Person localVar = new Person() {
            void walk() {
                System.out.println("tkscorgkqslek");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };

        
    }

    public void method2(Person person) {
    }
}
