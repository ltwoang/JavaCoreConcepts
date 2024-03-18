public class Bai10 {
    public static void main(String[] args) {
    	for (int i = 1000000; i < 10000000; i++) {
            if (nto(i) && tatCaCSLaNguyenTo(i) && nto(daoNguoc(i))) {
                System.out.println(i);
            }
        }
    }

    public static boolean nto(int n) {
        //
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static boolean tatCaCSLaNguyenTo(int n) {
        while (n > 0) {
            int tmp = n % 10;
            if (!nto(tmp)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    public static int daoNguoc(int n) {
        int rev = 0;
        while (n != 0) {
            int tmp = n % 10;
            rev = rev * 10 + tmp;
            n /= 10;
        }
        return rev;
    }
}
