package homwork;

public class Homwork2 {
    public static void main(String[] args) {
        int[][] a = new int[11][11];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j + a.length/2 || i + j == a.length -1 + a.length/2 ||
                        i == j + a.length/-2 || i + j == a.length -1 + a.length/-2 )
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