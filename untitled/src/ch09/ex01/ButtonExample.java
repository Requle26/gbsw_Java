package ch09.ex01;

public class ButtonExample {
    static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
