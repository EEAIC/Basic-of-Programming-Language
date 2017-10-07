public class UsingMethod {
    public static void main(String[] args){
        Method method = new Method();
        method.method1();
        method.method2(10);
        int value = method.method3();
        System.out.println("m3이 리턴한 값" + value);
        method.method4(5, 10);
        int value2 = method.method5(55);
        System.out.println("m5가 리턴한 값: "+ value2);
    }
}
