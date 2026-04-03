package Idle;

import java.util.ArrayList;

public class Lion {
	public static void main(String[] args) {
		String a = "Idle";
		System.out.println(a.toUpperCase());
		
		String b = "a:b:c:d";
		String[] result = b.split(":");
		
		System.out.println(String.format("I eat %d apples.", 3));
		
		int number = 28;
		String day = "three";
		System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
		
		StringBuffer sb = new StringBuffer();
		sb.append("Idle");
		sb.append(" ");
		sb.append("Idle");
		String result1 = sb.toString();
		System.out.println(result1); 
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Idle");
		sb1.insert(0, "hello ");
		System.out.println(sb1.toString());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("Let's go K-pop");
		System.out.println(sb2.substring(0, 4));
		
		String[] weeks = {"민니", "미연", "소연", "우기", "슈화"};
		System.out.println(weeks[3]);
		
		ArrayList<String> pitches = new ArrayList<>();
        pitches.add("2008");
        pitches.add("328");
        pitches.add("502");
        pitches.add(0, "2008");  
        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("502"));
        System.out.println(pitches.indexOf("328"));
        System.out.println(pitches.remove("2008"));
        
        String one = pitches.get(0);
	}
}
