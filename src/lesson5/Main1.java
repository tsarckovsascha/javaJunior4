package lesson5;

public class Main1 {
    public static void main(String[] args) {
        String text = "kmoivnfsb.,omoim";
        char[] simvol = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
          simvol[i] = text.charAt(i);
            //text.charAt(i);
            // simvol[i]
            System.out.print(simvol[i]);
        }
    }
}
