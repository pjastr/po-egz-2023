package checking;

public class Alg {

    public static <T> boolean isEqualOrNull(T arg1, T arg2){
        if(arg1 == null && arg2 == null){
            return true;
        }
        if(arg1 == null || arg2 == null){
            return false;
        }
        return arg1.equals(arg2);
    }
}
