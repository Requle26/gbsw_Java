package freeStud.gameDirect;

public abstract class Character {
    public Character(int HP) {
        this.HP = HP;
    }

    abstract void attack(Character character);
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    private int HP;

    abstract String die();
}
