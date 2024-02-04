package retail;

import java.util.ArrayList;

public class TestReceipt {

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Double> list = new ArrayList<>();
        list.add(4.5);
        list.add(3.2);
        Receipt r1 = new Receipt("AA", list);
        Receipt r2 = r1.clone();
        r2.change(20.3);
        System.out.println(r1);
        System.out.println(r2);
    }
}
