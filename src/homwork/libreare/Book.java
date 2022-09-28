package homwork.libreare;

public class Book {

    private History[] histories = new History[100];

    private Roman[] romans = new Roman[100];

    public Book() {
    }

    public Book(History[] histories, Roman[] romans) {
        this.histories = histories;
        this.romans = romans;
    }

    public History[] getHistories() {
        return histories;
    }

    public Roman[] getRomans() {
        return romans;
    }

    public void setHistories(History[] histories) {
        this.histories = histories;
    }

    public void setRomans(Roman[] romans) {
        this.romans = romans;
    }
}
