import java.util.Scanner;

public class Bai08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[n][k];

        nhapMaTran(sc, A);
        nhapMaTran(sc, B);

        int[][] C = tichMaTran(A, B);
        inMaTran(C);
    }

    public static void nhapMaTran(Scanner sc, int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] tichMaTran(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int k = B[0].length;

        int[][] C = new int[m][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int h = 0; h < n; h++) {
                    C[i][j] += A[i][h] * B[h][j];
                }
            }
        }

        return C;
    }

    public static void inMaTran(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
