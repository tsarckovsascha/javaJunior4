package lesson9;

public class Triangle extends Figura {
    @Override
    public void printVolume() {
        super.printVolume();
        System.out.println("��������� ����� ������������");
    }

    @Override
    public void printPloshad() {
        super.printPloshad();
        System.out.println("��������� ������� ������������");
    }
}
