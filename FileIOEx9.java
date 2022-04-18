import java.util.*;
import java.io.*;

public class FileIOEx9 {

    public static void main(String[] args) {
        try{// char stream
            FileWriter f = new FileWriter("D:\\abc.txt");
            PrintWriter p = new PrintWriter(f);
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
