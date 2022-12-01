package lesson22;

public class Shut extends Thread {
    @Override
    public void run() {

        while (true) {
            synchronized (iMoritoring.SCENA) {
                try {
                    iMoritoring.SCENA.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("бла бла бла");
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            synchronized (iMoritoring.SCENA) {
                iMoritoring.SCENA.notify();
            }
        }
    }
}
