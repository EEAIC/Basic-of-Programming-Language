public class UsingThread3 {
    public static void main(String[] args){
        Thread3 thread = new Thread3();
        thread.start();

        System.out.println("시작");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("종료");
    }
}
