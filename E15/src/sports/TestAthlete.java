package sports;

import java.util.ArrayList;

public class TestAthlete {

    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("Usain Bolt", "Athletics", 2008));
        athletes.add(new Athlete("Michael Phelps", "Swimming", 2008));
        athletes.add(new Athlete("Michael Phelps", "Swimming", 2010));
        athletes.add(new Athlete("Roger Federer", "Tennis", 2012));
        System.out.println("Before sorting");
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
        athletes.sort(null);
        System.out.println("After sorting");
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
    }
}
