package algorithm;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(3);
        h1.add(4);
        HashSet<Integer> h2 = new HashSet<>();
        h2.add(5);
        h2.add(3);
        h2.add(-3);
        h2.add(4);
        Subset s1 = new Subset();
        System.out.println(s1.isSubset(h1, h2));
        HashSet<Book> h3 = new HashSet<>();
        h3.add(new Book("AA", "TT"));
        h3.add(new Book("BB", "SR"));
        HashSet<Book> h4 = new HashSet<>();
        h4.add(new Book("AA", "TT"));
        h4.add(new Book("PP", "NN"));
        h4.add(new Book("BB", "RR"));
        System.out.println(s1.isSubset(h3, h4));
    }
}
