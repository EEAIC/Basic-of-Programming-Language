import java.lang.Exception;

public class UserDefinitionException extends RuntimeException{
    public UserDefinitionException(String msg){
        super(msg);
    }
    public  UserDefinitionException(Exception ex){
        super(ex);
    }
}
