//Daniella Fodera
//October 1,2014
//CSE02
//Enigma1 Program
        //fix any errors whatsoever
        
/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */
 
 
//remainder is left of 100% in decimal

import java.util.Scanner;
public class Enigma1{
  public static void main(String[] arg){
      Scanner myScanner;    //intitialize
      myScanner= new Scanner(System.in);  //create instance
    double percent;
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    if (myScanner.hasNextInt())  {
        double x=myScanner.nextInt();  //make user input equal to x
    
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   
   percent=((1-(x/100))*100)/100.0;   //calculate percentage
   System.out.println("The proportion remaining is "+percent);  
   
    /* if(1-x/100==0.93) { //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    }
    else if(1-x/100==0.59) {//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    }
    else if(1-x/100==0.86)  {//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    }
    else if(1-x/100==0.67) {//when the user enters 33
          System.out.println("The proportion remaining is "+0.67);
    }
    else if(1-x/100==0.4)   {//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    }
   */ 
   }
   else {
       System.out.println("You did not enter an appropriate value. Try again.");
   }
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * created instance for the scanner
 * double not needed for x since inputed as integer anyways
 added if statement accepting user input
 added else staement for inputs that are not integers
 if statement presently do not have brackets for one.
        additionally, it is not necessary because you want it to calculate it for percentage
 added print statement for percent
 changed spacing of main method
 missing curly braces
 * 
 */
