package lesson7.shop;

public class Otziv {
    private int rate;
    private String comment;

    public Otziv() {
    }

    public Otziv(int rate, String comment) {
        this.rate = rate;
        this.comment = comment;
    }

    public int getRate() {
        return rate;
    }

    public String getComment() {
        return comment;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
