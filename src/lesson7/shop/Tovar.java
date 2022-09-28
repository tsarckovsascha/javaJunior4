package lesson7.shop;

public class Tovar {
    private String name;
    private int price;
    private Otziv[] otzivs = new Otziv[100];

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }
    public void setOtziv(Otziv otzivi) {
        int cout = 0;
        for (int i = 0; i < this.otzivs.length; i++) {
            if (this.otzivs[i] == null){
                this.otzivs[i] = otzivi;
                cout = i;
                break;
            }
        }
        if (cout == this.otzivs.length - 1){
            System.out.println("Ìוסעמ הכÿ מעחûגמגû םוע");
        }
    }
    public double srednayRate(){
        int count = 0;
        double rate = 0;
        for (int i = 0; i < this.otzivs.length; i++) {
            if (this.otzivs[i] != null){
                count++;
                rate = rate + this.otzivs[i].getRate();
            }
        }
        if (count == 0)
            return 0;
        else return rate / count;

    }
}


