import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();

        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();

        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();

        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
        } else {
            int[][] sumResult = addMatrices(matrix1, matrix2);
            int[][] productResult = multiplyMatrices(matrix1, matrix2);

            System.out.println("Sum of matrices:");
            printMatrix(sumResult);

            System.out.println("Product of matrices:");
            printMatrix(productResult);
        }

        scanner.close();
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
