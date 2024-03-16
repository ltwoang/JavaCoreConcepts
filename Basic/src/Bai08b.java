public class Bai08b {
    public static void main(String[] args) {
    	for (int i = 100000; i < 1000000; i++) {
            if (soTN(i) && tongCSChiaHetCho10(i)) {
                System.out.println(i);
            }
        };
    }

    public static boolean soTN(int n) {
        int rev = 0;
        int tmp = n;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return tmp == rev;
    }
    public static boolean tongCSChiaHetCho10(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }
}
