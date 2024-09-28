package lotr;
import java.util.Random;

public abstract class Warrior extends Character {
    Random random = new Random();
    int power_floor;
    int power_top;

    public Warrior(int hp_floor, int hp_top, int power_floor, int power_top) {
        this.power_floor = power_floor;
        this.power_top = power_top;
        this.setHp(random.nextInt(hp_top - hp_floor) + hp_floor);
        this.setPower(random.nextInt(power_top - power_floor) + power_floor);
    }

    @Override
    public void kick(Character c) {
        this.setPower(random.nextInt(this.power_top - power_floor) + power_floor);
        c.setHp(c.getHp() - this.getPower());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + 
            '{' + "power=" + power_floor + ':' + power_top + ", hp=" + this.getHp() + '}';
    }
}
