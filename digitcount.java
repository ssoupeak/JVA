package IDLE;

import java.util.Scanner;

public class digitcount {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.close();
			
			int c = 0;
			while (n>0) {
				n = n / 10;
				c++;
			}
			System.out.println(c);
	}

}
