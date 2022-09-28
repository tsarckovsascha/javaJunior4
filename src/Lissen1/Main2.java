package Lissen1;

public class Main2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 4;
        /* равносторонний
        равнобедренный
        правильный
         */
        if (a == b && b == c && c == a) {
            System.out.println("Pavnestoronni");
        } else if (a == b && c != a ||
                b == c && a != b ||
                c == b && a != c
        ) {
            System.out.println("Ravnodedrenii");
        } else if (a + b >= c && a + c >= b && c + b >= a) {
            System.out.println("ravelni");
        }
    }
}
// настроить кодироаку русского языка
// дз создать класс