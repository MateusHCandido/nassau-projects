package projects.nassau.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String nameBook;
    private String author;
    private String genre;
    private Double price;
    private Integer year;
    private Integer idBook;

    public Book(){}

    public Book(String nameBook, String author, String genre, Double price, Integer year, Integer idBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.year = year;
        this.idBook =idBook;
    }


    public static Book registerBook(List<Book> books, Integer id){
        Scanner input = new Scanner(System.in);

        System.out.println("REGISTER BOOK");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.print("BOOK'S NAME: ");
        String booksName = input.nextLine();
        System.out.print("AUTHOR'S FIRST NAME + ACRONYMS: ");
        String author = input.nextLine();
        System.out.print("GENRE: ");
        String genre = input.next();
        System.out.print("PRICE: U$ ");
        Double price = input.nextDouble();
        System.out.print("YEAR: ");
        Integer year = input.nextInt();

        return new Book(booksName, author, genre, price, year, books.size());
    }

    @Override
    public String toString() {
        return String.format("---------------------------------------------------------------------------------------%n" +
                "     NAME                AUTHOR          GENRE          PRICE US          YEAR      ID%n" +
                "     %s          %s       %s           %.2f           %d       %d%n",
                 nameBook, author, genre, price, year, idBook);
    }


    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
