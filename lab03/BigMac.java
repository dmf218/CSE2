//Daniella Fodera
//September 10,2014
//CSE 02
//Big Mac Program
    //compute the cost of a certain amount of big macs
    //creater scanner class
        //user input data for how many big macs, cost per big mac, and the percentage tax
    //display total cost of purchase
//  first compile the program
//      javac BigMac.java
//  run the program
//      java BigMac
//import Scanner
import java.util.Scanner;

//define a class
public class BigMac {
    //main method required for every program
    public static void main(String[] args)  {
        Scanner myScanner;  //declare Scanner as a variable
        //call scanner constructor
        myScanner = new Scanner ( System.in );  //create instance of scanner class
        
        System.out.print("Enter the number of BigMacs(an integer > 0): ");  //prompt the user to input number of big macs
        int nBigMacs = myScanner.nextInt(); //accept user input
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): " );   //promt the user to input the cost of big macs
        double bigMac$ = myScanner.nextDouble();    //accept user input for cost of big mac
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();    //accept user input for tax rate
        taxRate/=100;    //user enters percent but you want proportion
        double cost$;   //establish variable
        int dollars,    //whole dollar amount of cost
            dimes, pennies; //for storing digits
                //to the right of the decimal point
                //for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction 
        dollars=(int)cost$;
        //get dimes amount, e.g.,
        //(int)(6.73*10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        //after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +
        " per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+
        dollars+'.'+dimes+pennies);
        
    }   //end of main method
}   //end of class