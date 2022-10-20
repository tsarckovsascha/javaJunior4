package lesson17;

import java.util.Random;

public class Game<T extends Team> {
    public T printvWinner(T t1, T t2) {
        Random rr = new Random() {
        };
        int i = rr.nextInt(0, 2);
        if (i == 1) {
            System.out.println("Win " + t1.getName());
        } else {
            System.out.println("Win " + t2.getName());
        }return t2;
    }
}

