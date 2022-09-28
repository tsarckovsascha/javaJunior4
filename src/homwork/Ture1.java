package homwork;

public class Ture1 {
    public static void getCountry(String[][] mass, int summ) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][3]) == summ)  {
                boolean s = summ < 40000 && summ > 20000;
                System.out.println(" Направление " + mass[i][0] + " Отель  " + mass[i][1]
                        + " Добираться " + mass[i][2] + " Цена " + mass[i][3]);
            }
        }
    }
}
