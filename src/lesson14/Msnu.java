package lesson14;

import java.util.TreeMap;

public class Msnu {
    public static void main(String[] args) {
        TreeMap<Integer,Student> map = new TreeMap<>();

            Student student = new Student("����", 23);
            Student student1 = new Student("����", 34);
            Student student2 = new Student("����", 23);
            Student student3 = new Student("����", 23);

             map.put(4, student );
             map.put(5, student1);
             map.put(89,student2);
             map.put(1,student3);

        System.out.println(map);

    }
}
