package homwork;

public class Ture1 {
    public static void getCountry(String[][] mass, int summ) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][3]) == summ)  {
                boolean s = summ < 40000 && summ > 20000;
                System.out.println(" ����������� " + mass[i][0] + " �����  " + mass[i][1]
                        + " ���������� " + mass[i][2] + " ���� " + mass[i][3]);
            }
        }
    }
}
