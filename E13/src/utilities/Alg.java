package utilities;

public class Alg {

    public <T extends Comparable<T>> T findMin(T arg1, T arg2, T arg3){
        T min = arg1;
        if(arg2.compareTo(min) < 0){
            min = arg2;
        }
        if(arg3.compareTo(min) < 0){
            min = arg3;
        }
        return min;
    }
}
