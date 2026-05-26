package IDLE;
import java.util.Scanner;

public class sosu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			n = sc.nextInt();
			
			if (n>=2) break;
			System.out.println("ㄷㅅ");
		}
		sc.close();
		boolean x = true;
		for(int i = 2; i<n; i++) { //범위 중요 연산자 중요
			if(n%i==0) {
				x = false;
				break;
			}
		}
		if (x) {
			System.out.println(n+" : sosu");
		} else {
			System.out.println(n+" : sosu X");
		}
	}
}
