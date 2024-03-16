public class Bai08a {
    public static void main(String[] args) {
    	for (int i = 100000; i < 1000000; i++) {
            if (soTN(i)) {
                System.out.println(i);
            }
        }
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
}
