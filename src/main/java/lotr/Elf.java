package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        }
        if (c.getPower() > 0) {
            c.setPower(c.getPower() - 1);
        }
    }
}
