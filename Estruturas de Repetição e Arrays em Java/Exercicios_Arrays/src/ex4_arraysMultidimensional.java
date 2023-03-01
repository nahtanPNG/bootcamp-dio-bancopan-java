import java.util.Random;

public class ex4_arraysMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix = new int[4][4]; // linha e coluna [] []

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){ //j representa cada coluna dentro da linha i
                matrix[i][j] = random.nextInt(9);

            }

        }

        System.out.println("Matrix: ");
        for ( int[] linha : matrix ) {
            for ( int coluna : linha ) { //pegando cada elemento da coluna
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
