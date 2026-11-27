// 4반 02번 김성일

package freeStud;

class Main {
    public static void main(String[] args) {
        Piano piano = new Piano("그랜드");
        piano.tune();

        Player player = new Player(piano);
        player.perform();

        MusicShop musicShop = new MusicShop();
        musicShop.check(piano);
    }
}

class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }
    public void tune() {
        System.out.println(name + " 조율합니다.");
    }
}

class Piano extends Instrument {
    public Piano(String name) {
        super(name);
    }
    public void sound() {
        System.out.println(name + " 소리를 냅니다.");
    }
}

class Player {
    private Piano piano;

    public Player(Piano piano) {
        this.piano = piano;
    }
    public void perform() {
        piano.sound();
    }
}

class MusicShop {
    public void check(Piano piano) {
        System.out.println(piano.name + " 검사합니다.");
    }
}