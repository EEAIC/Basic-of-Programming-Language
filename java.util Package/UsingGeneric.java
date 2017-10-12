public class UsingGeneric {
    public static void main(String[] args){
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello");
//        String str = (String)box.getObj();
//        System.out.println(str);
//
//        box.setObj(1);
//        int value = (int)box.getObj();

        Generic<Object> box1 = new Generic<>();
        box1.setObj(new Object());
        Object obj = box1.getObj();

        Generic<String> box2 = new Generic<>();
        box2.setObj("hello");
        String str = box2.getObj();
        Generic<Integer> box3 = new Generic<>();
        box3.setObj(4);
        int val = box3.getObj();
    }
}
