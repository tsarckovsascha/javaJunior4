package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Maindz {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList1 = new ArrayList<>();
        ArrayList<Integer>arrayList2 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);

        Collections collections = new Collections();
        Collection<Integer> union = collections.union(arrayList1, arrayList2);
        System.out.println(union);

        ArrayList<Integer>arrayList3 = new ArrayList<>();
        ArrayList<Integer>arrayList4 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList4.add(3);
        arrayList4.add(4);
        arrayList4.add(5);

        Collections collections1 = new Collections();
        Collection<Integer> intersection = collections.intersection(arrayList3, arrayList4);
        System.out.println(intersection);

        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);

        Collections collectionss2 = new Collections();
        HashSet<Integer> unionWithoutDuplicate = (HashSet<Integer>) collections.unionWithoutDuplicate(hashSet1,hashSet2);
        System.out.println(unionWithoutDuplicate);

        HashSet<Integer> hashSet3 = new HashSet<>();
        HashSet<Integer> hashSet4 = new HashSet<>();
        hashSet3.add(1);
        hashSet3.add(2);
        hashSet3.add(3);
        hashSet4.add(3);
        hashSet4.add(4);
        hashSet4.add(5);

        Collections collectionss3 = new Collections();
        HashSet<Integer> intersectionWithoutDuplicate = (HashSet<Integer>) collections.intersectionWithoutDuplicate(hashSet1,hashSet2);
        System.out.println(intersectionWithoutDuplicate);

        ArrayList<Integer>arrayList5 = new ArrayList<>();
        ArrayList<Integer>arrayList6 = new ArrayList<>();
        arrayList5.add(1);
        arrayList5.add(2);
        arrayList5.add(3);
        arrayList6.add(3);
        arrayList6.add(4);
        arrayList6.add(5);

        Collections collection = new Collections();
        Collection<Integer> difference = collections.difference(arrayList1, arrayList2);
        System.out.println(difference);

    }
}
