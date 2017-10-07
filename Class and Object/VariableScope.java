public class VariableScope {
    int globalScope = 10;
    static int staticVal = 7;
    public void scopeTest (int value) {
        int localScope = 20;


        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);

    }

    public void scopeTest2 (int value2){
        System.out.println(globalScope);
//      System.out.println(localScope);
//      System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args){
//      System.out.println(globalScope);
//      System.out.println(localScope);
//      System.out.println(value);
        System.out.println(staticVal);

        VariableScope v1 = new VariableScope();
        System.out.println(v1.globalScope);
        VariableScope v2 = new VariableScope();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
//      v1.staticVal = 50;
//      v2.staticVal = 100;
//      System.out.println(v1.staticVal);
//      System.out.println(v2.staticVal);
        System.out.println(VariableScope.staticVal);
    }
}
