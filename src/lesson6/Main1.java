package lesson6;

public class Main1 {
    public static void main(String[] args) {
        Treugolnik tr1 = new Treugolnik();

        tr1.setA(3);
        tr1.setB(4);
        tr1.setC(5);

       // System.out.println("����������� �� ��������� " + " a = " + tr1.getA() + " b = "
          //     + tr1.getB() + " c = " + tr1.getC());
        System.out.println("�������� = " + tr1.perimetr());
        System.out.println("������� = " +tr1.ploshad());
    }
}
