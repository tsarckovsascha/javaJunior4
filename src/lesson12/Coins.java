package lesson12;

public class Coins {
    private int diametr;
    private int cennost;
    private String sostsv;

    public Coins() {
    }

    public Coins(int diametr, int cennost, String sostsv) {
        this.diametr = diametr;
        this.cennost = cennost;
        this.sostsv = sostsv;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getCennost() {
        return cennost;
    }

    public void setCennost(int cennost) {
        this.cennost = cennost;
    }

    public String getSostsv() {
        return sostsv;
    }

    public void setSostsv(String sostsv) {
        this.sostsv = sostsv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coins coins = (Coins) o;

        if (diametr != coins.diametr) return false;
        if (cennost != coins.cennost) return false;
        return sostsv != null ? sostsv.equals(coins.sostsv) : coins.sostsv == null;
    }

    @Override
    public int hashCode() {
        int result = diametr;
        result = 31 * result + cennost;
        result = 31 * result + (sostsv != null ? sostsv.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "diametr=" + diametr +
                ", cennost=" + cennost +
                ", sostsv='" + sostsv + '\'' +
                '}';
    }
}
