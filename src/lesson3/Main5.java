package lesson3;

public class Main5 {
    public static void main(String[] args) {
        int[] a123 = {1,2,3}; //3
        int[] a4567 = {4,5,6,7}; // 4
        int[] a17 = new int[a123.length + a4567.length];
        for (int i = 0; i < a17.length; i++) {
           if (i < a123.length) {
               a17[i] = a123[i];
           } else {
               a17[i] = a4567 [i - a123.length];
           }
            System.out.println(a17[i]);

        }

    }
}
