package lesson7.shop;

public class Main {
    public static void main(String[] args) {
        Tovar vedro = new Tovar("����� ������ ", 100);
        Tovar kastrylya = new Tovar("�������� �������", 2000);
        Tovar plazma = new Tovar("����� ������", 10000);
        Tovar styralka = new Tovar("�������� ��� ��������� ", 5000);

        Otziv otziv = new Otziv(5,"����� �����");
        Otziv otziv1 = new Otziv(4,"����� �� �����");
        Otziv otziv2 = new Otziv(4,"����� ����� ������");
        Otziv otziv3 = new Otziv(2,"�� ������ ���");
        Otziv otziv4 = new Otziv(5,"�����");

        vedro.setOtziv(otziv);
        vedro.setOtziv(otziv1);
        plazma.setOtziv(otziv2);
        styralka.setOtziv(otziv3);
        styralka.setOtziv(otziv4);

        System.out.println(vedro.srednayRate());

    }
}
