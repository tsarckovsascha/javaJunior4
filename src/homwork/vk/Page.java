package homwork.vk;

public class Page {

    private String name;
    private int age;
    private String status;
    private String born;

    private WallEnty[] wallEnty = new WallEnty[100];

    public Page() {
    }

    public Page(String name, int age, String status, String born) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.born = born;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public String getBorn() {
        return born;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public Page(WallEnty[] wallEnty) {
        this.wallEnty = wallEnty;
    }

    public WallEnty[] getWallEnty() {
        return wallEnty;
    }

    public void setWallEnty(WallEnty wallEnt) {
        int count = 0;
        for (int i = 0; i < this.wallEnty.length; i++) {
            if (this.wallEnty[i] == null) {
                this.wallEnty[i] = wallEnt;
                count++;
                break;
            }
            if (count == this.wallEnty.length - 1) {
                System.out.println("Мнст для записей нет");
            }
        }
    }

    public void bolsheeChislo() {
        int max = 0;
        for (int i = 0; i < this.wallEnty.length; i++) {
            for (int j = 0; j < this.wallEnty[i].getComents().length; j++) {
                if (max == 0)
                if (max < this.wallEnty[i].getComents()[i].getLike()){
                    max = this.wallEnty[i].getComents()[i].getLike();
                }
            }
        }
        System.out.println(max);
    }

}

