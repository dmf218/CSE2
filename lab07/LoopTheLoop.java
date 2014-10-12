////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//October 8, 2014
//CSE02
//Loop The Loop Program
    //print out stars with loop statements
    
//import Scanner 
import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String[] args)  {
        
        Scanner myScanner;  //establish scanner variable
        myScanner=new Scanner(System.in);   //scanner instance
        
        while (true)    {
       System.out.print("Enter a number between 1 and 15:");   //prompt user to input varaible
        if (myScanner.hasNextInt()) {
            int nStars=myScanner.nextInt(); //make user input equal to nStars
            if (nStars>15 || nStars<1)  {
                System.out.println("You did not enter an int between 1 and 15.");   //error message if input outside range
            }
            else if (nStars<=15 || nStars>=1)    {
                int n=0;    //establish a counter
                //int nStars=10;  //establish a sentinel variable as max
        
                while (n<nStars)    {
                    System.out.print("*");
                    n++;
                }
                int q=1;
                System.out.println();
        
                while (q<=nStars)    {  //print out incremented lines of stars
                    int x=0;
                    while (x<q) {
                        System.out.print("*");  //print out until q says to stop 
                            x++;    //increment x
                    }
            
                    System.out.println();   //go to next line
                    q++;
                }
                System.out.print("Enter y or Y to go again");   //prompt user to run pogram again
                if (myScanner.hasNext())    {
                    String answer=myScanner.next();
                    if (answer.equals("Y") || answer.equals("y"))   {
                        continue;
        
            }
                }
                }
            else    {
                break;
            }
        
                return;
            
            
        
        }//end of if statement accepting user input
        else {  //if integer is not inputed
            System.out.println("You did not enter an int.");    //print error message if bad input
        }
        
    
        }   //end o infinite whil statement
    }   //end of main method
}   //end of class