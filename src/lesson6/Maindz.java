package lesson6;

import java.util.Scanner;

public class Maindz {
    public static void main(String[] args) {
        System.out.println("�������� ������");
        System.out.println("1 - �����������");
        System.out.println("2 - ����");
        System.out.println("3 - �������");
        System.out.println("4 - �������");
        System.out.println("5 - �����");

        Scanner scanner = new Scanner(System.in);
        int figura = scanner.nextInt();

        switch (figura){
            case 1 :
                Treugolnik treugolnik = new Treugolnik();
                System.out.println("������ a");
                treugolnik.setA(scanner.nextInt());

                System.out.println("������ b");
                treugolnik.setB(scanner.nextInt());

                System.out.println("������ c");
                treugolnik.setC(scanner.nextInt());

                System.out.println("�������� = " + treugolnik.perimetr());

                System.out.println("������� = " + treugolnik.ploshad());
                break;
            case 2 :
                Krug krug = new Krug();
                System.out.println("������� ������");
                krug.setRadius(scanner.nextInt());

                System.out.println("�������� = " + krug.perimetr());

                System.out.println("������� = " + krug.ploshad());

                System.out.println("������� = " + krug.diametr());

                break;
            case 3 :
                square square = new square();
                System.out.println("������� ����� �������");
                square.setSide(scanner.nextInt());

                System.out.println("�������� = " + square.perimetr());

                System.out.println("������� = " + square.plosad());

                break;
            case 4 :
                Cylinder cylinder = new Cylinder();
                System.out.println("������� ������ �������� ");
                cylinder.setRadius(scanner.nextInt());

                System.out.println("������� ������ �������� ");
                cylinder.setHeight(scanner.nextInt());

                System.out.println("������� = " + cylinder.ploshad());

                System.out.println("����� = " + cylinder.volume());

                break;
            case 5 :
                �one cone = new �one();
                System.out.println("������� ������ ������");
                cone.setRadius(scanner.nextInt());

                System.out.println("������� ������ ������");
                cone.setHeight(scanner.nextInt());

                System.out.println("���������� = " + cone.obrazuyshaya());

                System.out.println("������� ������ = " + cone.ploshadCone());

                System.out.println("������� ����� = " + cone.ploshadKruga());

                System.out.println("����� ������� = " + cone.ObshayaPloshad());

                System.out.println(" ����� = " + cone.volume());

                break;
            default:
            System.out.println("��� ����� ������");
        }
    }
}
