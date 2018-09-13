public class UsingDefaultMethod {
    public static void main(String[] args){
        DefaultMethod cal = new DefaultMethodImplement();
        cal.plus(3 ,4);
        cal.exec(5, 6);
        int i = cal.exec(5, 6);
        System.out.println(i);

        DefaultMethod.exec2(3, 4);
    }
}
