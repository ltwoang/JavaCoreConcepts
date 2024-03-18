import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int viTri = timViTriSoNguyenToGanXNhat(a, x);
        if (viTri != -1) {
            System.out.println(viTri);
        } else {
            System.out.println("Không có số nguyên tố");
        }
	}
	public static boolean nto(int n) {
        //viết hàm
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
	public static int timViTriSoNguyenToGanXNhat(int[] a, int x) {
        int min = 100000000;
        int vtriGanNhat = -1;
        for (int i = 0; i < a.length; i++) {
            if (nto(a[i])) {
                //Vết hàm thay cho abs
                int kc = Math.abs(a[i] - x);
                if (kc < min) {
                    min = kc;
                    vtriGanNhat = i;
                }
            }
        }

        return vtriGanNhat;
    }
}
