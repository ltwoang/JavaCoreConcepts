import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //Chú ý câu từ
		int a = sc.nextInt();
		int b = sc.nextInt();

        //Nếu nhập a lớn hơn b thì sao ???
        //Xử lý lại logic
		for (int i = a; i <= b; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (nto(i) && nto(j) && UCLN(i, j) == 1) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
	}
	
	public static boolean nto(int n) {
        //viết hàm thay thế cho .sqrt()
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return n > 1;
	}

	public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
