package lesson5;

public class Ture {
    public static void getCountry(String[][] mass, String name) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i][0].equals(name)) {
                System.out.println(" Направление " + mass[i][0] + " Отель  " + mass[i][1]
                        + " Добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }

    public static void getCountry(String[][] mass, String name, int summ) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i][0].equals(name) &&
                    Integer.parseInt(mass[i][3]) < (summ)) {
                System.out.println(" Направление " + mass[i][0] + " Отель  " + mass[i][1]
                        + " Добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }


    public static int getTyreStars(String[][] mass, int s) {
        int stars = 0;
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) == s) {
                stars++;
            }
        }
        System.out.println(stars);
        return stars;
    }

    public static void getCountry1(String[][] mass, int summmin, int summmax) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][3]) >= summmin && Integer.parseInt(mass[i][3]) <= summmax) {
                System.out.println(" Направление " + mass[i][0] + " Отель  " + mass[i][1]
                        + " Добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }

    public static void getCounTrystars(String[][] mass, int starmin, int starmax) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) >= starmin && Integer.parseInt(mass[i][1]) <= starmax) {
                System.out.println(" Направление " + mass[i][0] + " Отель  " + mass[i][1]
                        + " Добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }

    public static void getCountryTransport(String[][] mass, String q) {
        for (int i = 0; i < mass.length; i++) {
            if (!(mass[i][2].equals(q) )) {
                System.out.println(" Направление " + mass[i][0] + " Отель  " + mass[i][1]
                        + " Добираться " + mass[i][2] + " Цена " + mass[i][3]);
                }
            }
        }
    }
