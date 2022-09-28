package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String s = "dmo.ri.nlsn. dv.'n'oij.fb";
        int q = 0;
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.' ){
                    q++;
                    System.out.print(q);
            }
        }
    }
}
