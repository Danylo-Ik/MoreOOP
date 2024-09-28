package lotr;
import actions.Kickable;

public class Character implements Kickable {
    private int power;
    private int hp;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    public Character() {
        this(1, 1);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
        this.hp = hp;
        }
    }

    @Override
    public void kick(Character c){
        c.setHp(c.getHp() - this.power);
    }

    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + 
            '{' + "hp=" + hp + ", power=" + power + '}';
    }
}

