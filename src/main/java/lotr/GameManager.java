package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("A fight between " + c1.toString() + " and " + c2.toString() + " has started!");
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName() + " for " + c1.getPower() + " damage");
            System.out.println(c2.getClass().getSimpleName() + " has " + c2.getHp() + " hp left");
            if (c2.getHp() <= 0) {
                System.out.println(c1.getClass().getSimpleName() + " has won!");
                break;
            }
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName() + " for " + c2.getPower() + " damage");
            System.out.println(c1.getClass().getSimpleName() + " has " + c1.getHp() + " hp left");
            if (c1.getHp() <= 0) {
                System.out.println(c2.getClass().getSimpleName() + " has won!");
                break;
            }
        }
    }
}
