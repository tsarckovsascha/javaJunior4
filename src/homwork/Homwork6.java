package homwork;

public class Homwork6 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int a ;
                int b = 1;
                if (numbers[i][j] % 7 == 0){
                    a = numbers[i][j] + (numbers[i][j] + 1) +
                            (numbers[i][j] - 1);
                    numbers[i][j] = a;
                    System.out.println(a);
                }
                else {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}



