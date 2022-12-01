package lesson22;

public class Vedushiy {
    public static void main(String[] args) {
        System.out.println("начало концерта");
        Pevec p = new Pevec();
        p.start();
        Shut s = new Shut();
        s.setDaemon(true);
        s.start();
        while (p.isAlive()){
        }
        System.out.println("концерт закончился");
    }
}
