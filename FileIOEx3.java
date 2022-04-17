import java.util.*;
import java.io.*;

public class FileIOEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string here : ");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        sc.close();

        try { //character stream(Reader&Writer class)
             //FileWriter f = new FileWriter("D:\\xyz.txt"); //write mode
             FileWriter f = new FileWriter("D:\\xyz.txt", true); //append mode 
             f.write(c);
             //f.write(s); allowed
             f.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }



    }
    
}
