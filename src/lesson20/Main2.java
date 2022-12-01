package lesson20;

import java.io.*;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        try {
            // ������� ��������������  ���������� ������� �����
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(System.in));
            // ���������� ����� PrintWriter ��� ������
            PrintWriter out = new PrintWriter (new FileWriter("data.txt"));
            // ���������� ������, ���� �� ������ ������ "stop"
            while (true) {
                String s = in.readLine();
                if (s.equals("stop"))
                    break;
                out.println(s.toUpperCase(Locale.ROOT));
            }
            out.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
