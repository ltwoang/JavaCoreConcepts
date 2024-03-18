import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] count = new int[10001]; 
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }

        int maxEle = 0;
        int maxCnt = 0;
        //viết hàm đếm thay length
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCnt) {
                maxCnt = count[i];
                maxEle = i;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + ": " + count[i]);
            }
        }
        System.out.println("Phần tử xuất hiện nhiều nhất: " + maxEle + " (" + maxCnt + " lần)");

	}
}
