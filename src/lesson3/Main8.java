package lesson3;

public class Main8 {
    public static void main(String[] args) {
        int[][] a = new int[7][7];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ( i % 2 == 0 ||  j % 2 != 0 ) //  if ((i + j) % 2 == 0) {
                {
                    System.out.print("* ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
