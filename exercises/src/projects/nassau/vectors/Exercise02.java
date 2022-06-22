package projects.nassau.vectors;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args){
        /* Write a program that allows you to read grades from a class of 20 students. Calculate the
           average of the class and count how many students scored above this calculated average. Write to
           average of the class and the result of the count.
        */
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Double [] punctuation = new Double[2];
        double classAverage = 0,studentAverage, firstNote, secondNote;
        int aboveAverage = 0;

        for(int x = 0; x < punctuation.length; x ++){
            System.out.println("----------------------------");
            System.out.println(x+1 + "# STUDENT");
            System.out.println("");
            System.out.println("Enter the first note: ");
            firstNote = input.nextDouble();
            System.out.println("Ente the seconde note: ");
            secondNote = input.nextDouble();
            studentAverage = (firstNote + secondNote) / 2;
            System.out.printf("AVERAGE %d STUDENT: %.2f%n", (x+1), studentAverage);
            if(studentAverage >= 7) aboveAverage++;
            punctuation[x] = studentAverage;
            classAverage += punctuation[x];
        }
        classAverage = classAverage / punctuation.length;
        System.out.println("----------------------------");
        System.out.println("          RESUME            ");
        System.out.println("Number of students above average: " + aboveAverage);
        System.out.printf("Class average: %.2f", classAverage);
    }
}
