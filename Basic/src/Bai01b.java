import java.util.Scanner;

public class Bai01b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println(sum);
    }
}
