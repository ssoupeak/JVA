package dgff;

class ehdanf{
	String name;
	int age;
	
	ehdanf(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sound() {
		System.out.println(name + " cry");
	}
	
	void sound(int c) {
		System.out.println(c+" cry cry cry cry");
	}
}

class Dog extends ehdanf{
	int speed;
	
	Dog(String name, int age, int speed) {
		super(name,age); //엄빠 훔쳐오기
		this.speed = speed;
	}
	
	void sound() {
		System.out.println(name + " m m");
	}
	
	void run(int time) {
		System.out.println((speed*time) + "m run");
	}
}


public class Animalmanagement {

	public static void main(String[] args) {
		Dog dog = new Dog("dowan", 19, 13);
		dog.sound();
		dog.sound(3);
		dog.run(5);
	}

}
