import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
		sapXepTangDan(a);
		for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
	}
	public static void sapXepTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
