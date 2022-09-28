package lesson10;

public class Vodorosli extends Rasteniya{
    private boolean TrebuetsyaLiPocva;

    public Vodorosli() {
    }

    public Vodorosli(String listya, String razmnoshenie, String osobenosti, Boolean trebuetsyaLiPocva) {
        super(listya, razmnoshenie, osobenosti);
        TrebuetsyaLiPocva = trebuetsyaLiPocva;
    }

    public Boolean getTrebuetsyaLiPocva() {
        return TrebuetsyaLiPocva;
    }

    public void setTrebuetsyaLiPocva(Boolean trebuetsyaLiPocva) {
        TrebuetsyaLiPocva = trebuetsyaLiPocva;
    }
}
