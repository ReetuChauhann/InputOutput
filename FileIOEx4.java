import java.util.*;
import java.io.*;

public class FileIOEx4 { // readind the data from a file

    public static void main(String[] args) {
        try { // byte stream
            FileInputStream f = new FileInputStream("D:\\abc.txt");
            int a;
            while ((a = f.read()) != -1) {
                System.out.println((char) a);
            }
            f.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
