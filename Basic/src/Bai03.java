
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(UCLN(a, b));
        System.out.println(BCNN(a, b));
    }
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public static int BCNN(int a, int b) {
        return a / UCLN(a, b) * b;
    }
}

