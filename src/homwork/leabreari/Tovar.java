package homwork.leabreari;

public class Tovar {

   private String name;

   private int year;

   private String publisher;

    private int numberPage;

   public Tovar() {
   }

   public Tovar(String name, int year, String publisher) {
      this.name = name;
      this.year = year;
      this.publisher = publisher;
   }

   public String getName() {
      return name;
   }

   public int getYear() {
      return year;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
