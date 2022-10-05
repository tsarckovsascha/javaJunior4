package lesson15;

import java.util.TreeSet;
import org.apache.log4j.Logger;

public class Main {

    public static final Logger LOGGER15 = Logger.getLogger(lesson15.Main.class);

    public static void main(String[] args) {

        Tovar tovar = new Tovar("�������", 10000);         LOGGER15.trace("������ ����� �����");
        Tovar tovar1 = new Tovar("�������������", 4500);         LOGGER15.trace("������ ����� �����");
        Tovar tovar2 = new Tovar("���������", 20000);         LOGGER15.trace("������ ����� �����");
        Tovar tovar3 = new Tovar("�������", 20000);         LOGGER15.trace("������ ����� �����");
        Tovar tovar4 = new Tovar("�����", 100);         LOGGER15.trace("������ ����� �����");


        Otziv otziv = new Otziv(5,"����� �������");
        Otziv otziv1 = new Otziv(3,"������� �� �����");
        Otziv otziv3 = new Otziv(5,"������ �� �������� �� ������");
        Otziv otziv4 = new Otziv(4,"����� ���������");

        Obzor obzor = new Obzor("����� �� ���� ����", "qwe");

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
        LOGGER15.error("�������� �����, ��������� ���������� �� ����������� ����");
        System.out.println("___________����____________");


        TreeSet<Tovar> tovars1 = Tovar.sortbyPriceToFrom(tovars);
        System.out.println(tovars1);

      /*  System.out.println("__________�������� ����_____________");


        TreeSet<Tovar> sortTovarsname = Tovar.sortbyPriceToFrom(tovars);
        System.out.println(sortTovarsname);*/

        LOGGER15.error("�������� �����, ��������� ���������� �� �������� ����");
        System.out.println("_________�������� ����______________");


        TreeSet<Tovar> sortTovarsname1 = Tovar.sortByNameFromTo(tovars);
        System.out.println(sortTovarsname1);
        LOGGER15.trace("�������� �����, ��������� ���������� �� ������������ ");
        System.out.println("__________���____________");


        TreeSet<Tovar> sortTovarsname2 = Tovar.sortByRateFromTo(tovars);
        System.out.println(sortTovarsname2);
        LOGGER15.error("�������� �������, ��������� ���������� ��  ��������");
        System.out.println("__________�������_____________");


        TreeSet<Tovar> sortTovarsname3 = Tovar.sortByOtzivFromTo(tovars);
        System.out.println(sortTovarsname3);
        LOGGER15.error("�������� �����, ��������� ���������� ��  ������");
        System.out.println("__________�����_____________");


        TreeSet<Tovar> sortTovarsname4 = Tovar.sortByObzorFromTo(tovars);
        System.out.println(sortTovarsname4);
        LOGGER15.error("�������� �����, ��������� ���������� ��  ������");
        System.out.println("__________�����_____________");

        System.out.println(" ");


    }
}
