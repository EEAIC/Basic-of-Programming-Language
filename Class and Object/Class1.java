public class Class1 {
    public static void main(String[] args){
        Car1 c1 = new Car1();
        Car1 c2 = new Car1();

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;

        System.out.println(c1.name);
        System.out.println(c1.number);

        System.out.println(c2.name);
        System.out.println(c2.number);
    }
}
