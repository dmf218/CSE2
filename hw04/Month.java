//Daniella Fodera
//September 18, 2014
//CSE 02
//Month Program
    //prompt user to enter int for correspoding month
            //react to situations where number is outside of range
        //if the month is February(2), prompt user to enter the correct year
            //make sure value entered is an int
            //make sure it is positive 
    //display number of days in month
//compile the program
    //javac Month.java
//run the program
    //java Month
    
//import scanner
import java.util.Scanner;

//create a class
public class Month  {
    //create main method
    public static void main(String[] args)  {
        //call scanner sonstructor
        Scanner myScanner;
        myScanner= new Scanner(System.in);  //create instance for scanner
        int month;  //set month as variable
        int year;   //set year as a variable
        int leapYearExc;    //set as variable for the exception to leap year rule
        int leapYearExc2;   //set as variable-find remainder when divided by 400
        
        System.out.print("Enter the int giving the number of a month (1-12): ");    //prompt user to input 
        
        if (myScanner.hasNextInt()) {   //if an int is entered
            month=myScanner.nextInt();  //set input value equal to month
            if ((month<1) || (month>12))  {  //if value inputed is outside the range of 1-12
                System.out.println("You did not enter an int between 1 and 12.");   //print statement if there is error
            }
            if ( (month==4) || (month==6) || (month==9) || (month==10))   {   //these months have 30 days
                //april,june, september, november
                System.out.println("This month has 30 days.");  //print statement when the month as 30 days in it
            }
            if ( (month == 1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==11) || (month==12) )   {   //these months have 31 days in them
                //january, march, may, july, august, october, december
                System.out.println("This month has 31 days");   //print statement if month has 31 days in it
            }
            if (month==2)   {   //when it is the month of february
                //february has 29 days every four years
                System.out.print("Enter an int giving the year: "); //prompt user to enter specific year 
                    if (myScanner.hasNextInt()) {
                        year=myScanner.nextInt();   //set input variable equal to month
                            if (year>0) {   //make sure input is positive value
                                int leapYear= year%4;   //find the remainder of the inputed year divided by 4
                                            //if remainder=0, then it is a leap year and has 29 days
                                            //if remainde>0, then it is simply a normal year and has 28 days 
                                    if (leapYear==0)    {   //if there is no remainder
                                        leapYearExc= year%100;  //determine if it is truly a leap year
                                                //if a year is divisible by 100, then it also must be divisible by 400 to be a leap year
                                            if (leapYearExc>0) {    //if not divisible by 100
                                                 System.out.println("The month has 29 days.");   //print when it is a leap year
                                            }
                                            if (leapYearExc==0) {
                                                leapYearExc2= year%400; //find remainder when divided by 400
                                                //check specifics of the rule
                                                if (leapYearExc2==0)    {   //then this year is a leap year
                                                    System.out.println("The month has 29 days.");   //print when leap year
                                                }
                                                if (leapYearExc2>0) {   //this year is not in fact a leap year
                                                    System.out.println("The month has 28 days.");   //print statement
                                                }
                                            }
                                    }
                                    if (leapYear>0) {   //if there is a remainder
                                        System.out.println("The month has 28 days.");   //print when it is ordinary year
                                    }
                            }
                            else    {       //when year is not a positive value
                                System.out.println("You did not enter a positive int.");    //print the type of mistake made
                            }
                    }
                    else {  //set conditions if inputed variable is not an int
                        System.out.println("You did not enter an int!");    //print statement if int not inputed for year
                    }
            }
        return; //terminate program
        }
        else    {   //if any other variable or double is entered
            System.out.println("You did not enter valid number.");  //print if there is error
        return; //terminate program
        }
  
    }//end of main method
}
    
    
    
