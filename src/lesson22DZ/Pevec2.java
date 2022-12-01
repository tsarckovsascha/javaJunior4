package lesson22DZ;

import lesson22.iMoritoring;

public class Pevec2 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (lesson22.iMoritoring.SCENA) {
                try {
                    lesson22.iMoritoring.SCENA.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("ËÞËÞÞËÞËÞËÞËÞËÞ");
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            synchronized (lesson22.iMoritoring.SCENA) {
                iMoritoring.SCENA.notify();
            }
        }
    }
}

