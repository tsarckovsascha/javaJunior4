package lesson13;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("");
        try {
            p.setName("");
        } catch (NullPointerException e) {
           throw new NullPointerException();
        }
        try {
            p.setAge(1234);
        } catch (IllegalAccessException e) {
            System.out.println("ошибка");
        }

    }
}
