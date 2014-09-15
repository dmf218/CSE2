//Daniella Fodera
//September 10,2014
//CSE 02
//Bicycle Program
    //prompt user to enter 2 digits
        //enter number of counts on cyclometer
        //enter number of seconds during the counts that occurred
    //print out distance traveled
    //print out average miles per hour
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle

import java.util.Scanner;   //import scanner for use

//define a class
public class Bicycle {
    //main method required for every java program
    public static void main(String[] args)  {
        //input data and create variables
        //call scanner constructor
        Scanner input = new Scanner(System.in);   //create instance of scanner class
        
        double wheelDiameter=27.0;   //create variable for wheel diameter
        double PI=3.14159;  //create variable for pi
        double feetPerMile=5280;    //create variable for feet to mile conversion
        double inchesPerFoot=12;    //create variable for inches to feet conversion
        double secondsPerMinute=60; //create variable for seconds to minute conversion
        double minutesPerHour=60;   //create variable for minute to hour conversion

        System.out.print("Enter the number of seconds(an integer>0): ");    //prompt the user to enter the total number of seconds
        int nSeconds = input.nextInt(); //accept user input for total number of seconds
        System.out.print("Enter the number of counts(an integer>0): "); //prompt the user to enter the number of counts
        int nCounts = input.nextInt();    //accept user input for total number of counts
        
        double totalDistance=(int)(((nCounts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile))*100)/100.0;    //calculate total distance traveled from information given
        double totalTimeMinutes=nSeconds/secondsPerMinute; //calculate total time in minutes
        double totalTimeHours=totalTimeMinutes/minutesPerHour;  //calculate total time in hours
        double avgMPH=(int)((totalDistance/totalTimeHours)*100)/100.0; //calculate average miles per hour
        
        System.out.println("The total distance traveled was "+(totalDistance)+" miles and took "+totalTimeMinutes+" minutes."); //print out statement
        System.out.println("The average mph was "+avgMPH+".");  //print out average mph
    }   //end of main method
}   //end of class
