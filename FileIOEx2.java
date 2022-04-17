import java.util.*;
import java.io.*;

public class FileIOEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {// byte Stream
            // FileOutputStream f = new FileOutputStream("D:\\abc.txt"); // write mode
             FileOutputStream f = new FileOutputStream("D:\\abc.txt", true); // append mode
            
              String s;
              do {
                    System.out.print("Enter here : ");
                    s=sc.nextLine();
                    byte b[] = s.getBytes();
                    f.write(b);
                    f.write('\n');
                     
                } while (!s.equalsIgnoreCase("stop"));

                  f.close();
                 sc.close();
            
        } catch (Exception e) {
            System.out.println("e");
        }
    }
    
}
