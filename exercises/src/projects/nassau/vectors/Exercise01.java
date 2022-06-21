package projects.nassau.vectors;

import java.util.Objects;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String... args){

           /*Write a program that allows you to read the names of 10 people and store the read names in
           a vector. After that, the program must allow reading 1 more name of any person and then
           write the message I FOUND, if the name is among the 10 names read previously (saved
           in the vector), or I DIDN'T FIND otherwise.*/
        Scanner input = new Scanner(System.in);
        String [] names = new String[10];

        for (int x = 0; x < names.length; x++){
            System.out.print("Insert name: ");
            names[x] = input.next();
            System.out.println();
        }
        System.out.println("Enter the amount of times you want to thy to find a name");
        int quantity = input.nextInt();
        for (int y = 0; y < quantity; y++){
            System.out.print("Insert name: ");
            String name =input.next();
            for (int z = 0; z <names.length; z++){
                if (Objects.equals(name, names[z])){
                    System.out.println("Name found!");
                    break;
                } else{
                    System.out.println("Name not found!");
                    break;
                }
            }
        }

    }
}
