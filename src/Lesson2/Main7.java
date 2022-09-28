package Lesson2;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 7; day++) {
            for (int chas = 0; chas < 24; chas++) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        System.out.println(" proshlo " + day + " day " + chas + " chas " + min + " minut " + sec + " secund ");
                        Thread.sleep(1000);
                    }
                }
            }
        }


    }
}
