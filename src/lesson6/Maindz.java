package lesson6;

import java.util.Scanner;

public class Maindz {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Круг");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Цилиндр");
        System.out.println("5 - Конус");

        Scanner scanner = new Scanner(System.in);
        int figura = scanner.nextInt();

        switch (figura){
            case 1 :
                Treugolnik treugolnik = new Treugolnik();
                System.out.println("Ведите a");
                treugolnik.setA(scanner.nextInt());

                System.out.println("Ведите b");
                treugolnik.setB(scanner.nextInt());

                System.out.println("Ведите c");
                treugolnik.setC(scanner.nextInt());

                System.out.println("Периметр = " + treugolnik.perimetr());

                System.out.println("Площадь = " + treugolnik.ploshad());
                break;
            case 2 :
                Krug krug = new Krug();
                System.out.println("Введите радиус");
                krug.setRadius(scanner.nextInt());

                System.out.println("Периметр = " + krug.perimetr());

                System.out.println("Площадь = " + krug.ploshad());

                System.out.println("Диаметр = " + krug.diametr());

                break;
            case 3 :
                square square = new square();
                System.out.println("Введите длину стороны");
                square.setSide(scanner.nextInt());

                System.out.println("Периметр = " + square.perimetr());

                System.out.println("Площадь = " + square.plosad());

                break;
            case 4 :
                Cylinder cylinder = new Cylinder();
                System.out.println("Введите радиус цилиндра ");
                cylinder.setRadius(scanner.nextInt());

                System.out.println("Введите высоту цилиндра ");
                cylinder.setHeight(scanner.nextInt());

                System.out.println("Площадь = " + cylinder.ploshad());

                System.out.println("Объём = " + cylinder.volume());

                break;
            case 5 :
                Сone cone = new Сone();
                System.out.println("Введите радиус конуса");
                cone.setRadius(scanner.nextInt());

                System.out.println("Введите высоту конуса");
                cone.setHeight(scanner.nextInt());

                System.out.println("Образующая = " + cone.obrazuyshaya());

                System.out.println("Площадь конуса = " + cone.ploshadCone());

                System.out.println("Площадь круга = " + cone.ploshadKruga());

                System.out.println("Общая площадь = " + cone.ObshayaPloshad());

                System.out.println(" Объём = " + cone.volume());

                break;
            default:
            System.out.println("Нет такой фигуры");
        }
    }
}
