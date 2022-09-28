package lesson6;

public class Ñone {
    private double radius;
    private double height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double obrazuyshaya() {
       return Math.sqrt((radius * radius)
                + (height * height));
    }
    public double ploshadCone() {
        return Math.PI * radius * obrazuyshaya();
    }

    public double ploshadKruga(){
        return Math.PI * (radius * radius);
    }

    public double ObshayaPloshad () {
        return ploshadKruga() + ploshadCone();
    }
    public double volume() {
        double a = 1;
        double b = 3;
        double res = (a/b) * height * ploshadKruga();
                return res;
    }
}
