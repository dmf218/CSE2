//Daniella Fodera
//September 17,2014
//cse02
//Big Mac Again Program
    //use scanner class
        //input from user
            //number of big macs they want
            //if they want fries
        //validate if input is correct
        //calculate total cost
        //print total cost
    //compile program
        //javac BigMacAgain.java
    //run the program
        //java BigMacAgain
//import scanner
import java.util.Scanner;

//create a class
public class BigMacAgain {
    public static void main(String[] args)  {
        //call scanner constructor
        Scanner myScanner;  //establish variable
        myScanner=new Scanner(System.in);   //create instance of scanner class
        int nBigMacs;   //establish variable
        
        System.out.print("Enter the desired amount of BigMacs (an integer>0): "); //prompt user to enter the number of big macs
        //check that user input is acceptable
        if(myScanner.hasNextInt()) { //set initial conditions
            nBigMacs = myScanner.nextInt();   //accept user input for number of big macs
        }
        else    {
            System.out.println("You did not enter an int.");    //print if value entered is not an integer
            return; //terminates the program
        }
        
        double bigMac$=2.22;    //set cost of one big mac
        double fries$=2.15; //set cost of one order of fries
        int dollars,    //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point
        double cost$=nBigMacs*bigMac$;  //calculate cost of big macs ordered
        dollars=(int)cost$; //whole number dollars cost
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        
        System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+
            " per BigMac is $"+dollars+"."+dimes+pennies);  //print out cost of big macs ordered
            
        System.out.print("Do you want an order of fries(Y/y/N/n)? ");   //promt the user to enter if they want fries
        if(myScanner.hasNext()) {
            String fries=myScanner.next();
            if (fries.equals("Y") || fries.equals("y")) {       //if input is Y or y
                System.out.println("You ordered fries at a cost of $2.15.");    //print confirmation that they ordered fries
                System.out.println("The total cost of the meal is "+(Math.round((nBigMacs*bigMac$)+fries$)));   //print total cost if ordered fries
            }
            if (fries.equals("n") || fries.equals("N")) {       //if the input is N or n
                System.out.println("The total cost of the meal is "+dollars+"."+dimes+pennies);     //print total cost of meal if did not order fries
            }
            else    {
                System.out.println("Error. Did not enter appropriate variable.");   //print statement if any other variable is entered
                System.out.println("The total cost of the meal is "+dollars+"."+dimes+pennies); //print total cost of meal
                return; //terminates the program
            }
        }   //end of if statement

        }   //end of main method
    }   //end of class