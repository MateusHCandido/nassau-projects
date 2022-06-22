package projects.nassau.vectors;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args){
        /*Write a program to read any N value (which will be the size of the vectors). After reading two
          A and B (of N vectors each) and after size sum into a third vector Sum of
          elements of vector A with those of vector B (respecting the same measures) and write the vector Sum.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the vector: ");
        int N = input.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] sumAandB = new int [N];

        //Insertion vector A
        System.out.println("----------------------------");
        System.out.println("          VECTOR A          ");
        for(int x = 0; x < A.length; x ++){
            System.out.print("Insert a value: ");
            A[x] = input.nextInt();
        }
        //Insertion vector B
        System.out.println("----------------------------");
        System.out.println("          VECTOR B          ");
        for(int y = 0; y < B.length; y++){
            System.out.print("Insert a value: ");
            B[y] = input.nextInt();
        }
        //Sum of vectors A and B
        for(int z = 0; z < sumAandB.length; z++) sumAandB[z] = A[z] + B[z];

        //Presentation of the sum
        System.out.println("----------------------------");
        System.out.println("          RESUME            ");
        System.out.println();
        for(int sums: sumAandB) System.out.print(sums + " ");
        System.out.println();
        System.out.println("----------------------------");
    }
}
