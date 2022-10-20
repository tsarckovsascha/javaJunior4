package lesson21;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class doClass = Class.forName("lesson21.Doctor");
        Field[] fields = doClass.getFields();
        Field[] declaredFields = doClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field name = doClass.getDeclaredField("name");
        System.out.println(name);

        Method setName = doClass.getMethod("setName", String.class);
        System.out.println();
        System.out.println(setName);
        System.out.println("_-_____________________---");

        Doctor doc = (Doctor) doClass.newInstance();
        System.out.println(doc);
        System.out.println("________________");

        Constructor constructor = doClass.getConstructor();
        Doctor doc1 = (Doctor)constructor.newInstance();
        System.out.println(doc1);

        Constructor constructor1 = doClass.getConstructor(String.class, int.class, double.class);
        Doctor qwe = (Doctor) constructor1.newInstance("qwe", 2, 3);
        System.out.println(qwe);

        setName.invoke(qwe, "ewq");
        System.out.println(qwe);
        System.out.println("_________________");

        Method setSalary = doClass.getDeclaredMethod("setSalary", double.class);
        setSalary.setAccessible(true);
        setSalary.invoke(qwe, 3.3333);
        System.out.println(qwe);

        Field name1 = doClass.getDeclaredField("name");
        name1.setAccessible(true);
        name1.set(qwe, "zxc") ;
        System.out.println(qwe);



    }
}
