package homwork.vk;

public class WallEnty {

    private String text;

    private Comment[] coments = new Comment[100];


    public WallEnty() {
    }

    public WallEnty(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment[] getComents() {
        return coments;
    }

    public void setComents(Comment coment) {
        int cout = 0;
        for (int i = 0; i < this.coments.length; i++) {

            if (this.coments[i] == null) {
                this.coments[i] = coment;
                cout++;
                break;
            }
        }
        if (cout == this.coments.length - 1) {
            System.out.println("Место для комментариев нет");
        }
    }
}


