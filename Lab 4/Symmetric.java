import java.util.Scanner;

class Symmetric{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();

        int[][] a = new int[m][n];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        boolean square = m == n;
        boolean symmetric = true;
        if (square) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
                if (!symmetric) {
                    break;
                }
            }
        } else {
            symmetric = false;
        }

        if (square) {
            System.out.println("The matrix is a square matrix.");
        } else {
            System.out.println("The matrix is not a square matrix.");
        }

        if (symmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}