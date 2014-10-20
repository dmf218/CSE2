////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//October 18, 2014
//CSE 02
//Number Stack Program
    //print out numbers up to number inputed
    //three different ways (for, while, and do while loops)
/*  1
    -
   222
   222
   ---
  33333
  33333
  33333
  -----
 4444444
 4444444
 4444444
 4444444
 -------
 */
 //import scanner
import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args)  {
        
        Scanner myScanner;  //establish scanner variable
        myScanner=new Scanner(System.in);   //scanner instance
        
        System.out.print("Enter a number between 1 and 9: ");       //prompt the user to enter specific int
        if (myScanner.hasNextInt()) {       //check to see if int
            int number=myScanner.nextInt(); //accept user input and set it equal to variable number
            int n=number;   //counter for number for spaces
            if (number>=1 && number<=9) {   //chack for range
                for (int i=1; i<=number; i++)   {       //i is a counter to stop the for loop
                    for (int s=0; s < (n - (i-1)); s++) {   //for loop to print out spaces for formatting
                        System.out.print(" ");  //print out spaces
                    }
                    for (int j=0; j<(2*i-1); j++) {     //number of digits printed out per row is two more thn last
                        System.out.print(i);    //print i on one line
                    }
                    System.out.println();
                    for (int s=0; s < (n - (i-1)); s++) {
                        System.out.print(" ");  //print out spaces
                    }
                    if (!(i==1)){   //when it is the first number (only print one 1)
                        for (int k=0; k<(2*i-1); k++) {     //second digit line
                        System.out.print(i);    //print all i on one line
                    }
                    System.out.println();   //go to next line
                    for (int s=0; s < (n - (i-1)); s++) {
                        System.out.print(" ");  //print out soaces
                    }
                    }
                    for (int d=0; d<(2*i-1); d++)   {   
                        System.out.print("-");  //print number dashes in same format 
                    }
                    System.out.println();   //go to next line
                }   //end of overarching for loop
                
                //same as above but with while loops
                int z=1;    //main counter for while loop trial
                while (z<=number)   {
                    int s=0;    //estabish variable
                    while (s < (n - (z-1))) {   //print spaces in stack like formation
                         System.out.print(" "); //print statement for spaces
                         s++;   //increment counter
                    }
                    int j=0;    //establish variable and set equal to 0
                    while (j<(2*z-1))   {   //while loop 
                        System.out.print(z);    //print i on one line
                        j++; //increment
                    }
                    System.out.println();   //skips to next line
                    s=0;    //reset variable for spaces
                    while (s < (n - (z-1))) {   //while loop so spaces format code correctly
                         System.out.print(" "); //print spaces
                         s++;   //increment counter
                    }
                    if (!(z==1)){   //when it is the first number (only print one 1)
                        int k=0;    //declare variable
                        while (k<(2*z-1))   {
                            System.out.print(z);    //print all i on one line
                            k++;
                        }
                        System.out.println();   //go to next line
                        s=0;    //reset variable for use again
                        while (s < (n - (z-1))) {   //print out spaces when it the the number inputed minus counter minus 1
                        System.out.print(" ");  //print spaces
                        s++;    //increment
                        }
                    }
                    int d=0;    //initialize counter variable d
                    while (d<(2*z-1))   {
                        System.out.print("-");  //print number dashes in same format 
                        d++;    //increment dash cunter
                    }
                    System.out.println();   //go to next line
                    z++;    //increment counter for while loop  
                }   //end of while loop code
                
                //very similar to previous code for just while loop
                //do while loop:
                int p=1;    //establish variable that controls main loop
                do {
                    int s=0;    //establish variable for looped spaces
                    do {
                         System.out.print(" "); //print out spaces
                         s++;   //increment counter
                    } while (s < (n - (p-1)));
                    int j=0;    //initialize variable for first line of numbers
                    do   {
                        System.out.print(p);    //print i on one line
                        j++; //increment
                    } while (j<(2*p-1));
                    System.out.println();
                    s=0;    //reset variable for later use
                    do {
                         System.out.print(" "); //add spaces
                         s++;   //increment counter
                    } while (s < (n - (p-1)));
                    if (!(p==1)){   //when it is the first number (only print one 1)
                        int k=0;    //declare variable
                        do  {
                            System.out.print(p);    //print all i on one line
                            k++;    //increment
                        } while (k<(2*p-1));
                        System.out.println();   //go to next line
                        s=0;    //reset spaces variable for later use
                        do {
                        System.out.print(" ");  //print out spaces
                        s++;    //increment couner of spaces loop
                        } while (s < (n - (p-1)));
                    }
                    int d=0;    //initialize dashes variable
                    do  {
                        System.out.print("-");  //print number dashes in same format 
                        d++;
                    } while (d<(2*p-1)) ;
                    System.out.println();   //go to next line
                p++;    //increment variable so large loop continues to run until completion
                } while (p<=number);
            }
            else    {   //if number not between 1 and 9
                System.out.println("You did not enter an int between 1 and 9.");    //error message
            }
        }
        else {  //if what entered was not an int
            System.out.println("You did not enter an int.");    //error message
        }
        
    }   //end of main method
}   //end of class
