package Lesson2;

public class Main6 {
    public static void main(String[] args) {
        for (int i = 20; i < 70; i = i + 1) {
            if(i % 4 == 0 && i % 7 == 0) // 4 * 7 = 28 ����������� i % 28 == 0 �� �� �����
            {
                System.out.println(i);
            }
        }
    }
}
