package lesson17;

public class TestParamMetod {
    private String s;
    public TestParamMetod(){

    }
    public <T>  void printType(T t){
        System.out.println(t.toString());
    }
    public <T>  T printTypeReturn(T t){
        System.out.println(t.toString());
        return t;
    }
    public <K,V> K retK(V v){
        K qwe = null;
        return qwe;
    }
}
