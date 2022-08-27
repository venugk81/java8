package methodreference;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface Interf{
    void abstractMethod();
}


public class SimpleMethRef  {

    public static void staticMethodOfClassSimpleMethRef(){
        System.out.println("Hey im inside staticMethodOfClassSimpleMethRef and calling it using method reference way");
        //let say this static method has all the method implementation and u dont want to override interface method again..
        // so instead of implementing an interface Interf, we can use methodReference and call the static method..
        //when we use method ref, we ref to static method in this case and call this method..
        // condition is, the paramerter os abstract method should match with this static method's parameters..
    }


    public static void main(String[] args) {
        //to provide implementation for abstrat methoc. using lambda
        Interf i= ()->{
            System.out.println("inside implementation");
        };
        i.abstractMethod();

        Interf i2= new Interf() {
            @Override
            public void abstractMethod() {
                System.out.println("implement abstract method using innerclass way");
            }
        };
        i2.abstractMethod();

       //another way is - class implements interface and then override the abstract method..

        //another way is to use method reference ::

        Interf i1 = SimpleMethRef::staticMethodOfClassSimpleMethRef;
        i1.abstractMethod();


    }


}
