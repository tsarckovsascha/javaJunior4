package lesson20;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        CopyIO cIO = new CopyIO();
        cIO.copy("C:\\Users\\Acer Aspire 5750G\\Pictures\\Saved Pictures","qwe.jpeg");
        long end = System.currentTimeMillis();
        System.out.println("Время работы старого IO = " + (end - start));
        System.out.println("________________-");

        long startNIO = System.currentTimeMillis();
        CopyNIOFile cIONIO = new CopyNIOFile();
        cIO.copy("C:\\Users\\Acer Aspire 5750G\\Pictures\\Saved Pictures","qwe2.jpeg");
        long endNIO = System.currentTimeMillis();
        System.out.println("Время работы старого IO = " + (endNIO - startNIO));
    }
}