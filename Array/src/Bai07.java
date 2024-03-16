import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duongChayMax = 1;
        int viTriBD= 0;
        int doDai = 1;
        int viTri = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
            	doDai++;
            } else {
                if (doDai > duongChayMax) {
                	duongChayMax = doDai;
                	viTriBD = viTri;
                }
                doDai = 1;
                viTri = i;
            }
        }
        if (doDai > duongChayMax) {
        	duongChayMax = doDai;
        	viTriBD = viTri;
        }

        System.out.println("Đường chạy dài nhất ở vị trí " + viTriBD + " với độ dài là " + duongChayMax);
    }
}
