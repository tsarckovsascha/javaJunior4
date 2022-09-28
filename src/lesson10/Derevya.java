package lesson10;

public class Derevya extends Kornevie{
    private String type;

    public Derevya() {
    }

    public Derevya(String listya, String razmnoshenie, String osobenosti, Boolean koren, Boolean stebel, String type) {
        super(listya, razmnoshenie, osobenosti, koren, stebel);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
