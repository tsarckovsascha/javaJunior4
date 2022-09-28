package lesson12;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();

       HashSet<Coins> coins = new HashSet<>();
       Coins coins1 = new Coins(1,2,"med");
       Coins coins2 = new Coins(2,3,"med");
       Coins coins3= new Coins(4,2,"silver");
       Coins coins4 = new Coins(1,2,"med");

       coins.add(coins1);
       coins.add(coins2);
       coins.add(coins3);
       coins.add(coins4);
        System.out.println(coins);
    }
}
