package lesson10;

public class Main {
    public static void main(String[] args) {


        Rasteniya rasteniya = new Rasteniya();
        Kornevie kornevie = new Kornevie();
        Vodorosli vodorosli = new Vodorosli
                ("krasnie", "delenie", "dlya Sushi", false);
        Mhi mhi = new Mhi
                ("���������", "����������", "��� ����� �����", true);
        // Kornevie kornevie = new Kornevie("","","","","");
        Paparatniki paparatniki = new Paparatniki
                ("�������", "�������", "� ������", true, true, true);
        Derevya derevya = new Derevya
                ("�������", "�������", "�� �����", true, true, "�������");


        Rasteniya[] arr = new Rasteniya[]{mhi, derevya, paparatniki, vodorosli};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

    }
}
