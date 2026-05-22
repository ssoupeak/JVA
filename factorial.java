package IDLE;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			n= sc.nextInt();
			if(n>0) {
				break;
			}
		}
		
		long r = 1; //초기 값, 시험
		for(int i = 1; i<=n; i++) {
			r *= i;
		}
		System.out.println(r);
		
	}
}
