package homwork.vk;

public class Comment {
    private String comment;
    private int like;

    public Comment() {
    }

    public Comment(String comment, int like) {
        this.comment = comment;
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public int getLike() {
        return like;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setLike(int like) {
        this.like = like;
    }

}


