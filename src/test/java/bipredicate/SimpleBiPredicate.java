package bipredicate;

import java.util.function.BiPredicate;

public class SimpleBiPredicate {
    public static void main(String[] args) {

        //BiPredicate<String, String> biPredicate = String::equals;

        BiPredicate<String, String> biPredicate = (String s1, String s2) ->{
            return s1.equals(s2);
        };
        BiPredicate<String, String> biPredicate2 = (String s1, String s2) ->{
            return s1.length()==s2.length();
        };
        System.out.println("1: " + biPredicate.test("venu", "venu"));
        System.out.println("2: " + biPredicate.test("venu", "VenuGopi"));
        System.out.println("3: " + biPredicate.test("venu", "VenuG"));

        System.out.println("4: " + biPredicate2.and(biPredicate).test("venu", "VENU"));
        System.out.println("5: " + biPredicate.and(biPredicate2).test("venu", "VENU"));

        System.out.println("6: " + biPredicate2.or(biPredicate).test("venu", "VENU"));
        System.out.println("7: " + biPredicate.or(biPredicate2).test("venu", "VENU"));

        System.out.println("8: " + biPredicate.negate().test("venu", "venu"));
        System.out.println("9: " + biPredicate.negate().test("venu", "VENuGOPI"));

        BiPredicate<String, Integer> biPredicate1 = (String s1, Integer i1) ->{
            return s1.length()==i1;
        };
        System.out.println(biPredicate1.test("venu", 5));
        System.out.println(biPredicate1.test("venu", 4));
/*
        1: true
        2: false
        3: false
        4: false
        5: false
        6: true
        7: true
        8: false
        9: true
        false
        true
*/

    }

}
