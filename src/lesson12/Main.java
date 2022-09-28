package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        long startList = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add("qwe" +i);
        }
        System.out.println("ArrayList time" + (System.currentTimeMillis() - startList));

        long startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add("qwe" +i);
        }
        long startListGet = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.get(i);
        }
        System.out.println("ArrayList time" + (System.currentTimeMillis() - startList));

        long startLinkedListGet = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.get(i);
        }
   //     System.out.println("LinkedList") + ;
    }
}
