package arrayAlg;

import java.util.Comparator;

public class Algorithm {

    public static <T extends Comparable<T>> int findMaxIndex(T[] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
