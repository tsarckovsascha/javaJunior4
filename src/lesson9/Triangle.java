package lesson9;

public class Triangle extends Figura {
    @Override
    public void printVolume() {
        super.printVolume();
        System.out.println("Вычисляем объём триугольника");
    }

    @Override
    public void printPloshad() {
        super.printPloshad();
        System.out.println("Вычисляем площадь трекгольника");
    }
}
