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
        
        int remSec; //establish variable for remaining seconds
        int time;   //establish variable (total seconds)
        int hour;
        int sec;
        int min;
        
        System.out.print("Enter the time in seconds:"); //prompt the user to enter number of seconds
        if (myScanner.hasNextInt()) {   //accept on integer values
            time=myScanner.nextInt();   //accept user input as variable
            hour=(time/3600);   //calculate number of hours
            String hourPad=String.format("%02d",hour);
            remSec=time-(3600*hour);   //calculate remaining seconds; hour seconds subtracted
            min=(remSec/60);    //calculate number of minutes
            String minPad=String.format("%02d",min);  
            sec=(remSec-(60*min));    //calculate number of seconds with padded digits
            String secPad=String.format("%02d",sec);    
                System.out.println("The time is "+hourPad+":"+minPad+":"+secPad+".");    //print out the time
        return; //terminate program
        }
        
        else    {
            System.out.println("You did not enter an valid number.");   //print if there is an error
            return; //terminate program
        }
        
    }   //end of main method
}   //end of class