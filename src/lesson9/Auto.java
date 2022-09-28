package lesson9;

public class Auto extends Transport {
    boolean sport;
    public Auto() {
    }

    @Override
    public void edet() {
        System.out.println("едет");
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public Auto(String name, int col, boolean sport) {
        super(name, col);
        this.sport = sport;

    }

}
