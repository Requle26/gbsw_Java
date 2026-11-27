package freeStud.gameDirect;

public class Mage extends Character implements Attackable{

    public Mage(int HP) {
        super(HP);
    }
    @Override
    void attack(Character character) {
        System.out.println("마법 공격");
        character.setHP(character.getHP() - 15);
        character.die();
    }

    @Override
    public void specialAttack(Character character) {
        System.out.println("특수 마법 공격");
        character.setHP(character.getHP() - 50);
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
