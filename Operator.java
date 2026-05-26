package IDLE;
import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		while(true) {
			m = sc.nextInt();
			
			if (m>=1 && m<=12) {
				sc.close();
				break;
			} else {
				System.out.println("ㄷㅅ");
			}
		} 
		if (m == 3 || m == 4 || m == 5) {
			System.out.println("봄");
		} else {
			System.out.println("봄 X");
		}
		if (m >= 3 && m <= 5) {
			System.out.println("봄");
		} else {
			System.out.println("봄 X");
		}
		switch(m) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		default:
			System.out.println("봄 X");
		}
	}
}
