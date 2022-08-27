package methodreference;

@FunctionalInterface
interface interf2{
    int sum(int a, int b);
}
public class MethodRef2 {
    public static int sumof2Numbers(int a , int b){
        return (a+b);
    }
    public static double sumof2NumbersAndReturnString(int a , double b){
        return (a+b);
    }
    public static void main(String[] args) {

        interf2 i1 = MethodRef2::sumof2Numbers;
        System.out.println(i1.sum(1,2));

        //interf2 i2 = MethodRef2::sumof2NumbersAndReturnString;
        // cannot call this using method ref.. return type and parameters type should match..
        //Bad return type in method reference: cannot convert double to int


    }
}
