package Idle;

import java.util.HashSet;
import java.util.Arrays;

public class IMTHETREND {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set); 
        
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        HashSet<Integer> intersection = new HashSet<>(s1); 
        intersection.retainAll(s2);
        System.out.println(intersection);
        
        HashSet<Integer> union = new HashSet<>(s1); 
        union.addAll(s2);
        System.out.println(union);
        
        HashSet<Integer> subtract = new HashSet<>(s1);
        subtract.removeAll(s2);
        System.out.println(subtract); 
        
        HashSet<String> set1 = new HashSet<>();
        set1.add("Jump");
        set1.add("To");
        set1.add("Java");
        System.out.println(set1);
        
        HashSet<String> set2 = new HashSet<>();
        set2.add("Jump");
        set2.addAll(Arrays.asList("To", "Java"));
        System.out.println(set2);
        
        HashSet<String> set3 = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set3.remove("To");
        System.out.println(set3); 
    }
}
