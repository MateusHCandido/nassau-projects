package projects.nassau.vectors;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args){
        /* The same previous exercise (exercise 03), but must now write the smallest element of the vector and its
           position of it in this vector.*/

        Scanner input = new Scanner(System.in);
        int [] Q = new int [5];
        int value= 0, lower = 0, position=0;

        for (int x = 0; x < Q.length; x++){
            System.out.print("Insert a value: ");
            value = input.nextInt();

            if(value < 0){
                while(value < 0){
                    System.out.println("I'm sorry, but only positive values will be accepted.");
                    System.out.print("Enter a value again: ");
                    value = input.nextInt();
                }
            }
             /*to avoid inserting an extreme value for the lower variable,
                I decided to create a condition that establishes in the first loop that lower == value*/
            if(Q[x] == Q[0]) lower = value;
            Q[x] = value;
            if (value < lower) {
                lower = value;
                position = x;
            }

        }
        System.out.println("----------------------");
        System.out.println("       RESUME         ");
        System.out.println("Lower value : " + lower);
        System.out.println("Position: " + (position + 1));
    }
}
