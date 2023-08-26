import java.util.Scanner;

class MatrixMagicCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] sums = new int[rows + cols + 2]; // Rows + Columns + Diagonals

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sums[i] += matrix[i][j]; // Sum of rows
                sums[rows + j] += matrix[i][j]; // Sum of columns

                if (i == j) {
                    sums[rows + cols] += matrix[i][j]; // Sum of main diagonal
                }

                if (i + j == rows - 1) {
                    sums[rows + cols + 1] += matrix[i][j]; // Sum of secondary diagonal
                }
            }
        }

        boolean isUniform = true;
        for (int i = 1; i < sums.length; i++) {
            if (sums[i] != sums[i - 1]) {
                isUniform = false;
                break;
            }
        }

        if (isUniform) {
            System.out.println("The matrix is a magic matrix");
        } else {
            System.out.println("The matrix is not a magic matrix");
        }

    }
}