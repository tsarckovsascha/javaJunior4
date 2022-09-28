package lesson10;

public class Rasteniya {

    private String listya;
    private String razmnoshenie;
    private String osobenosti;

    public Rasteniya() {
    }

    public Rasteniya(String listya, String razmnoshenie, String osobenosti) {
        this.listya = listya;
        this.razmnoshenie = razmnoshenie;
        this.osobenosti = osobenosti;
    }

    public String getListya() {
        return listya;
    }

    public String getRazmnoshenie() {
        return razmnoshenie;
    }

    public String getOsobenosti() {
        return osobenosti;
    }

    public void setListya(String listya) {
        this.listya = listya;
    }

    public void setRazmnoshenie(String razmnoshenie) {
        this.razmnoshenie = razmnoshenie;
    }

    public void setOsobenosti(String osobenosti) {
        this.osobenosti = osobenosti;
    }

    @Override
    public String toString() {
        return "Rasteniya{" +
                "listya='" + listya + '\'' +
                ", razmnoshenie='" + razmnoshenie + '\'' +
                ", osobenosti='" + osobenosti + '\'' +
                '}';
    }
}
