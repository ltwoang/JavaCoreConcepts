
import java.util.Scanner;

public class Bai01 {
    public static boolean mangDX(int[] a, int n) {
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (mangDX(a, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

