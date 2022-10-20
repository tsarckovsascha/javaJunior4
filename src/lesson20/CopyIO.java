package lesson20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyIO implements CopyUtils{
    @Override
    public void copy(String from, String to) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("from"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("to"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //����������� ����� (������������� ���������� ���������� ������ � ����)
            bos.close(); //��������� ����� ������ (�����������!)
        }
        catch (java.io.IOException e) {
            System.out.println(e.toString());
        }

    }
}
