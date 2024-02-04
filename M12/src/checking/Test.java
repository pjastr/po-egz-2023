package checking;

public class Test {

    public static void main(String[] args) {

    }

    public static <T> boolean checkIfExists(T[] array, T elem){
        if (array == null || elem ==null){
            throw new IllegalArgumentException("");
        }
        for(var e: array){
            if (elem.equals(e))
                return true;
        }
        return  false;
    }

}
