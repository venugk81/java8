package bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {
    public static void main(String[] args) {
        Function<String, String> f1 = s1 -> s1.toLowerCase();
        System.out.println(f1.apply("VENU GOPAL"));

        Function<String, Integer> f2 = s1 -> s1.length();
        System.out.println(f2.apply("Venu Gopi"));

        System.out.println("venu to lowercase and length is: " + f1.andThen(f2).apply("VENU"));

        BiFunction<String, Integer, Boolean> bif = (s1, intVal) -> {
            if (s1.length() >= 4 && s1.equals("Admin")) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(bif.apply("VEnu", 4));
        System.out.println(bif.apply("Admin", 4));
    }
}
