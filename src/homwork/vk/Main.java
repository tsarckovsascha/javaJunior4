package homwork.vk;

import lesson8.WallWnty1;

public class Main {
    public static void main(String[] args) {
        Page page = new Page();



        WallEnty zapis1 = new WallEnty("Сегодня хороший день");
        WallEnty zapis2 = new WallEnty("а этот день не очень");
        WallEnty zapis3 = new WallEnty("поставтье лайки");



        Comment comment = new Comment("день действительно хороший", 5);

        Comment comment0 = new Comment("день хороший", 6);

        Comment comment1 = new Comment("держись!", 10);

        Comment comment2 = new Comment("лови", 22);


        zapis1.setComents(comment);
        zapis1.setComents(comment0);
        zapis2.setComents(comment1);
        zapis3.setComents(comment2);

        WallEnty[] z1 = new WallEnty[]{zapis1, zapis3, zapis2};

        Page Sasha = new Page("Sasha", 22, "status", "gorod");

       Sasha.bolsheeChislo();
    }
}