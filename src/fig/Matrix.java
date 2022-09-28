package fig;

import java.util.Scanner;

public class Matrix implements IMatrix {
    private double[][] arr;

    public Matrix() {
        arr = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rowIndex, int colIndex) {
        arr = new double[rowIndex][colIndex];
    }

    @Override
    public int getRows() {
        return arr.length;
    }

    @Override
    public int getColumns() {
        return arr[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return arr[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        arr[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() == otherMatrix.getRows() &&
                otherMatrix.getColumns() == this.getColumns()) {
            Matrix res = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    res.setValueAt(i, j, (this.getValueAt(i, j) + otherMatrix.getValueAt(i, j)));
                }

            }
            return res;
        } else return null;

    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() == otherMatrix.getRows() &&
                otherMatrix.getColumns() == this.getColumns()) {
            Matrix res0 = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    res0.setValueAt(i, j, (this.getValueAt(i, j) - otherMatrix.getValueAt(i, j)));
                    return null;
                }
            }
            return res0;
        } else return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix res1 = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getColumns(); k++) {
                    res1.setValueAt(i,j,(res1.getValueAt(i,j) + this.getValueAt(i,j) * otherMatrix.getValueAt(k,j)));
                }
            }
        }
        return res1;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix res3 = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res3.setValueAt(i, j, (this.getValueAt(i, j) * value));

            }
        }
        return res3;
    }

    @Override
    public IMatrix mull(double value) {
        Matrix res2 = new Matrix(this.getRows(), this.getColumns());
        value = 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res2.setValueAt(i, j, (arr[i][j] * value));
            }
        }
        return res2;
    }

    @Override
    public IMatrix transpose() {
        Matrix res4 = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res4.setValueAt(j, i, arr[i][j]);
            }
        }
        return res4;
    }

    @Override
    public void fillMatrix(double value) {

        Matrix res4 = new Matrix(3, 3);
        Scanner scanner = new Scanner(System.in);
        double znachenie = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                this.arr[i][j] = value;
            }
        }
        return;
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        boolean res = true;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    c++;
                }
            }
        }
        return c == 0 ? true : false;
    }

    @Override
    public boolean isIdentityMatrix() {
        int diag = 0;
        int ostal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] != 1) {
                        diag++;
                    }
                } else {
                    if (arr[i][j] != 1) {
                        ostal++;
                    }
                }
            }
        }
        return diag == 0 && ostal == 0 ? true : false;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (getColumns() == getRows());
            }
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
