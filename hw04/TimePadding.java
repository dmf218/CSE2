//Daniella Fodera
//September 22,2014
//CSE02
//Time Padding Program
    //user input positive integer giving the number of seconds
    //display time in conventional form
            //10:03:05 form
        //make sure "padded" zeros are displayed
//compile the program
    //javac TimePadding.java
//run the program
    //java TimePadding
//import Scanner
import java.util.Scanner;   

//create a class
public class TimePadding {
    //create main method
    public static void main(String[] args)  {
        //call scanner constructor
        Scanner myScanner;  
        myScanner= new Scanner (System.in);
        int sec;    //establish variable
        int min;    //establish variable
        int hour;   //establish variable
        int time;
        
        System.out.print("Enter the time in seconds:"); //prompt the user to enter number of seconds
        if (myScanner.hasNextInt()) {   //accept on integer values
            time=myScanner.nextInt();   //accept user input as variable
        }
        
    }   //end of main method
}   //end of class