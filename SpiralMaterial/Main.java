package SpiralMaterial;

public class Main {
    public static void main(String[] args) {
        int n = 4; //! Puedes cambiar el valor para probar con diferente tamaños
        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (value <= n * n) {
            //! Llenar la fila superior
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            //! Llenar la columna derecha
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            //! Llenar la columna izquierda
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
        }

        System.out.println();
    }



}
