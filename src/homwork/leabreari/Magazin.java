package homwork.leabreari;

public class Magazin extends Tovar{
    private int numberVipuska;

    public Magazin(String name, int year, String publisher, int numberVipuska) {
        super(name, year, publisher);
        this.numberVipuska = numberVipuska;
    }

    public int getNumberVipuska() {
        return numberVipuska;
    }

    public void setNumberVipuska(int numberVipuska) {
        this.numberVipuska = numberVipuska;
    }
}
