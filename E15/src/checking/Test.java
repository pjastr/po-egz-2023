package checking;

public class Test {

    public static void main(String[] args) {
        System.out.println(Alg.isEqualOrNull("a", "a"));
        System.out.println(Alg.isEqualOrNull("a", "b"));
        System.out.println(Alg.isEqualOrNull(null, "b"));
        System.out.println(Alg.isEqualOrNull(null, null));
    }
}
