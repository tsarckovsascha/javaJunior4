package lesson10;

public class Kornevie extends Rasteniya{
    private boolean koren;
    private boolean stebel;

    public Kornevie() {
    }

    public Kornevie(String listya, String razmnoshenie, String osobenosti, Boolean koren, Boolean stebel) {
        super(listya, razmnoshenie, osobenosti);
        this.koren = koren;
        this.stebel = stebel;
    }

    public boolean isKoren() {
        return koren;
    }

    public boolean isStebel() {
        return stebel;
    }

    public void setKoren(boolean koren) {
        this.koren = koren;
    }

    public void setStebel(boolean stebel) {
        this.stebel = stebel;
    }
}
