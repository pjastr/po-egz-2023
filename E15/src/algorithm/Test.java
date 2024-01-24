package algorithm;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(-13.0);
        System.out.println(set);
        Alg.clearIfContains(set, 2.0);
        System.out.println(set);
    }
}
