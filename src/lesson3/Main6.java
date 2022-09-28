package lesson3;

public class Main6 {
    public static void main(String[] args) {
        char[] abc = {'a', 'b', 'c'};
        char[] qwe = {'q', 'w', 'e'};
        char[] abcqwe = new char[abc.length + qwe.length];
        for (int i = 0; i < abcqwe.length; i++) {
            if (i < abc.length) {
            abcqwe[i] = abc[i];
            }  else {
                abcqwe[i] = qwe[i - abc.length];
            }
            if ( abcqwe[i] == 'a'|| abcqwe[i] == 'e'||abcqwe[i] == 'u'||abcqwe[i] == 'y'||abcqwe[i] == 'i'||abcqwe[i] == 'o')

            System.out.println(abcqwe[i]);

        }
    }
}

