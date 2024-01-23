package restaurant;

import java.util.Comparator;

public class SkillLevelNameComparator implements Comparator<Chef> {

    @Override
    public int compare(Chef o1, Chef o2) {
        int base = Double.compare(o2.getSkillLevel(), o1.getSkillLevel());
        if (base!=0) return base;
        return o1.getName().compareTo(o2.getName());
    }
}
