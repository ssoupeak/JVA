package ioi;
import java.util.Scanner;

class Student{
	String name;
	int age;
	int score;
	String grade;
	
	Student(String name) {
		this.name = name;
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.score = 100;
	}
	
	String setG(int score) {
		this.score = score;
		if (score >= 90) {
			this.grade = "A";
		} else if (score >= 70) {
			this.grade = "B";
		} else if (score >= 50) {
			this.grade = "C";
		} else {
			this.grade = "F";
		}
		return grade;
	}
	
	void info() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}

public class S0602A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		String grade;
		
		Student s1 = new Student(name);
		s1.info();
		System.out.println(s1.setG(100));
		grade = s1.setG(78);
		System.out.println(grade);
		System.out.println(s1.grade);
		
		
		Student s2 = new Student(name,18);
		s2.info();
		s2.setG(100);
		
		Student[] st = new Student[3];
		st[0] = new Student("chulsu");
		st[1] = new Student("younghea", 12);
		st[2] = new Student("jjanggu", 125);
		st[0].info();
		st[1].info();
	}

}
