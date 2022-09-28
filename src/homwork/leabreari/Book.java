package homwork.leabreari;

public class Book extends Tovar {
    private String avtor;



    public Book(String name, int year, String publisher, String avtor, int numberPage) {
        super(name, year, publisher);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }



    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }


}
