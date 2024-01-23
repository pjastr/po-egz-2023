package animals;

public class Checking {

    public static <T extends Animal> boolean isSameSpecies(T animal, T animal2){
        return animal.getClass() == animal2.getClass();
    }
}
