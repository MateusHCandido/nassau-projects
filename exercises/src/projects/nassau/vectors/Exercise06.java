package projects.nassau.vectors;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args){
        /*Make a program of 20 numbers and remember in a vector. After reading all 20
          numbers, the program must write these 20 numbers read in reverse order.*/

        Scanner input = new Scanner(System.in);
        int[] vectors = new int[20];

        System.out.println("----------------------------------");
        System.out.println("      INSERTIONS OF VALUES");
        System.out.println();
        for(int x = 0; x < vectors.length; x++) {
            System.out.print("Insert a value: ");
            vectors[x] = input.nextInt();
        }
        System.out.println("----------------------------------");
        System.out.println("       INSERTION ORDER            ");
        System.out.println();
        for(int valuesInsertionOrder : vectors) System.out.print(valuesInsertionOrder + " ");
        System.out.println();
        System.out.println("        REVERSE ORDER            ");
        System.out.println();
        for(int y = vectors.length; y > 0; y--) System.out.print(vectors[y-1] + " ");
        System.out.println();
        System.out.println("----------------------------------");

    }
}
