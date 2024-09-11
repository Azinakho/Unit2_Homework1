/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit2_homework1;
import java.util.Scanner;

/**
 *Student Name: Azinakho Tyatya
 * Student Number: ST10460235
 * Assessment Name: Homework1 Unit2
 * Due date 23 August 2024
 */
public class Unit2_Homework1 {

    public static void main(String[] args) {
            //Creat a scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Promt user for first name
        System.out.println("Please enter your first name:");
        
        //Read First name using nextline method
        String firstName = scanner.nextLine();
        
        //Prompt user for thier last name
        System.out.println("Please enter your last name:");
        
        //Read last name using nextline method
        String lastName = scanner.nextLine();
        
        //Concatenate First and Last name
        String fullName = firstName + " " + lastName;
        
        //Print  full name
        System.out.println("Your full name is: " + fullName);
        
        //Close Scanner
        scanner.close();
        
    }
    
    public class StringWork {
         public static void main(String[] args) {
             //Declare variables
             String firstName = "John";
             String fullName = "H=John Dee";
             
             //Frst Initial
             char firstInitial = firstName.charAt(0);
             
             //Print first Intial
             System.out.println("First Initial: " + firstInitial);
             
             //Convert full name to uppercase
             fullName = fullName.toUpperCase();
             
             //Print full name and length
             System.out.println("Full Name: " + fullName);
             System.out.println("Character Count: " + fullName.length());
             
         }
        
    }
    public class SaleTaxCalculator {
        //variable to hold original price
        double originalPrice;
        
        //variable to hold sale tax rate
        double taxRate;
        
        //variable to hold total price after tax
        double totalPrice;
        
        //main
        public static void main(String[] args) {
            SaleTaxCalculator calculator = new SaleTaxCalculator();
            
            //Assign values
            calculator.originalPrice = 100.00;
            calculator.taxRate = 0.07;
            
            //Calculate total price includint tax
            calculator.calculateTotalPrice();
            
            //display total price
            calculator.displayTotalPrice(); 
        }
        public void calculateTotalPrice(){
            //Total cost after tax
            totalPrice = originalPrice + (originalPrice * taxRate);
        }
        public void displayTotalPrice(){
            System.out.println("The totalprice including tax is: $" + totalPrice);
        }
        
    }
    
}
