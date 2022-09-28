package lesson13;

import nedis.study.interfaces.t4.exceptions.CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStrinUtils implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        String alfavit = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = number1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (alfavit.indexOf(chars[i]) >= 0) {
                throw new NumberFormatException("ֲ number1 גגוהום סטלגמכ :" + chars[i]);
            } else {

            }
        }

        char[] chars1 = number2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (alfavit.indexOf(chars1[i]) >= 0) {
                throw new NumberFormatException("ֲ number2 גגוהום סטלגמכ : " + chars1[i]);
            } else {

            }
        }
        return 0;
    }


    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String texts) throws CustomException {
        double v = Double.parseDouble(texts);
        List<Double> pos = new ArrayList<Double>();
        for (int i = 0; i < texts.length(); i++) {
            if (v >= 0.0 || v <= 1000.0) {
                pos.add(v);
            }else {
                throw new CustomException("<b>\"Not found\"</b>");
            }
        }
        return new double[0];
    }
}




