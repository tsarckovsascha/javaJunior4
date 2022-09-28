package lesson8;

public class WallWnty1 {
    private String zapis;
    private String kartinka;

    private  Comments1[] comments1s = new Comments1[100];

    public WallWnty1() {
    }

    public WallWnty1(String zapis, Comments1[] comments1s, String kartinka) {
        this.zapis = zapis;
        this.comments1s = comments1s;
        this.kartinka = kartinka;
    }

    public String getZapis() {
        return zapis;
    }

    public String getKartinka() {
        return kartinka;
    }

    public void setZapis(String zapis) {
        this.zapis = zapis;
    }

    public void setKartinka(String kartinka) {
        this.kartinka = kartinka;
    }

    public Comments1[] getComments1s() {
        return comments1s;
    }

    public void setComments1s(Comments1[] comments1s) {
        this.comments1s = comments1s;
    }
}
