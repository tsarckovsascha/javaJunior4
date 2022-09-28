package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int i = 0;
        while (i < a.length) {
            int j = 0;
            while (j < a[i].length) {
                System.out.print(a[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
