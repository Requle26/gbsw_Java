package freeStud.Unsolved;

public class Outer {
    int value = 100;

    class Device extends Machine {
        int value = 10;

        public Device() {
            super();
            System.out.print("D" + value + " ");
        }

        @Override
        public void act() {
            System.out.print("A" + value + " ");
        }

        @Override
        int score() {
            return value + Outer.this.value;
        }

        class Panel {
            void show() {
                System.out.print(
                        "P" + value + "-"
                                + Device.this.value + "-"
                                + Outer.this.value + " "
                );
            }
        }
    }

    static class ReporterImpl implements Action.Reporter {
        @Override
        public void report(int value) {
            System.out.print("R" + value + " ");
        }
    }
}