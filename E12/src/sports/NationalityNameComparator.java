package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete>{
    @Override
    public int compare(Athlete o1, Athlete o2) {
        int base = o2.getNationality().compareTo(o1.getNationality());
        if (base != 0) return base;
        return o2.getName().compareTo(o1.getName());
    }
}
