package lesson7.shop;

public class Main {
    public static void main(String[] args) {
        Tovar vedro = new Tovar("Ведро черное ", 100);
        Tovar kastrylya = new Tovar("кастрюля золотая", 2000);
        Tovar plazma = new Tovar("Телик тонкий", 10000);
        Tovar styralka = new Tovar("стриалка для холостяка ", 5000);

        Otziv otziv = new Otziv(5,"Ведро супер");
        Otziv otziv1 = new Otziv(4,"Ведро не очень");
        Otziv otziv2 = new Otziv(4,"Телик супер тонкий");
        Otziv otziv3 = new Otziv(2,"Не берите это");
        Otziv otziv4 = new Otziv(5,"Супер");

        vedro.setOtziv(otziv);
        vedro.setOtziv(otziv1);
        plazma.setOtziv(otziv2);
        styralka.setOtziv(otziv3);
        styralka.setOtziv(otziv4);

        System.out.println(vedro.srednayRate());

    }
}
