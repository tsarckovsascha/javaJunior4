package homwork;

import lesson5.Ture;

public class Homwork5 {
    public static void main(String[] args) {
        String[][] turs = {
                {"Египет", "5", "Самолет", "30000"},
                {"Стамбул", "5", "Самолет", "40000"},
                {"Турция", "4", "Самолет", "25000"},
                {"Египет", "3", "Автобус", "20000"},
                {"Крым", "2", "Поезд", "10000"},
        };
        System.out.println("1)");
        Ture.getCountry1(turs, 20000, 30000);
        System.out.println("2)");
        Ture.getCounTrystars(turs, 4, 5);
        System.out.println("3)");
        Ture.getCountryTransport(turs, "Самолет");
    }
}
