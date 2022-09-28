package lesson9.Animal;

public class Main {
    public static void main(String[] args) {
        Animal slon = new Animal("кеша", 33, 20);
        Animal slon2 = new Animal("кеша", 33, 20);
        System.out.println(slon.equals(slon2));
    }
}
