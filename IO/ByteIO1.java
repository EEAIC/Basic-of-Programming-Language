import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Exception;

public class ByteIO1 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("./src/ByteIO1.java");
            fos = new FileOutputStream("byte1.txt");

            int readData = -1;
            while((readData = fis.read()) != -1){
                fos.write(readData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
