package lesson22;

public class Pevec extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count < 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Ëàààààààà");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            count++;
            synchronized (iMoritoring.SCENA) {
                iMoritoring.SCENA.notify();
            }
            synchronized (iMoritoring.SCENA) {
                try {
                    iMoritoring.SCENA.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
