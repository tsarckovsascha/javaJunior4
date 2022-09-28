package lesson15;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Телефон", 10000);
        Tovar tovar1 = new Tovar("Микровалновка", 4500);
        Tovar tovar2 = new Tovar("Теливизор", 20000);
        Tovar tovar3 = new Tovar("Самокат", 20000);
        Tovar tovar4 = new Tovar("Ведро", 100);


        Otziv otziv = new Otziv(5,"супер телефон");
        Otziv otziv1 = new Otziv(3,"телефон не очень");
        Otziv otziv3 = new Otziv(5,"Укатил на самокате от бывшей");
        Otziv otziv4 = new Otziv(4,"Ведро протекает");

        Obzor obzor = new Obzor("Обзор на краш тест", "qwe");

        tovar.addOtziv(otziv);
        tovar.addOtziv(otziv1);
        tovar3.addOtziv(otziv3);
        tovar4.addOtziv(otziv4);


        tovar.addObzor(obzor);
        tovar2.addObzor(obzor);
        tovar4.addObzor(obzor);


        TreeSet<Tovar>tovars = new TreeSet<>();

        tovars.add(tovar);
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);

        System.out.println(tovars);
        System.out.println("___________цена____________");


        TreeSet<Tovar> tovars1 = Tovar.sortbyPriceToFrom(tovars);
        System.out.println(tovars1);

      /*  System.out.println("__________обртаная цена_____________");


        TreeSet<Tovar> sortTovarsname = Tovar.sortbyPriceToFrom(tovars);
        System.out.println(sortTovarsname);*/


        System.out.println("_________обртаная цена______________");


        TreeSet<Tovar> sortTovarsname1 = Tovar.sortByNameFromTo(tovars);
        System.out.println(sortTovarsname1);

        System.out.println("__________имя____________");


        TreeSet<Tovar> sortTovarsname2 = Tovar.sortByRateFromTo(tovars);
        System.out.println(sortTovarsname2);

        System.out.println("__________рейтинг_____________");


        TreeSet<Tovar> sortTovarsname3 = Tovar.sortByOtzivFromTo(tovars);
        System.out.println(sortTovarsname3);

        System.out.println("__________отзыв_____________");


        TreeSet<Tovar> sortTovarsname4 = Tovar.sortByObzorFromTo(tovars);
        System.out.println(sortTovarsname4);

        System.out.println("__________обзор_____________");

        System.out.println(" ");

    }
}
