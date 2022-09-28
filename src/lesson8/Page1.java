package lesson8;

public class Page1 {
    private String name;
    private int age;
    private String gorod;
    private WallWnty1[] stena = new WallWnty1[100];

    public Page1() {
    }

    public Page1(String name, int age, String gorod, WallWnty1[] stena) {
        this.name = name;
        this.age = age;
        this.gorod = gorod;
        this.stena = stena;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGorod() {
        return gorod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public WallWnty1[] getStena() {
        return stena;
    }

    public void setStena(WallWnty1[] stena) {
        this.stena = stena;
    }

    public void maxLike() {
        int max1 = 0;
        for (int i = 0; i < this.stena.length; i++) {
            for (int j = 0; j < this.stena[i].getComments1s().length; j++) {
                if (max1 < this.stena[i].getComments1s()[j].getLike1());
                max1 = this.stena[i].getComments1s()[j].getLike1();
            }
        }

        System.out.println(max1);
    }

}
