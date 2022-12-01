package lesson22DZ;

import lesson22.iMoritoring;

public class Pevec3 extends Thread {
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
                System.out.println("ËÀËÀËÀËÀËÀËÀËÀ");
                try {
                    Thread.sleep(500);
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

