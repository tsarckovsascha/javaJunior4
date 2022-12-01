package lesson20;

public class Main4 {
    public static void main(String[] args) {
        try {
            java.io.ObjectOutputStream ois = new java.io.ObjectOutputStream(new java.io.FileOutputStream("state.bin"));
            ois.writeDouble(3.14159265D);
            ois.writeObject("The value of PI");
            ois.writeObject(new Point(10,253)); //������ ������� ������ Point
            ois.flush();
            ois.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
