import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Exception;

public class ByteIO2 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("src/ByteIO2.java");
            fos = new FileOutputStream("byte2.txt");

            int readCount = -1;
            byte[] buffer = new byte[512];
            while((readCount = fis.read(buffer)) != -1){
                fos.write(buffer, 0, readCount);
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
