package sports;

import java.util.Arrays;
import java.util.Comparator;

public class RecordComparator implements Comparator<Athlete> {


    @Override
    public int compare(Athlete obj1, Athlete obj2) {
        return Double.compare(obj1.getMaxRecord(), obj2.getMaxRecord());
    }
}
