////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//CSE02
//Root Program
        //calculate an estimation of the square root by uding the bisection method
//import scanner
import java.util.Scanner;

public class Root {
    public static void main(String[] args)  {
        
        Scanner myScanner;  //establish scanner variable
        myScanner=new Scanner(System.in);   //scanner instance
        
        double x;   //variable for user input

        System.out.print("Enter the value of a double greater than 0: ");   //prompt the user to enter number
        if (myScanner.hasNextDouble())    {
            x=myScanner.nextDouble() ;    //set x equal to user input
            if (x>0)   {
                double low=0;       //establish beginning low
                double high=x+1;    //establish beginning high
                double middle=(high+low)/2.0;   //create middle number
                double sqrMiddle=middle*middle; //declare variable to determine reassignent
                double compare=Math.sqrt(x);
                double tolerance=(0.0000001);   //declare tolerance variable
                
                while (middle>(tolerance+low))    {
                    if (compare < middle)    {
                        high=middle;    //reassign variable
                        //middle=(high-low)/2.0;  //recalculate middle
                    }
                    else if (compare > middle) {
                        low=middle;     //reassign variable
                        //middle=(high-low)/2.0;  //recalculate middle
                    }
                    
                    middle=(high+low)/2.0; //recalculate
                    
                }
                
                    System.out.println("The square root of "+x+" is "+middle);    //print our the value of square root
            }
            
            else {
                System.out.println("You did not enter appropriate input. Try again.");  //error message when input is not greater than 0
            }
        }
        else    {
            System.out.println("You did not enter an appropriate input. Try again.");   //error message
        }
        
        
    }   //end of main method
}   //end of class