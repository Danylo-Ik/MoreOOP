package lotr;
import actions.Cryable;

public class Hobbit extends Character implements Cryable{
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }
    
    @Override
    public void toCry() {
        System.out.println("Hobbit cries :'(");
    }
}
