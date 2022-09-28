package lesson9;

public abstract class Transport {
    private String name;
    private int col;

    public Transport() {
    }

    public Transport(String name, int col) {
        this.name = name;
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public int getCol() {
        return col;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void printName(){
        System.out.println(name);

    }
    public  abstract void edet();
}
