package dgff;

class M{
	String name;
	int point;
	
	M(String n, int p) {
		name = n;
		point = p;
	}
	
	void showinfo() {
		System.out.println(name);
	}
	
	void showinfo(int addP) {
		System.out.println(point+addP);
	}
}

class VIPM extends M{
	double dis;
	
	VIPM(String n, int p, double d) {
		super(n,p);
		dis = d;
	}
	
	void showinfo() {
		System.out.println(name + " VIP info");
	}
	
	void useC(int p) {
		System.out.println((int)(p*dis) + "won");
	}
}

public class Member {
	public static void main(String[] args) {
		VIPM m = new VIPM("dowan", 2500, 0.15);
		m.showinfo();
		m.showinfo(5000);
		m.useC(30000);
	}

}
