//Daniella Fodera
//September 14,2014
//CSE 02
//Four Digits Program
    //prompt user to enter a double
    //print out first four digit right of decimal point
//compile the program
    //javac FourDigits.java
//run the program
    //java FourDigits
//import Scanner
import java.util.Scanner;

public class FourDigits {
    public static void main(String[] args)  {
        //call scanner constructor
        Scanner input= new Scanner(System.in);   //create instance of scanner class
        
        System.out.print("Enter the value of a double: ");  //prompt user to input number
        double number=input.nextDouble(); //accept user input
        double expanded= (number*10000);   //make decimal points to an integer
        
        String digits= String.format("%04d",(int)(expanded)%10000);
      
        System.out.println("The four digits right of the decimal point is "+digits+".");   //print out 4 digits
    }
}