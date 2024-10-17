package Study_20241017;

class Book {
    String title;
    String author;

    void set_info(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void print_info() {
        System.out.println("책 제목: "+title);
        System.out.println("책 저자: "+author);
    }
}
public class MyBookClass {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.set_info("파이썬", "민경태");
        book2.set_info("어린왕자", "생택쥐페리");
        book1.print_info();
        book2.print_info();
    }
}
