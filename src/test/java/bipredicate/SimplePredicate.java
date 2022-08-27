package bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class SimplePredicate {
    public static void main(String[] args) {

        //BiPredicate<String, String> biPredicate = String::equals;

        Predicate<String> predicate = (s1) ->{
            return s1.equals("Admin");
        };

        Predicate<String> predicate2 = s2 ->{
            return s2.length()>=16;
        };

        System.out.println("p1: "+predicate.test("Admins"));                                                //false
        System.out.println("p2: "+predicate2.test("abczxasdfasdfasdfasdfyasdf"));                           //true
        System.out.println("p3 and: "+predicate.and(predicate2).test("Admin"));                             //false
        System.out.println("p4 and 16 chars: "+predicate.and(predicate2).test("Adminasdfasfasdfasdfasdf  "));    //false
        System.out.println("p5 or: "+predicate.or(predicate2).test("Admin"));                               //true



    }

}
