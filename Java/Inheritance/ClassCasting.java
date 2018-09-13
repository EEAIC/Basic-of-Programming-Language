public class ClassCasting {
    public static void main(String[] args){
        SuperClass4 c = new SubClass4();
        c.run();
//      c.ppangppang();

        SubClass4 subClass4 = (SubClass4) c;
        subClass4.run();
        subClass4.ppangppang();
    }
}
