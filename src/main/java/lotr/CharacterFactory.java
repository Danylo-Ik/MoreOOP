package lotr;
import java.util.Random;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.reflections.Reflections;
import java.lang.reflect.Modifier;


public class CharacterFactory {
    public Character createCharacter(){
        Reflections reflections = new Reflections("lotr");

        ArrayList<Class<? extends Character>> characters = new ArrayList<>(reflections.getSubTypesOf(Character.class));
        characters.removeIf(character -> Modifier.isAbstract(character.getModifiers()));

        Random rand = new Random();
        int index = rand.nextInt(characters.size());

        try {
            return characters.get(index).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
