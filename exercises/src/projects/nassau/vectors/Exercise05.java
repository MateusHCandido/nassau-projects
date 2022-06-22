package projects.nassau.vectors;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args){
        /*Read a vector A of 10 numbers. After, read one more number and save to an X variable.Store
         in a vector M the result of each element of A multiplied by the value X.
         vector M.*/

        Scanner input = new Scanner(System.in);
        int [] A = new int[10];
        int [] M = new int[A.length];
        int X;

        for(int x = 0; x < A.length; x ++){
            System.out.print("Insert a value: ");
            A[x] = input.nextInt();
        }
        System.out.print("Enter the multiplier value: ");
        X = input.nextInt();
        for (int y = 0; y< M.length; y++){
            M[y] = A[y] * X;
        }

        System.out.println("-----------------------");
        System.out.println("        RESUME         ");
        for(int values: M) System.out.print(values + " ");
    }
}
