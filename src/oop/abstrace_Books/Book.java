package oop.abstrace_Books;
public abstract class Book {
    int bookPage;
    double discount;
    double price;
    public Book(int bookPage, double discount) {
        this.bookPage = bookPage;
        this.discount = discount;
    }
    public abstract void show_kind();
    public abstract void getPrice(int bookPage,double discount);
    public void show_price(){
        show_kind();
        getPrice(bookPage,discount);
        System.out.println();
    }
}
class Science_book extends Book{
    public Science_book(int bookPage, double discount) {
        super(bookPage, discount);
    }
    @Override
    public void show_kind() {
        System.out.println("The book's kind is science");
    }
    @Override
    public void getPrice(int bookPage, double discount) {
        price=bookPage*discount;
        System.out.println("The book's kind is "+price+" RMB");
    }
}
class Literature_book extends Book{
    public Literature_book(int bookPage, double discount) {
        super(bookPage, discount);
    }
    @Override
    public void show_kind() {
        System.out.println("The book's kind is literature");
    }
    @Override
    public void getPrice(int bookPage, double discount) {
        price=bookPage*discount;
        System.out.println("The book's kind is "+price+" RMB");
    }
}
class Booksell{
    public static void main(String[] args) {
        Science_book science_book=new Science_book(30,0.9);
        Literature_book literature_book=new Literature_book(40,0.8);
        science_book.show_price();
        literature_book.show_price();
    }
}