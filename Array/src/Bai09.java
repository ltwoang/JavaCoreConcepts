import java.util.Arrays;
import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        lietKeTheoThuTuTangDan(a);

    }


    public static void lietKeTheoThuTuTangDan(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        int[] b = new int[n*m];

        int ind = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                b[ind++] = a[i][j];
            }
        }

        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
