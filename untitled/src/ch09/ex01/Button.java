package ch09.ex01;

public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    static interface OnClickListener {
        void onClick();
    }
}

class test {
    static void main(String[] args) {
    }
}