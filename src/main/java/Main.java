import lotr.Character;
import lotr.CharacterFactory;
import lotr.GameManager;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character ch = factory.createCharacter();
        Character ch2 = factory.createCharacter();
        System.out.println(ch.getClass().getSimpleName());
        System.out.println(ch2.getClass().getSimpleName());
        GameManager gameManager = new GameManager();
        gameManager.fight(ch, ch2);
    }
}
