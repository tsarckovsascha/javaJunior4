package homwork.libreare;

public class Auto {
    private int number;

    private String text;

    public Auto() {
    }

    public Auto(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }
}
