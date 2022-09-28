package lesson6;

public class square {

    private int side;

    public void  setSide(int side) {
        this.side = side;
    }
    public int getS() {
        return  this.side;
    }

    public int perimetr() {
        return  (side * 4);
    }

    public double plosad() {
        return (side ^ 2);
    }
}
