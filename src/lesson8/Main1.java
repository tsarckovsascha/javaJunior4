package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Comments1 c1 = new Comments1("qwe", 3);
        Comments1 c2 = new Comments1("asd", 4);
        Comments1 c3 = new Comments1("zxc", 9);
        Comments1 c4 = new Comments1("qaz", 44);

        Comments1[] arrCom0 = new Comments1[]{c1, c2, c3};
        Comments1[] arrCom1 = new Comments1[]{c2, c3, c4};
        Comments1[] arrCom2 = new Comments1[]{c1, c3};

        WallWnty1 zapis1 = new WallWnty1("uv 9f9y", arrCom0, "uhnnog1");
        WallWnty1 zapis2 = new WallWnty1("uv y", arrCom1, "uhnnog2");
        WallWnty1 zapis3 = new WallWnty1("9f9y", arrCom2, "uhnnog3");


        WallWnty1[] z = new WallWnty1[]{zapis1, zapis2, zapis2};
        Page1 myStranitsa = new Page1("Sasha", 22, "kazan", z);


        myStranitsa.maxLike();
    }
}



