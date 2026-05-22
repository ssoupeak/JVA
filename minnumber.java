package IDLE;
import java.util.Scanner;

public class minnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int min = a;
		if (min>b) min =b;
		if (min>c) min =c;
		System.out.println(min);
	}
}

/* 
 * 
 */
