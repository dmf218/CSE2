//Daniella Fodera
//September 18, 2014
//CSE 02
//Income Tax Program
    //prompt user to enter int
        //income in thousands of dollars
    //write out amount of tax based on income
        //<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.
            //tax percentage based on income
                //tx % increases as income incr
//compile the program
    //javac IncomeTax.java
//run the program
    //java IncomeTax

//import scanner
import java.util.Scanner;

//create a class
public class IncomeTax  {
    //create main method
    public static void main(String[] args)  {
        //call scanner constructor
        Scanner myScanner;  //create variable
        myScanner= new Scanner(System.in);  //create instance for scanner
        int income; //establish income as variable
        double taxRate; //establish taxRate as a variable for future use
        double incomeTax;   //establish variable
        
        System.out.print("Enter an int giving the number in thousands: ");  //prompt user to input value for aforementioned variable
        if (myScanner.hasNextInt()) {   //if inputed variable is an integer
            income= myScanner.nextInt();    //set inputed value equal to variable income if conditions are met
                if (income<=0)  {   //conditions if income less than zero
                    System.out.print("You did not enter a positive int.");  //print statement if value less than 0
                }
                if (income>=0 && income<=20)    {
                    taxRate=.05;    //set tax rate for income less than 20,000 (20)
                    incomeTax=((income*taxRate)*1000);  //calculate income tax paid in dollars
                    System.out.println("The tax rate on $"+income+",000 is "+(taxRate*100)+"%, and the tax is $"+incomeTax);   //print income, tax rate, and income tax
                }
                if (income>20 && income<=40)    {   //if income is between 20 and 40
                    taxRate=.07;    //set tax rate for specified conditions
                    incomeTax=Math.round((income*taxRate)*1000);  //calculate income tax
                    System.out.println("The tax rate on $"+income+",000 is "+(taxRate*100)+"%, and the tax is $"+incomeTax);   //print income,tax rate, and income tax
                }
                if (income>40 && income<=78)  {   //if income is greater than 40 and less than 78
                    taxRate=.12;    //set tax rate for specified conditions
                    incomeTax=((income*taxRate)*1000);  //calculate income tax
                    System.out.println("The tax rate on $"+income+",000 is "+(taxRate*100)+"%, and the tax is $"+incomeTax);   //print income, tax rate, and income tax)
                }
                if (income>78)  {   //if income is greater than 78
                    taxRate=.14;    //set tax rate
                    incomeTax=((income*taxRate)*1000);  //calculate income tax
                    System.out.println("The tax rate on $"+income+",000 is "+(Math.round((taxRate*100)))+"%, and the tax is $"+incomeTax);
                }
                return; //terminate program
        }
        if (myScanner.hasNextDouble())  {   //set conditions if input is double
            System.out.println("You did not enter an int.");    //print statement if follow conditions
            return; //terminate program
            }
    }
}
    