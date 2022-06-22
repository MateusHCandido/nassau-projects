package projects.nassau.vectors;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args){
       /* Write a program to read and store in a vector the average temperature of all the days of the
        year. Calculate and write:
            a) The Lowest temperature of the year
            b) The Highest temperature of the year
            c) Annual average temperature
            d) The number of days in the year when the temperature was below the annual average*/
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double[] annualTemperature = new double[365];
        double higherTemperature=0, lowestTemperature=0, annualAverage=0;
        int daysBelowAverage=0;

        System.out.println("------------------------------");
        System.out.println("      DAYLE TEMPERATURE       ");
        System.out.println();
        for(int days = 0; days < annualTemperature.length; days++){
            System.out.print("Enter the temperature of he day " + (days +1) + ": ");
            annualTemperature[days] = input.nextDouble();
            if(days == 0) lowestTemperature = annualTemperature[days];
            if(annualTemperature[days] > higherTemperature) higherTemperature = annualTemperature[days]; //point a)
            if(annualTemperature[days] < lowestTemperature) lowestTemperature = annualTemperature[days];//point b)
            annualAverage += annualTemperature[days];
            System.out.println();
        }
        //Annual average calculation | point c)
        annualAverage /= annualTemperature.length;
        for (double temperature : annualTemperature) {
            if (temperature < annualAverage) daysBelowAverage++; // point d)
        }
        System.out.println("------------------------------");
        System.out.println("            RESUME            ");
        System.out.println();
        System.out.println("The Lowest temperature of the year: " + lowestTemperature);
        System.out.println("The Highest temperature of the year: " + higherTemperature);
        System.out.printf("Annual average temperature: %.2f%n", annualAverage);
        System.out.println("The number of days in the year when the temperature was below the annual average: " + daysBelowAverage);



    }
}
