package projects.nassau.entities;

import projects.nassau.configs.BinarySearch;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Loan extends BinarySearch {

    Loan(){}

    public static boolean dataCollect(List<User> users, List<Book> books, Integer id){
        //calling search method
        boolean verify = false;
        verify = BinarySearch.enrollmentSearch(users, id);
        return verify;
    }

    public static void rentBook(List<User> users, List<Book> books) {
        Scanner input = new Scanner(System.in);
        System.out.println("RENT BOOK");
        System.out.println();
        System.out.print("USER REGISTRATION: ");
        Integer enrollment = input.nextInt();

        if (Loan.dataCollect(users, books, enrollment)) {
            System.out.println("LIST OF BOOKS");
            for (Book book : books) System.out.println(book.toString());
            System.out.println();
            System.out.print("ENTER THE ID OF THE BOOK YOU WANT TO RENT: ");
            Integer id = input.nextInt();
            System.out.println("[1] - CONFIRM");
            System.out.println("[2] - CANCEL");
            System.out.print("SELECT AN OPTION: ");
            Integer option = input.nextInt();
            if (option == 1) {
                //triggering peding
                users.get(enrollment).setPending("YES");
                String nameBook = books.get(id).getNameBook();
                users.get(enrollment).setNameBook(nameBook);
                System.out.println("COMPLETED LOAN");
                System.out.println(users.get(enrollment).toString());
                System.out.println("RENTED BOOKS");
                System.out.println(users.get(enrollment).getNameBook());
            }

        }


    }

    public static void checkPending(List<User> users){
        Scanner input = new Scanner(System.in);
        System.out.println("CHECK PENDING");
        System.out.println();
        System.out.print("INSERT ENROLLMENT FROM USER: ");
        Integer enrollment = input.nextInt();
        boolean verify = BinarySearch.enrollmentSearch(users, enrollment);
        if (verify) {
            String pending = users.get(enrollment).getPending();
            if (Objects.equals(pending, "YES")) {
                System.out.println("USER IS PENDING");
                System.out.println();
                System.out.println("[1] - YES");
                System.out.println("[2] - NOT");
                System.out.print("DO YOU WANT TO RETURN THE FIRST BOOK?");
                Integer option = input.nextInt();
                if (Objects.equals(option, 1)){
                    //RETURN BOOK
                    Loan.returnBook(users, enrollment);

                }else System.out.println("RETURNING TO THE MENU");
            }
        }
    }

    public static void returnBook(List<User> users, Integer enrollments){
        Integer firstBook = users.get(enrollments).getNameBook().indexOf(0);
        users.get(enrollments).getNameBooks().remove(firstBook);
        users.get(enrollments).setPending("NOT");
        System.out.println("THE FIRST BOOK RETURNED");
    }

}
