package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int [] a = {1,2,5,4,63,7,8,9,7,8};
        for (int i = 0; i < a.length; i++) {
            if ( a[i] % 2 == 0) {
                System.out.println(a[i]);
            }

        }
    }
}
