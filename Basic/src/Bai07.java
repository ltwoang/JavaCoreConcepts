public class Bai07 {
    public static void main(String[] args) {
    	for (int i = 100001; i < 1000000; i += 2) {
            if (nto(i) && chiSoLe(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean nto(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    public static boolean chiSoLe(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
