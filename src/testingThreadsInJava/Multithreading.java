package testingThreadsInJava;

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {
       long start = System.currentTimeMillis();

       int [][] matrixA = new int [5] [3] ;
       int [][] matrixB = new int [3] [5] ;
      int [][] result = new int [matrixA.length][matrixB[0].length];

      fillMatrix(matrixA);
      fillMatrix(matrixB);

        for (int i = 0; i < result.length; i++) {
            MultithreadThing myThing = new MultithreadThing(matrixA, matrixB, result, i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            myThread.join();
        }

        long end = System.currentTimeMillis();
        System.out.println("Milliseconds " + (end - start));
    }

    public static void fillMatrix(int[][] matrix) {
        int number = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = number;
                number++;
            }
        }
    }
}