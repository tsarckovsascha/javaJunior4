package homwork.libreare;

public class Magazin {
    private Auto[] avutos = new Auto[100];

    private Moda[] modas = new Moda[100];

    public Magazin() {
    }

    public Magazin(Auto[] avutos, Moda[] modas) {
        this.avutos = avutos;
        this.modas = modas;
    }

    public Auto[] getAvutos() {
        return avutos;
    }

    public Moda[] getModas() {
        return modas;
    }

    public void setAvutos(Auto[] avutos) {
        this.avutos = avutos;
    }

    public void setModas(Moda[] modas) {
        this.modas = modas;
    }
}
