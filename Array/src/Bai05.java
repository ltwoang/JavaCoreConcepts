
import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapMang(a, sc);
        int m = sc.nextInt();
        int[] b = new int[m];
        nhapMang(b, sc);
        int p = sc.nextInt();
        int[] result = chenMangVaoViTriP(a, b, p);
        inMang(result);
    }
    public static void nhapMang(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] chenMangVaoViTriP(int[] a, int[] b, int p) {
        int[] res = new int[a.length + b.length];
        for (int i = 0; i < p; i++) {
            res[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            res[p + i] = b[i];
        }
        for (int i = p; i < a.length; i++) {
            res[b.length + i] = a[i];
        }

        return res;
    }
}

