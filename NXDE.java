package NXDE;

class sangi{
	int result = 0;
	
	public int add(int num){
		result += num;
		return result;
	}
}

public class NXDE {
	public static void main(String[] args) {
		sangi a = new sangi();
		sangi b = new sangi();
		
		System.out.println(a.result);
		System.out.println(a.add(5));
		System.out.println(a.add(10));
		
		System.out.println(b.add(500));
		System.out.println(b.add(2));
	}
}