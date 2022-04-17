import java.util.*;
import java.io.*;

public class FileIOEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter here: ");
        String s = sc.nextLine();
        byte b[] = s.getBytes();
        sc.close();

        try { //Byte Strem(Input&Output Classes)
              //FileOutputStream f = new FileOutputStream("D:\\abc.txt"); // write mode 
              FileOutputStream f = new FileOutputStream("D:\\abc.txt",true); // append mode 
              f.write(b);
              f.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
