package projects.nassau.entities;

import projects.nassau.configs.BinarySearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu extends User{

    public static void menu(){
        List<User> users = new LinkedList<>();
        List<Book> books = new LinkedList<>();
        List<Loan> loans = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------");
            System.out.println("WELCOME TO THE GEEK STORE");
            System.out.println();
            System.out.println("[1] - REGISTER ACCOUNT");
            System.out.println("[2] - REGISTER BOOK");
            System.out.println("[3] - RENT BOOK");
            System.out.println("[4] - CHECK PENDING");
            System.out.println("[5] - SHOW REGISTERED USERS");
            System.out.println("[6] - EXIT");
            System.out.println();
            System.out.print("SELECT AN OPTION: ");
            Integer option = input.nextInt();


            switch (option) {
                case 1:
                    //register account
                    users.add(Menu.registerUser(users, users.size() + 1));
                    break;

                case 2:
                    //register book
                    books.add(Book.registerBook(books, books.size() + 1));
                    do {
                        System.out.println("DO YOU WANT TO SEE REGISTERED BOOKS?");
                        System.out.println("[1] - YES  [2] - NOT");
                        Integer check = input.nextInt();
                        if (check == 1){
                            System.out.println("REGISTERED BOOKS");
                            System.out.println();
                            for(Book book: books) System.out.println(book);
                            break;
                        } else if (check == 2){
                            System.out.println("RETURNING TO THE MENU...");
                            break;
                        } else System.out.println("ERROR 04: INVALID OPTION. TRY AGAIN");
                    } while(true);
                    break;

                case 3:
                    //rent book
                    Integer enrollment = 0;
                    Loan.rentBook(users, books);
                    break;

                case 4:
                    // check pending
                    Loan.checkPending(users);
                    break;

                case 5:
                    //show registered users
                    do {
                        System.out.println("DO YOU WANT TO SEE REGISTERED USERS? ");
                        System.out.println("[1] - YES [2] - NOT");
                        Integer check = input.nextInt();
                        if (check == 1) {
                            System.out.println("REGISTRED USERS");
                            System.out.println();
                            for (User user : users) {
                                System.out.println(user);
                            }
                            break;
                        } else if (check == 2) {
                            System.out.println("RETURNING TO THE MENU...");
                            break;
                        } else {
                            System.out.println("ERROR 03: INVALID OPTION. TRY AGAIN");
                        }
                    } while(true);
                    break;

                case 6:
                    System.out.print("RUNNING GEEK GEEK LIBRARY CLOSE");
                    System.exit(001);
                default:
                    System.out.println("ERROR 01: INVALID OPTION. TRY AGAIN");
                    break;

            }
        }while (true);
    }
}
