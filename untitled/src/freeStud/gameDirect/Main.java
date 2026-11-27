package freeStud.gameDirect;

public class Main {
    static void main(String[] args) {
        Character[] characters = new Character[]{new Warrior(100), new Mage(80)};

        while (true) {
            int loop = 0;
            Character character = characters[loop];
            if (character.die().equals("죽었습니다.")) {
                System.out.println(character.die());
                break;
            }
            loop = 1;
            character.attack(characters[loop]);

            character = characters[loop];
            if (character.die().equals("죽었습니다.")) {
                System.out.println(character.die());
                break;
            }
            loop = 0;
            character.attack(characters[loop]);


        }
    }
}
