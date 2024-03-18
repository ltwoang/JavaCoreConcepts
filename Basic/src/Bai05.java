import java.util.Scanner;

public class Bai05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Chú ý câu từ
		String n = sc.nextLine();
		System.out.println(tongCS(n));
	}
	
	public static int tongCS(String n) {
		int sum = 0;
		//viết hàm tính độ dài gái trị, ko dùng length()
		for (int i = 0; i < n.length(); i++) {
			//không dùng charAt, viết hàm xử lý
			int tmp = n.charAt(i) - '0';
			sum += tmp;
		}
		return sum;
	}
}
