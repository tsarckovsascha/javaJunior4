package lesson9;

public class Main2 {
    public static void main(String[] args) {
        Figura f = new Figura();
        Triangle  t = new Triangle();

        Figura[] arr =  new Figura[]{f, t};
        for (int i = 0; i < arr.length; i++) {
            arr[i].printPloshad();
            arr[i].printVolume();
            System.out.println();
        }
    }
}
