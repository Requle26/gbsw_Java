package freeStud.gameDirect;

public class Warrior extends Character implements Attackable{
    public Warrior(int HP) {
        super(HP);
    }

    @Override
    void attack(Character character) {
        System.out.println("물리 공격");
        character.setHP(character.getHP() - 20);
        character.die();
    }

    @Override
    public void specialAttack(Character character) {
        System.out.println("특수 물리 공격");
        character.setHP(character.getHP() - 40);
        character.die();
    }

    @Override
    String die() {
        if (super.getHP() <= 0) {
            return "죽었습니다.";
        }
        return getHP() + "의 체력이 남아있습니다";
    }
}
