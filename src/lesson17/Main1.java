package lesson17;

public class Main1 {
    public static void main(String[] args) {
        TeamBlue starshie = new TeamBlue();
        TeamBlue starshie1 = new TeamBlue();
        TeamRed mladshie= new TeamRed();
        TeamRed mladshie1= new TeamRed();

        People people1 = new People("Vasya", 22);
        People people2 = new People("Dasha", 20);
        People people3 = new People("Slava", 21);
        People people4 = new People("Oleg", 22);

        People people5 = new People("Oleg", 15);
        People people6 = new People("Nadya", 16);
        People people7 = new People("Sasha", 14);
        People people8 = new People("Dima", 15);

        starshie.setPeople(people1);
        starshie.setPeople(people2);
        starshie.setPeople(people3);
        starshie.setPeople(people4);

        mladshie.setPeople(people5);
        mladshie.setPeople(people6);
        mladshie.setPeople(people7);
        mladshie.setPeople(people8);

        starshie1.setPeople(people1);
        starshie1.setPeople(people2);
        starshie1.setPeople(people3);
        starshie1.setPeople(people4);

        mladshie1.setPeople(people5);
        mladshie1.setPeople(people6);
        mladshie1.setPeople(people7);
        mladshie1.setPeople(people8);

        Game<TeamRed > qwe = new Game<>();
        qwe.printvWinner(mladshie,mladshie1);

        Game<TeamBlue> asd = new Game<>();
        asd.printvWinner(starshie1,starshie);

        //1 одинаковое кол-во участников
        //2 неравое кол-во  участников, тогда если 1 против 9, то выйгришь по процентам
        //3 + игра 1 старшекласники против 2 младших
    }
}
