package IDLE;

import java.util.Random;
import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int a = rand.nextInt(90)+10;
		int n;
		int c = 0;
		
		while(true) {
			n = sc.nextInt();
			c++;
			if (n>a) {
				System.out.println("너무 큼");
			} else if (n<a) {
				System.out.println("너무 작음");
			} else {
				System.out.println("와 정답");
				System.out.println(c+"번");
				break;
			}
		}
		sc.close();
	}
}
