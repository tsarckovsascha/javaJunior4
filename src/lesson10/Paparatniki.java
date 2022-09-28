package lesson10;

public class Paparatniki extends Kornevie{
    private boolean kust;

    public Paparatniki() {
    }

    public Paparatniki(String listya, String razmnoshenie, String osobenosti, Boolean koren, Boolean stebel, boolean kust) {
        super(listya, razmnoshenie, osobenosti, koren, stebel);
        this.kust = kust;
    }

    public Boolean getKust() {
        return kust;
    }

    public void setKust(Boolean kust) {
        this.kust = kust;
    }
}
