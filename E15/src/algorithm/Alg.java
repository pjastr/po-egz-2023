package algorithm;

import java.util.Collection;

public class Alg {

    public static <T> void clearIfContains(Collection<T> collection, T element){
        if (collection == null) {
            throw new IllegalArgumentException("Collection cannot be null");
        }
        if(collection.contains(element)){
            collection.clear();
        }
    }
}
