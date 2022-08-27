package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class SimplECOnsumerEg {
    public static void main(String[] args) {
        Consumer<String> checkString = s -> {
            if(s.equals("testing")){
                System.out.println("Test is passed");
            }else{
                System.out.println("test is failed");
            }
        };

        checkString.accept("Testing");      //test is failed
        checkString.accept("testing");      //Test is passed
//        test is failed
//        Test is passed

        BiConsumer<String, String> c2 = (s1,s2) ->{
          if(s1.equals(s2)){
              System.out.println("s1 equals to s2");
          }else{
              System.out.println("s1 is not equals to s2");
          }
        };
        c2.accept("venu", "Venu");      //s1 is not equals to s2
        c2.accept("venu", "venu");      //s1 equals to s2
    }
}
