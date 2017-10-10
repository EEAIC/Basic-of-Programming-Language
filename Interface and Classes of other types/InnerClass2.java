public class InnerClass2 {
    static class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args){
        InnerClass2.Cal cal = new InnerClass2.Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
