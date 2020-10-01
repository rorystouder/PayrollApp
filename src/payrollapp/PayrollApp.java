/*
 * copyright held by Ocelot Media LLC, 2017
 * all rights reserved by Ocelot Media, LLC 2017
 */
package payrollapp;

import java.util.Scanner;

/**
 *
 * @author Rory Stouder
 *  SDEV 200 Exercise 4.23
 */
public class PayrollApp {
    public static void main(String[] args) {
        // declare strings and variables
        double deductions;
        
        // Prompt user for information
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double sTax = input.nextDouble();
        
        // Some math for total deduction
        deductions = ((( pay * hours ) * fTax ) 
                + (( pay * hours ) * sTax ));
        
        // print out results
        System.out.println("Employee name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay rate: $" + pay);
        System.out.println("Gross Pay: $" + (pay * hours));
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (20.0%): $" 
                + Math.round(((pay * hours) * fTax ) * 100 ) / 100.0 );
        System.out.println("  State Withholding (9.0%): $"
                + Math.round(((pay * hours) * sTax ) * 100 ) / 100.0 );
        System.out.println("  Total Deduction: $" 
                + Math.round(deductions * 100) / 100.0 );
        System.out.println("Net Pay: $" 
                + Math.round(((pay * hours) - deductions )* 100) / 100.0 );
        
    }
    
}
