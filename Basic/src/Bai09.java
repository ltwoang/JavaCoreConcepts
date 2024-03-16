public class Bai09 {
    public static void main(String[] args) {
    	for (long i = 1000000; i < 1000000000; i++) {
            if (soTN(i) && check(i) && tongCSChiaHetCho10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean soTN(long n) {
        long rev = 0;
        long tmp = n;
        while (n > 0) {
            long digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return tmp == rev;
    }
    public static boolean check(long n) {
        while (n > 0) {
            long digit = n % 10;
            if (digit != 0 && digit != 6 && digit != 8) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean tongCSChiaHetCho10(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }
}
