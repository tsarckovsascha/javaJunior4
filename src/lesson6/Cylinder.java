package lesson6;

public class Cylinder {

    private double radius;

    private double height;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double ploshad () {
        return 2 * Math.PI * radius * ( height + radius);
    }
    double a = 2;
    public double volume () {
        return Math.PI * Math.pow(radius, a) * height;
    }

}
