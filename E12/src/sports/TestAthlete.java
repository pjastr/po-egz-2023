package sports;

import java.util.Arrays;

public class TestAthlete {

    public static void main(String[] args) {
        Athlete[] tab = new Athlete[4];
        tab[0] = new Athlete("Bolt", "Jamaica", new double[]{9.58, 19.19});
        tab[1] = new Athlete("Gatlin", "USA", new double[]{9.74, 19.57});
        tab[2] = new Athlete("Blake", "Jamaica", new double[]{9.69, 19.26});
        tab[3] = new Athlete("Bolt", "-", new double[]{9.58, 19.19});
        System.out.println("Before sorting:");
        for (Athlete athlete : tab) {
            System.out.println(athlete);
        }
        System.out.println("After sorting:");
        Arrays.sort(tab, new RecordComparator().thenComparing(new NationalityNameComparator()));
        for (Athlete athlete : tab) {
            System.out.println(athlete);
        }
    }
}
