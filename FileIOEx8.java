import java.util.*;
import java.io.*;

public class FileIOEx8 {
    public static void main(String[] args) {
        try {//byte Stream
            FileOutputStream f = new FileOutputStream("D:\\xyz.txt");
            PrintStream p = new PrintStream(f);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String");
            String s = sc.nextLine();
            p.println(s);
            System.out.print("Enter a Double");
            Double d = sc.nextDouble();
            p.println(d);

            sc.close();
            p.close();
            f.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
