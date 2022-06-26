package projects.nassau.subroutines;

    /*Create a calculator program that presents a selection menu in the program
    primary. This menu should give the user the possibility to choose one of four operations
    Arithmetic. When you choose, you should be asked to enter two numbers, and
    the operation should be displayed.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double result = 0d;
        while(true){
            System.out.println("-----------------------");
            System.out.println("      CALCULATOR       ");
            System.out.println();
            System.out.println("[1] - SUM");
            System.out.println("[2] - SUBTRACT");
            System.out.println("[3] - MULTIPLY");
            System.out.println("[4] - DIVIDE");
            System.out.println();
            System.out.print("SELECT THE OPERATION: ");
            int option = input.nextInt();
            System.out.println("-----------------------");
            System.out.print("Enter a first value: ");
            int firstNumber = input.nextInt();
            System.out.print("Enter a second value: ");
            int secondNumber = input.nextInt();
            switch (option){
                case 1:
                    //SUM
                    result = Exercise01.sum(firstNumber, secondNumber);
                    System.out.println("Sum result: " + result);
                    break;

                case 2:
                    //SUBTRACT
                    result = Exercise01.subtraction(firstNumber, secondNumber);
                    System.out.println("Result of subtraction: " + result);
                    break;

                case 3:
                    //MULTIPLY
                    result = Exercise01.multiply(firstNumber, secondNumber);
                    System.out.println("Result of multiplication: " + result);
                    break;

                case 4:
                    //DIVIDE
                    result = Exercise01.division(firstNumber, secondNumber);
                    System.out.println("Result of division: " + result);
                    break;

                default:
                    System.out.println("ERROR1: SELECT A VALID OPTION");
                    break;
            }
            System.out.println("-----------------------");
            System.out.println();
            System.out.println("CONTINUE?");
            System.out.println("[1] - YES");
            System.out.println("[2] - NOT");
            option = input.nextInt();
            if (option == 1) continue;
            else if (option == 2) break;
            else System.out.println("ERROR1: SELECT A VALID OPTION");
        }
    }
    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    public static int subtraction(int n1, int n2){
        return n1 - n2;
    }

    public static int multiply(int n1, int n2){
        return  n1 * n2;
    }

    public static double division(int n1, int n2){
        return (double) n1 / n2;
    }
}
