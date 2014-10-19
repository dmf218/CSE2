////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//October 18, 2014
//CSE 02
//Number Stack Program
    //print out numbers up to number inputed
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
            if (number>=1 && number<=9) {
                for (int i=1; i<=number; i++)   {       //i is a counter to stop the for loop
                    for (int s=0; s < (9 - i); s++) {
                        System.out.print(" ");
                    }
                    for (int j=0; j<(2*i-1); j++) {     //number of digits printed out per row is two more thn last
                        System.out.print(i);    //print i on one line
                    }
                    System.out.println();
                    for (int s=0; s < (9 - i); s++) {
                        System.out.print(" ");
                    }
                    if (!(i==1)){   //when it is the first number (only print one 1)
                        for (int k=0; k<(2*i-1); k++) {     //same as above for loop just doubles it
                        System.out.print(i);    //print all i on one line
                    }
                    System.out.println();   //go to next line
                    for (int s=0; s < (9 - i); s++) {
                        System.out.print(" ");
                    }
                    }
                    for (int d=0; d<(2*i-1); d++)   {
                        System.out.print("-");  //print number dashes in same format 
                    }
                    System.out.println();   //go to next line
                }
                //same as above but with while loops
                int z=1;
                while (z<=number)   {
                    int s=0;
                    while (s < (9 - z)) {
                         System.out.print(" ");
                         s++;   //increment counter
                    }
                    int j=0;
                    while (j<(2*z-1))   {
                        System.out.print(z);    //print i on one line
                        j++; //increment
                    }
                    System.out.println();
                    s=0;
                    while (s < (9 - z)) {
                         System.out.print(" ");
                         s++;   //increment counter
                    }
                    if (!(z==1)){   //when it is the first number (only print one 1)
                        int k=0;    //declare variable
                        while (k<(2*z-1))   {
                            System.out.print(z);    //print all i on one line
                            k++;
                        }
                        System.out.println();   //go to next line
                        s=0;
                        while (s < (9 - z)) {
                        System.out.print(" ");
                        s++;
                        }
                    }
                    int d=0;
                    while (d<(2*z-1))   {
                        System.out.print("-");  //print number dashes in same format 
                        d++;
                    }
                    System.out.println();   //go to next line
                    z++;    //increment counter for while loop  
                }
                int p=1;
                do {
                    int s=0;
                    do {
                         System.out.print(" ");
                         s++;   //increment counter
                    } while (s < (10 - p));
                    int j=0;
                    do   {
                        System.out.print(p);    //print i on one line
                        j++; //increment
                    } while (j<(2*p-1));
                    System.out.println();
                    s=0;
                    do {
                         System.out.print(" ");
                         s++;   //increment counter
                    } while (s < (10 - p));
                    if (!(p==1)){   //when it is the first number (only print one 1)
                        int k=0;    //declare variable
                        do  {
                            System.out.print(p);    //print all i on one line
                            k++;
                        } while (k<(2*p-1));
                        System.out.println();   //go to next line
                        s=0;
                        do {
                        System.out.print(" ");
                        s++;
                        } while (s < (10 - p));
                    }
                    int d=0;
                    do  {
                        System.out.print("-");  //print number dashes in same format 
                        d++;
                    } while (d<(2*p-1)) ;
                    System.out.println();   //go to next line
                p++;
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
