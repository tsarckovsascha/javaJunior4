package lesson22DZ;

public class Pevec1 extends Thread{
    @Override
    public void run() {
            int count = 0;
            while (count < 3) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ëàààààààà");
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                count++;
                synchronized (lesson22.iMoritoring.SCENA) {
                    lesson22.iMoritoring.SCENA.notify();
                }
                synchronized (lesson22.iMoritoring.SCENA) {
                    try {
                        iMoritoring.SCENA.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
