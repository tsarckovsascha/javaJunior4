package lesson13;

import nedis.study.interfaces.t4.exceptions.CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maindz {
    public static void main(String[] args) throws CustomException {
        String namber1 = "123";
        String namber2 = "qwe";
        MyStrinUtils myStrinUtils = new MyStrinUtils();

        try {
            double div = myStrinUtils.div(namber1, namber2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("��������� �����������");

       /* String text = "���� ��� ��������� ����� <b>word</b> � ������ <b>text</b> � ���������� ������ �������� ����";

        String w= "word";

        MyStrinUtils myStrinUtils1 = new MyStrinUtils();

       //String[] poisk = {text.codePointAt("word")};


        try {
            String findWord = String.valueOf(myStrinUtils1.findWord(text, w));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(myStrinUtils1);
        System.out.println(" ��������� �����������");*/

        String text1 = "���� ��� ��������� word ����� <b>word</b> � ������ <b>text</b> � ���������� ������ �������� ����";
        Matcher word = Pattern.compile("(?=(word))").matcher(text1);
        List<Integer> pos = new ArrayList<Integer>();
        while (word.find())
        {
            pos.add(word.start());
        }

        try {
           // String findWord = myStrinUtils.findWord(text1, (word));
        } catch (NullPointerException e) {
            throw new NullPointerException(" ");
        }
        System.out.println(pos);
        System.out.println("��������� �����������");

        System.out.println("________________");



        String texts = "1,0 2,0  3,0  4,0   5,0 ";
        MyStrinUtils myStrinUtilss = new MyStrinUtils();

        try {
            double[] findNumbers = myStrinUtilss.findNumbers(texts);
        } catch ( CustomException e) {
         e.printStackTrace();
        }
        System.out.print(myStrinUtilss);
    }
}
