package com.calisco;

import java.util.Scanner;


/*
Main Program which runs and sends for User to interact with prompt to create ProductionWorker Objects.
 @author Caleb Danso , 52349
*/

public class Main {

    public static void main(String[] args) {
        //object for scanner class created
        Scanner input = new Scanner(System.in);
        char choice;

        // Repeats the loops depending if user prompts N at the end of filling employee prompts.
        do
        {
            // User is prompted to enter employee name
            System.out.print("Enter the employee name: ");
            String empName = input.nextLine();

            //  User is prompted to enter employee  number
            System.out.print("Enter the employee number in the format XXX-L \n ( X is a digit within the range 0-9 and the L is a letter in the range A-M): ");
            String empNumber = input.nextLine();

            // User is prompted to enter employee hire date
            System.out.print("Enter the employee hire date: ");
            String date = input.nextLine();

            // User is prompted to enter employee shift
            System.out.println("Day Shift = 1");
            System.out.println("Night Shift = 2");
            System.out.print("Enter the employee shift: ");
            int sh = Integer.parseInt(input.nextLine());

            // User is prompted to enter employee hourly pay rate
            System.out.print("Enter the hourly pay rate: $");
            double rate = Double.parseDouble(input.nextLine());

            // Object is created from ProductionWorker Class
            ProductionWorker worker1 = new ProductionWorker(empName,empNumber,date,sh, rate);
            // Object is created from ProductionWorker Class
            ShiftSupervisor supervisor1= new ShiftSupervisor("Caleb Danso", "539-B", "5/25/2021", 15450, 2676);
            ShiftSupervisor supervisor2= new ShiftSupervisor("James Brown", "153-Z", "7/17/2020", 18540, 3200);
            ShiftSupervisor supervisor3= new ShiftSupervisor("Warren Buffet", "539-C", "3/14/2018", 30000, 5000);

            // Displays Employee Details
            System.out.println("\nEmployee Details");
            System.out.println(worker1);
            System.out.println("\nShift Supervisor1 Details");
            System.out.println(supervisor1);
            System.out.println("\nShift Supervisor2 Details");
            System.out.println(supervisor2);
            System.out.println("\nShift Supervisor3 Details");
            System.out.println(supervisor3);

            // a prompt to allow user to exit program or add more ProductionWorker objects.
            System.out.print("\nDo you want to add another Worker? (Y/N): ");
            choice = input.nextLine().charAt(0);
            System.out.println();
        }while(choice == 'Y' || choice == 'y'); //as long as its yes programs keeps looping
    }
}
