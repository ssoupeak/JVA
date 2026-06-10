package dads;

import java.util.Scanner;

class Book {
    String title;
    String author;
    int year;
    boolean borrow;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrow = false;
    }

    void show() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("출판년도: " + year);
    }

    String borrowOf() {
        if (borrow) {
            return "대출 불가";
        } else {
            borrow = true;
            return "대출 완료";
        }
    }
}

class Novel extends Book{
	String genre;
	
	Novel(String title, String author, int year, String genre) {
		super(title,author,year);
		this.genre = genre;
	}
}

class Science extends Book{
	int level;
	
	Science(String title, String author, int year, int level) {
		super(title,author,year);
		this.level = level;
	}
}

public class das {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("책 제목 입력: ");
        String title = sc.next();

        System.out.print("저자 입력: ");
        String author = sc.next();

        System.out.print("출판년도 입력: ");
        int year = sc.nextInt();
        sc.close();

        Book[] book = new Book[2];
        book[0] = new Novel(title,author,year,"힐링");
        book[1] = new Science("양자컴퓨터","누군가", 2025, 3);
        
        for(int i=0; i < book.length; i++) {
        	book[i].show();
        }
    }
}