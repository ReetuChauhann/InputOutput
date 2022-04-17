import java.util.*;
import java.io.*;

public class FileIOEx5 {
    public static void main(String[] args) { // reading the data from a file
        try { //character stream
            FileReader f = new FileReader("D:\\xyz.txt");
            int a;
            while ((a=f.read()) != -1) {
                System.out.println((char) a);
                
            }
             f.close();
             
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
