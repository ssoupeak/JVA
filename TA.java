package KwangYa;

import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void bark() {
        System.out.println("멍멍");
    }
}

public class TA {
    public static void main(String[] args) {
        Animal dog = new Animal("puupy");
        dog.bark();
        
        sc.close();

    }
}