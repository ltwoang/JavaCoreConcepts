import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Chú ý câu từ
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println(cnt);
    }
}
