package methodreference;

interface Inter{
    void abstractMethod();
}
public class MethodRefPart3 {
    public void instanceMethod(){
        System.out.println("I am in instance method");
    }

    public static void main(String[] args) {
        MethodRefPart3 m = new MethodRefPart3();
        Inter in = m::instanceMethod;       //method ref using instance method..
        in.abstractMethod();
    }
}
