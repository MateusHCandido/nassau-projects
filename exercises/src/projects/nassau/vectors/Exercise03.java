package projects.nassau.vectors;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args){
        /*Read a Q vector of 20 positions (accept positive numbers only). Write the value of the
        largest element of Q and its position in the vector.*/

        Scanner input = new Scanner(System.in);
        int [] Q = new int [5];
        int value= 0, largest = 0, position=0;

        for (int x = 0; x < Q.length; x++){
            System.out.print("Insert a value: ");
            value = input.nextInt();
            if(value <0){
                while(value <0){
                    System.out.println("I'm sorry, but only positive values will be accepted.");
                    System.out.print("Enter a value again: ");
                    value = input.nextInt();
                }
            }
            Q[x] = value;
            if (value > largest) {
                largest = value;
                position = x;
            }

        }
        System.out.println("----------------------");
        System.out.println("       RESUME         ");
        System.out.println("Highest value: " + largest);
        System.out.println("Position: " + (position + 1));

    }
}
