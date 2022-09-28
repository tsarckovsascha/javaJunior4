package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String s = ".km;lm.n;n;niu.nj";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                count++;
            }
        }   //if (s.charAt(i) == '.') {
        if (count == 0) {
            System.out.println("Точек нет");
        } else System.out.println("Точки в колтчестве " + count);
    }
}

