import java.lang.Exception;

public class UsingUserDefinitionException {

    public static void main(String[] args) {
        UserDefinitionExceptionMethod biz = new UserDefinitionExceptionMethod();
        biz.bizMethod(5);
        try{
            biz.bizMethod(-3);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}