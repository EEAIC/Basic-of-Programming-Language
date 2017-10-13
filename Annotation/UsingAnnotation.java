import java.lang.Exception;
import java.lang.reflect.Method;

public class UsingAnnotation {
    public static void main(String[] args){
        AnnotationMethod hello = new AnnotationMethod();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello");

            if(method.isAnnotationPresent(Annotation.class)){
                for(int i = 0; i < 100; i++){
                    hello.hello();
                }
            }else{
                hello.hello();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
