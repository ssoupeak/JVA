package Idle;

import java.util.ArrayList;
import java.util.Arrays;

public class HWAA {
	public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);
        
        int n1 = 123;
        String num11 = "" + n;
        System.out.println(num11);
        
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1); 
        System.out.println(num2);
        
        String num56 = "123.456";
        double d = Double.parseDouble(num);
        System.out.println(d);
        
        int n78 = 123;
        double d1 = n78;  
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n10 = (int) d2;
        System.out.println(n10);
        
        String num75 = "123.456";
        //int n101 = Integer.parseInt(num75);
        
        final int n44 = 123; 
        //n44 = 456;
        
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        //a = new ArrayList<>(Arrays.asList("c", "d"));
	}
	
}
