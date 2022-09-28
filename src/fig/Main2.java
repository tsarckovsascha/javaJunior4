package fig;

public class Main2 {
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 3) {


            @Override
            public void printToConsole() {

            }
        };
        Matrix m1 = new Matrix(3, 3) {

            @Override
            public void printToConsole() {

            }
        };
        m1.getRows();
        m.setValueAt(0,1,1);
        m.setValueAt(1,0,1);
        m.setValueAt(0,0,1);
        m.setValueAt(1,1,1);

        m1.setValueAt(0,0,2);
        m1.setValueAt(0,1,3);
        m1.setValueAt(1,1,4);
        m1.setValueAt(0,0,5);

           Matrix m3 = (Matrix) m.mul(m1);

        System.out.println(m3);

    }
}
