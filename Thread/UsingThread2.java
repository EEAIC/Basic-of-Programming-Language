public class UsingThread2 {
    public static void main(String[] args){
        Thread2 t1 = new Thread2("*");
        Thread2 t2 = new Thread2("-");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();

        thread2.start();

        System.out.println("main end!!!!");
    }
}
