package ex_28_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab220_Throws {
    public static void main(String[] args)  {

        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }
    }
}
