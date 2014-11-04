////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera 
//CSE 02
//October 31, 2014
//Blocked Again Program
        //use additional methods to accomplish the task of printing out increented blocks
/*
   1
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
//allBlocks print out 
//block (first) printout/ everything else
//spaces in the line and number of times printed out on the same row

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }   //end of main method
    public static int getInt() {
        Scanner myScanner;
        int input;  //initialize variable
        myScanner=new Scanner (System.in);  //scanner instance
        System.out.print("Enter a int between 1 and 9: ");  //prompt the user to enter an int between 1 and 9 inclusive
        input=checkInt(myScanner);  //go to checkInt method to check if user entered an int
        //set the result equal to the variable input
        return input;
    }   //end of getInt method
    
    public static int checkInt(Scanner scan)   {
        int x;
        scan=new Scanner (System.in);   //scanner instance
        while (!(scan.hasNextInt()))    {   //if what entered is not equal to an int
            scan.next();   //get rid of junk input
            System.out.print("You did not enter an int. Try again: ");    //print out error message
        }
           int number=scan.nextInt();
           x=checkRange(number, scan); //go to next method to test if number inputed is within the range
           return x;    //return value to main method
    }   //end of checkInt method
    
    public static int checkRange(int numberRange, Scanner scan)    {

        if (numberRange<1 || numberRange>9)   {   //if within the range
         
            System.out.print("You did not enter an int in [1,9] Try again: ");  //prompt user for additional input
            numberRange=checkInt(scan); //check int again
        }
            return numberRange; //return this to the checkInt method
        }
    
    public static void allBlocks(int numBlock)  {
        block(numBlock);
    }   //end of allBlocks method
    
    public static void block(int number)    {
        for (int i=1; i<=number; i++)   {       //i is a counter to stop the for loop

                    for (int s=0; s < (number - (i-1)); s++) {   //for loop to print out spaces for formatting
                        System.out.print(" ");  //print out spaces
                    }
                    for (int j=0; j<(2*i-1); j++) {     //number of digits printed out per row is two more thn last
                        System.out.print(i);    //print i on one line
                    }
                    System.out.println();
                    for (int s=0; s < (number - (i-1)); s++) {
                        System.out.print(" ");  //print out spaces
                    }
                    for (int n=1; n<i; n++){
                    if (!(i==1)){   //when it is the first number (only print one 1)
                        for (int k=0; k<(2*i-1); k++) {     //second digit line
                        System.out.print(i);    //print all i on one line
                    }
                    System.out.println();   //go to next line
                    for (int s=0; s < (number - (i-1)); s++) {
                        System.out.print(" ");  //print out soaces
                    }
                    
                    }
                    }
                    for (int d=0; d<(2*i-1); d++)   {   
                        System.out.print("-");  //print number dashes in same format 
                    }
                    System.out.println();
                }   //end of overarching for loop
    }   //end of block method
    
    public static void line(int number) {
        for (int i=1; i<=number; i++)   {
          for (int d=0; d<(2*i-1); d++)   {   
            System.out.print("-");  //print number dashes in same format 
          }
        System.out.println();   //go to next line  
        }
    }
    
    
    
//at the end of line and block return 0;  maybe allBlocks
}   //end of class



