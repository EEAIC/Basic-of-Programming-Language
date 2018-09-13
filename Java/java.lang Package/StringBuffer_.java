public class StringBuffer_ {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        sb1.append(" ");
        sb1.append("world");

        String str1 = sb1.toString();
        System.out.println(str1);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello"); //this가 반환 -> Method chaining
        if (sb2 == sb3){
            System.out.println("sb2 == sb3");

            String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
            System.out.println(str2);
        }
    }
}
