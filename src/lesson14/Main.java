package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Student,Integer> map = new HashMap<>();

        Student student = new Student("����", 23);
        Student student1 = new Student("����", 34);
        Student student2 = new Student("����", 23);
        Student student3 = new Student("����", 23);

        map.put(student, 4);
        map.put(student1, 5);
        map.put(student2, 3);
        map.put(student3, 1);

        for (Map.Entry<Student,Integer> m :map.entrySet()){
    //        System.out.println("KEY =" + m.getKay() + ",  Value = " + m.getValue);
        }

        System.out.println(map);

    }
}
