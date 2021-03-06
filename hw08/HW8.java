////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//October 25,2014
//CSE 02
//HW8 Program
        //use additional methods to accomplish specific tasks
            //note: these are overloaded methods-all have same name of getInput
                        //distinguish using calls like getInput(scan,"dEf")
                //what tasks might you ask?
                        //enter a specific char or number and return back to the user the input
                    //remember to provide conditionals for wrong inputs
                    //use chars!!!

//import scanner
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input; //the inputed variable must be a char
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");  //prompt the user to enter c or C to continue with program
	        //if else, quit the program entirely
	input=getInput(scan,"Cc");  //call 1st method
	System.out.println("You entered '"+input+"'");  //print out input that determines if you should continue (c/C)
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");  //prompt the user to enter one of the letters y, Y, N, or n
	input=getInput(scan,"yYnN",5); //call 2nd method
	    //give up after 5 attempts
	
	if(input!=' '){ //if the input that was entered was not a space
   	    System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");    //call 3rd method
	System.out.println("You entered '"+input+"'");  //print out entered digit from choices of 0-9
  } //end of main method
  
  public static char getInput(Scanner myScanner, String letters)	{	//what entered must be one of the characters C or c
  	myScanner=new Scanner(System.in);	//scanner instance
    letters=myScanner.next();	//accept user input
    char first=letters.charAt(0);   //checks the first letter of string
    if (!(letters.length()==1)) {   //if length is greater than 1
        System.out.print("You did not enter one character. Try again: ");   //error message to prompt user to enter correct length
        first=getInput(myScanner, letters); //run the method again
        return first;   //return this 
    }
    else    {   //if length of char is 1
        if (first=='c' || first=='C')   {   //when user enters a C or c
            return first;   //return this
        }
        else    {   //not above input
           System.out.print("You did not enter C or c. Try again: ");   //error message to prompt user to enter correct length
            first=getInput(myScanner, letters); //run the method again
            return first;   //return this  
        }
    }
  }
  
  public static char getInput(Scanner myScanner, String letters, int limitFive) {   //2nd method
      //limitFive is set equal to five
      myScanner=new Scanner(System.in); //scanner instance
      //int a=0;    //make this a counter
      letters=myScanner.next(); //accept the user input
      char x=letters.charAt(0); //check the first letter of the string
      if (!(letters.length()==1))   {   //if length is greater than 1
          System.out.print("You did not enter one character. Try again: "); //propt user to enter another input
          x=getInput(myScanner, letters);   //run the method again
          return x; //return this to the main method 
      }
      else {    //if length is 
          while (limitFive>=1){
              //a=0;  //initialize a 
              if (x=='Y' || x=='y' || x=='N' || x=='n') {   //check if input is one of these 
                  return x; //return this to the main method
              }
              if (limitFive==1) {
                  System.out.println("You failed after 5 tries.");
                  break;    //break out of the loop after 5 tries
              }
              else { //if what entered is not one of the above
                  System.out.print("You did not enter a character from the list 'yYnN'; try again- ");  //error message, prompt user to enter another
                  limitFive--;  //decrement so that loop will stop after 5 tries
                  x=getInput(myScanner, letters, limitFive);    //run the method again
                  return x; //return this to main method
              }
          }
      }
  
      return x;
  }
  
  public static char getInput(Scanner myScanner, String str, String digits) {   //third method
    myScanner=new Scanner(System.in);   //scanner instance
   
        System.out.println(str);
        System.out.print("Enter one of:'0','1','2','3','4','5','6','7','8','9'- "); //prompt the user to enter a digit
        digits=myScanner.next();
        char first=digits.charAt(0);
        //digits=myScanner.next(); 
    if (!(digits.length()==1))  {   //if the length of the input does not equal 1
        System.out.println("Enter exactly one character ");   //print the error
        first=getInput(myScanner, str, digits);  //run the third method again
        return first;   //return this value
    }
    else {
        if (first=='0' || first=='1' || first=='2' || first=='3' || first=='4' || first=='5' || first=='6' || first=='7' || first=='8' || first=='9')   {
            return first;   //return this value
        }
        else    {
            System.out.println("You did not enter an acceptable character.");
            first=getInput(myScanner, str, digits);  //run the thrid method again
            return first;   //retrun the value
        }
   }
  } //end of 3rd method
  
  
}   //end of class