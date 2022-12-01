package lesson22;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      /*  MyPotok mp = new MyPotok();
        mp.start();*/
        Thread myPotok = new Thread(new MyPotok());
        myPotok.setDaemon(true);
        myPotok.start();
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
            Thread.sleep(200);
        }
    }
}
