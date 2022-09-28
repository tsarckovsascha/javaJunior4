package lesson6;

public class Krug {

    private double radius;

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public int getR() {
        return (int) this.radius;
    }

    public double diametr() {
        return radius / 2;
    }

    public double ploshad() {
        return Math.PI * (radius * radius);
    }

    public double perimetr() {
        return 2 * Math.PI * radius;
    }

}
