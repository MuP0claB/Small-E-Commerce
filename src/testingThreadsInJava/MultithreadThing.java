package testingThreadsInJava;

public class MultithreadThing implements Runnable {

    public int [][] matrixA;
    public int [][] matrixB;
    public int [][] result;
    public int row;

    public MultithreadThing(int[][] matrixA, int[][] matrixB, int[][] result, int row) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = result;
        this.row = row;
    }

    @Override
    public void run() {
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        for (int i = 0; i < colsB ; i++) {
            result[row][i] = 0;   //   ?
            for (int j = 0; j < colsA; j++) {
            result[row][i] += matrixA[row][j] * matrixB[j][i];
            }
            System.out.print(result[row][i] + " ");
        }
        System.out.println();
    }
}
