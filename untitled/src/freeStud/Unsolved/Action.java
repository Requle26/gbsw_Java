package freeStud.Unsolved;

public interface Action {
    void act();

    interface Reporter {
        void report(int value);
    }
}

