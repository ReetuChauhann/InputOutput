import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class FileIOEx10 {
    public static void main(String[] args) {
        try {
               FileOutputStream f = new FileOutputStream("D:\\abc.txt",true);//append mode 
               PrintStream p = new PrintStream(f);

               String s = "Reetu Chauhan";
               p.println(s);

               System.out.println(s);
               System.setOut(p);
               System.out.println(s);
               p.close();
               f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
