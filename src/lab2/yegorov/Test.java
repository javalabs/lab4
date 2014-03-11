package lab2.yegorov;

import java.util.Random;

/**
 * Created by AdminPC on 02.03.14.
 */

class Test {
    public final static int N = 9;

    public static void testing() {
        Matrix m = new Matrix(5,5);
        m.inputMatrix();
        System.out.println("Введенная матрица:");
        m.watchMatrix();
        m.sumMatrixElementLine();
        m.sortMatrix();
        System.out.println("\nОтсортированная по строкам матрица:");
        m.watchMatrix();
        System.out.println("\n\n");
        m = null;
        //System.gc();

        Random rand = new Random();
        int countTest = 0;
        int i, j;
        while(true) {
            countTest++;
            i = 1 + rand.nextInt(5);
            j = 1 + rand.nextInt(5);
            m = new Matrix(i,j);
            m.inputMatrix();
            System.out.println("Введенная матрица:");
            m.watchMatrix();
            m.sumMatrixElementLine();
            m.sortMatrix();
            System.out.println("\nОтсортированная по строкам матрица:");
            m.watchMatrix();
            System.out.println("\n\n");
            m = null;
            //System.gc();
            if(countTest == N) break;
        }
    }
}