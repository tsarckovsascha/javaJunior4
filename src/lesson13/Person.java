package lesson13;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NullPointerException {
        name.equals("");
        if (name == null) {
            throw new NullPointerException("?????? ???,name.equals() if (name == null)");
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAccessException {
        if (age<=0 || age >150){
            throw  new IllegalAccessException();
        }
        this.age = age;
    }
}
