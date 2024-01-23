package restaurant;

import java.util.ArrayList;

public class TestChef {

    public static void main(String[] args) {
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(1, "John", 3.5));
        chefs.add(new Chef(2, "Mary", 4.0));
        chefs.add(new Chef(3, "Peter", 3.0));
        chefs.add(new Chef(4, "Paul", 4.0));
        System.out.println("Before sorting:");
        for (Chef chef : chefs) {
            System.out.println(chef);
        }
        chefs.sort(new SkillLevelNameComparator());
        System.out.println("After sorting:");
        for (Chef chef : chefs) {
            System.out.println(chef);
        }
    }
}
