package lesson10;

public class Mhi extends Rasteniya{
    private boolean stebel;

    public Mhi() {
    }

    public Mhi(String listya, String razmnoshenie, String osobenosti, Boolean stebel) {
        super(listya, razmnoshenie, osobenosti);
        this.stebel = stebel;
    }

    public Boolean getStebel() {
        return stebel;
    }

    public void setStebel(Boolean stebel) {
        this.stebel = stebel;
    }
}
