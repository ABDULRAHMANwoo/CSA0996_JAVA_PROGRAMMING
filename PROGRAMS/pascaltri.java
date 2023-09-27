import java.util.Scanner;

public class pascaltri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int[][] pyramid = new int[rows][rows * 2 - 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int n = binomialCoefficient(i, j);
                System.out.print(n + " ");
                pyramid[i][rows - i - 1 + j * 2] = n;
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
