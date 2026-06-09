package KwangYa;

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
            return "대출 가능";
        }
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

        Book b1 = new Book(title, author, year);
        b1.show();

        System.out.println("대출 상태: " + b1.borrowOf());

        sc.close();
    }
}