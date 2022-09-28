package lesson7;

public class Pasport {

    private String name;
    private int number;
    private String born;
    private String propiska;

    private Pasport jena;

    public Pasport getJena() {
        return jena;
    }

    public void setJena(Pasport jena) {
        this.jena = jena;
    }

    public Pasport() {

    }

    public Pasport(String name, int number, String born, String propiska) {
        this.name = name;
        this.number = number;
        this.born = born;
        this.propiska = propiska;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getBorn() {
        return born;
    }

    public String getPropiska() {
        return propiska;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public void setPropiska(String propiska) {
        this.propiska = propiska;
    }
}
