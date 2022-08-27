package methodreference;


interface  InterTest{
    MethodRefFOrConstructor get();
}
public class MethodRefFOrConstructor {
    int i;
    String s ;
    MethodRefFOrConstructor(){      //constructor
        i = 10;
        s= "venu";
        System.out.println("i am in constructor");
    }

    public void test(){
        System.out.println("im in test method/..");
    }

    public static void main(String[] args) {
        //implement using lambda expression
        InterTest t1 = ()-> {
            return new MethodRefFOrConstructor();
            //or MethodRefFOrConstructor m1= new MethodRefFOrConstructor();
        };
        //implemented using lambda expression
        t1.get();

        //using Method reference for constructor..
        InterTest t2 = MethodRefFOrConstructor::new;
        t2.get();
        // to have a ref
        MethodRefFOrConstructor m2 = t2.get();      // creates a class object and returns its ref..
        m2.test();
        System.out.println(m2.s);
    }
}
