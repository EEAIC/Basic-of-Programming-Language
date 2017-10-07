public class Method2 {
    public static void main(String[] args){
        MethodOverload m = new MethodOverload();

        System.out.println(m.plus(4, 5));
        System.out.println(m.plus(4, 6, 7));
        System.out.println(m.plus("hello", "world"));
    }
}
