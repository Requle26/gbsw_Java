package freeStud.Unsolved;

public abstract class Machine implements Action {
    protected int value = 1;

    public Machine() {
        this(2);
        System.out.print("M" + value + " ");
        act();
    }

    public Machine(int n) {
        value += n;
        System.out.print("N" + value + " ");
    }

    abstract int score();
}
