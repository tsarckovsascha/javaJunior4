package lesson22DZ;
import org.apache.log4j.Logger;
public class Vegushiy {
    public static final Logger LOGGER22 = Logger.getLogger(lesson22DZ.Vegushiy.class);
    public static void main(String[] args) {
        System.out.println("начало концерта");
        Pevec1 p = new Pevec1();       LOGGER22.trace("вышел певец 1");
        p.start();
        Pevec2 s = new Pevec2();           LOGGER22.trace("вышел певец 2");
        s.setDaemon(true);
        s.start();
        Pevec3 p3 = new Pevec3();                   LOGGER22.trace("вышел певец 3");
        p3.setDaemon(true);
        p3.start();
        while (p.isAlive()) {
        }
        System.out.println("концерт закончился");
    }
}

