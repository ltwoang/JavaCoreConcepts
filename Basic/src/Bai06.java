import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Chú ý câu từ
        int n = sc.nextInt();
        phanTich(n);
    }

    public static void phanTich(int n) {
        //viết hàm thay thế cho .sqrt()
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                    System.out.print("x");
                }
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}
