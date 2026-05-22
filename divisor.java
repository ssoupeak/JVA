package IDLE;
import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("쩡수: ");
		int n = sc.nextInt();
		sc.close();
		int ns = 0;
		int np = 0;

		System.out.println(n+"의 약수");
		for(int i=1;i<=n; i++) {
			if (n%i==0) {
			System.out.print(i+" ");
			np += i;
			ns++;
			}
		}
		System.out.println("\n"+ns+"개");
		System.out.println(np);
	}
}

