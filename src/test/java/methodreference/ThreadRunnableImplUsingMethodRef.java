package methodreference;

public class ThreadRunnableImplUsingMethodRef {
    public void instanceMethod(){
        for (int i=0; i< 10; i++){
            System.out.println("child thread - implemented suing this: "+ i);
        }
    }

    public static void main(String[] args) {
        ThreadRunnableImplUsingMethodRef tr = new ThreadRunnableImplUsingMethodRef();
        Runnable r = tr::instanceMethod;
        Thread thread = new Thread(r);
        thread.start();

        for(int i=11; i< 20; i++){
            System.out.println("Main thread: "+ i);
        }
    }

}
