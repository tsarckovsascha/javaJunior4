package homwork;

import lesson5.Ture;

public class Homwork5 {
    public static void main(String[] args) {
        String[][] turs = {
                {"������", "5", "�������", "30000"},
                {"�������", "5", "�������", "40000"},
                {"������", "4", "�������", "25000"},
                {"������", "3", "�������", "20000"},
                {"����", "2", "�����", "10000"},
        };
        System.out.println("1)");
        Ture.getCountry1(turs, 20000, 30000);
        System.out.println("2)");
        Ture.getCounTrystars(turs, 4, 5);
        System.out.println("3)");
        Ture.getCountryTransport(turs, "�������");
    }
}
