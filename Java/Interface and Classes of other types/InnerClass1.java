public class InnerClass1 {
    class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args){
        InnerClass1 t = new InnerClass1();
        InnerClass1.Cal cal = t.new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
