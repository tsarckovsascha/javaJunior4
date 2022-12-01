package lesson20;

import java.io.RandomAccessFile;

public class Main3 {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");
// �������� � ���� 10 ����� � ������� ����
            for(int i = 0; i < 10; i++)
                rf.writeDouble(i * 1.414);
            rf.close();
// ������� ����, �������� � ���� ��� ���� ����� � ����� �������
            rf = new RandomAccessFile("rtest.dat", "rw");
            rf.seek(5 * 8);
            rf.writeDouble(47.0001);
            rf.close();
// ������� ���� � ������������ ������ ������ "r"
            rf = new RandomAccessFile("rtest.dat", "r");
// ��������� 10 ����� � �������� �� �� ������
            for(int i = 0; i < 10; i++)
                System.out.println("Value " + i + ": " + rf.readDouble());
            rf.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
