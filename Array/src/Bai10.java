import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] xoay = xoayMT(a);
        for (int i = 0; i < xoay.length; i++) {
            for (int j = 0; j < xoay[0].length; j++) {
                System.out.print(xoay[i][j] + " ");
            }
            System.out.println();
        }

    }


    }
}
