public class Main31 {
    public static void main(String[] args) {
        int a = 230;
        int b = 40;
        int c = 4;
        int d = 1000;
        int e = (d / a);
        int t = (d % a);
        int u = (e % b);
        System.out.println(e);
        System.out.println("kolichestvo pizz na 1000 rub");
        System.out.println(d % a);
        System.out.println("ostaneysia posle pokupki pizz na 1000 rub");
        System.out.println(t / b);
        System.out.println("kolichestvo bulochek na ostatok posle pokupki pizz ");
        System.out.println(e % b);
        System.out.println("ostaneysia posle pokupki bulochek ");
        System.out.println(u / c);
        System.out.println("kolichestvo chevachek na ostatok posle pokupki bulochek ");
        System.out.println(u % c);
        System.out.println("ostatok posle  pokupki chevachek ");

    }
}
