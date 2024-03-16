import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        double x = sc.nextDouble();
        sapXepTang(a);
        a = chenGiaTriVaoMang(a, x);
        for (double it : a) {
            System.out.print(it + " ");
        }
    }
    
    public static void sapXepTang(double[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static double[] chenGiaTriVaoMang(double[] a, double x) {
        int n = a.length;
        double[] tmp = new double[n + 1];
        int i = n - 1;
        while (i >= 0 && a[i] > x) {
            tmp[i + 1] = a[i];
            i--;
        }
        tmp[i + 1] = x;
        for (int j = 0; j <= i; j++) {
            tmp[j] = a[j];
        }
        
        return tmp;
    }
}
