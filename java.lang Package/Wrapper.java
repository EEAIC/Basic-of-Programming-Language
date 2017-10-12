public class Wrapper {
    public static void main(String[] args){
        int i = 5;
        Integer i2 = new Integer(5);

        Integer i3 = 5; //AutoBoxing

        int i4 = i3.intValue();

        int i5 = i3; //AutoUnboxing

    }
}
