package lesson6;

public class Treugolnik {
    private int a;
    private int b;
    private int c;

    public void setA(int item) {
        this.a = item;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public int perimetr() {
        return a + b + c;
    }

    public double ploshad() {
        double res = Math.sqrt((this.perimetr() / 2) *
                ((this.perimetr() / 2) - a) *
                ((this.perimetr() / 2) - b) *
                ((this.perimetr() / 2) - c));
        return res;
    }

}
