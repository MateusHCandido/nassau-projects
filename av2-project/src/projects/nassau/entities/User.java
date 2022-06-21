package projects.nassau.entities;

import java.util.*;

public class User extends Book{

    private String name;
    private String gender;
    private String lastName;
    private String cpf;
    private Integer enrollment;
    private String pending;
    private List<String> nameBooks;

    public User(){}

    public User(String name, String lastName, String cpf, String gender, Integer enrollment,
                String pending, List<String> nameBooks){

        this.name = name;
        this.gender = gender;
        this.lastName = lastName;
        this.cpf = cpf;
        this.enrollment = enrollment;
        this.pending = pending;
        this.nameBooks = nameBooks;
    }



    public static User registerUser(List<User> users, Integer id){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("REGISTER USER");
        System.out.println();
        System.out.print("NAME: ");
        String name = input.next();
        System.out.print("LAST NAME: ");
        String lastName = input.next();
        System.out.print("CPF: ");
        String cpf = input.next();
        System.out.println();

        String gender =  null;
        Boolean stop = false;
        do {
            System.out.println("[1] - MALE");
            System.out.println("[2] - FEMALE");
            System.out.print("SELECT AN OPTION: ");
            Integer option = input.nextInt();
            switch (option) {
                case 1:
                    gender = "Male";
                    stop = true;
                    break;

                    case 2:
                        gender = "Female";
                        stop = true;
                        break;

                default:
                    System.out.print("ERROR 02: INVALID OPTION. TRY AGAIN!");
                    break;

            }
        }while(!stop);
        String pending = "NOT";
        List<String> books = new LinkedList<>();
        User user = new User(name, lastName, cpf, gender, users.size(), pending, books);
        System.out.println("USER CREATION SUCCESSFUL");
        System.out.println();
        System.out.println(user.toString());
        return user;

    }


    @Override
    public String toString() {
        return String.format("=========================================%n" +
                "Name: %s%nLast Name: %s%nCPF: %s%nEnrollment: %d%nPending: %s%n" +
                "=========================================%n", name, lastName, cpf, enrollment, pending);
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public String setCpf(String cpf) {
        this.cpf = cpf;
        return cpf;
    }

    public Integer getEnrollment(Integer enrollment) {
        return this.enrollment;
    }

    public Integer setEnrollment(Integer enrollment) {
        this.enrollment = enrollment;
        return enrollment;
    }

    public String getPending() {
        return pending;
    }

    public User setPending(String pending) {
        this.pending = pending;
        return null;
    }

    public List<String> getNameBooks() {
        return nameBooks;
    }

    public User setNameBooks(List<String> nameBooks) {
        this.nameBooks = nameBooks;
        return null;
    }

    public Integer getEnrollment() {
        return enrollment;
    }
}
