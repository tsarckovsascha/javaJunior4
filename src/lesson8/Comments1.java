package lesson8;

public class Comments1 {
    private String comm;
    private int Like1;

    public Comments1() {
    }

    public Comments1(String comm, int like1) {
        this.comm = comm;
        Like1 = like1;
    }

    public String getComm() {
        return comm;
    }

    public int getLike1() {
        return Like1;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public void setLike1(int like1) {
        Like1 = like1;
    }
}
