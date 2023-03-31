
//Suppose you have a class Book with fields title, author, and price. Write a Comparator implementation that sorts Book objects by author in alphabetical order, and then by price in descending order.
package com.knoldus.task17;


import java.util.*;

class Book {

    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Comparator implementation for sorting Book objects by author, then price
    public static Comparator<Book> authorThenPriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            int authorComparison = b1.getAuthor().compareTo(b2.getAuthor());
            if (authorComparison != 0) {
                // If authors are different, sort by author in alphabetical order
                return authorComparison;
            } else {
                // If authors are the same, sort by price in descending order
                return Double.compare(b2.getPrice(), b1.getPrice());
            }
        }
    };

    @Override
    public String toString(){
        return "(" +getTitle() + ", " + getAuthor() + ", " + getPrice() + ")";
    }
}

public class BookImplementation{
    public static void getBookList(List<Book> bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of books : ");
        Integer count = scanner.nextInt();

        while(count != 0){
            Book book = new Book();
            System.out.println("Enter the title : ");
            book.setTitle(scanner.next());
            System.out.println("Enter the author : ");
            book.setAuthor(scanner.next());
            System.out.println("Enter the price : ");
            book.setPrice(scanner.nextDouble());
            bookList.add(book);
            --count;
        }
        scanner.close();
    }
    public static void main(String[] args) {
        // Suppose we have a list of Book objects called books
        List<Book> bookList = new ArrayList<>();
        getBookList(bookList);

        // Sort the list by author, then by price
        Collections.sort(bookList, Book.authorThenPriceComparator);
        System.out.println(bookList);
    }
}