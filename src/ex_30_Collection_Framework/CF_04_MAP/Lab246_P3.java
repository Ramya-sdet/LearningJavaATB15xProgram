package ex_30_Collection_Framework.CF_04_MAP;


import java.util.*;

public class Lab246_P3 {
    public static void main(String[] args) {
        Map m1 = new HashMap();

        // Map is key - value

        m1.put("name", "preethi");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);


        Map m2 = new LinkedHashMap();
        m2.put("name","preethi");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);



        Map m3 = new TreeMap();

        m3.put("name","preethi");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);


    }
}