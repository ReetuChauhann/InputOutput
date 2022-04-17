import java.util.*;
import java.io.*;

public class FileIOEx6 { //read from one file write into another file
    public static void main(String[] args) {
        try { // character stream
              FileReader f1 = new FileReader("D:\\xyz.txt");
              FileWriter f2 = new FileWriter("D:\\abc.txt");
              int a ;
              while ((a=f1.read()) != -1) {
                    f2.write((char)a);
            }
              f1.close();
              f2.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
