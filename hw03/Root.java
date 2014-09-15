//Daniella Fodera
//September 14, 2014
//CSE 02
//Root Program
    //prompt user to enter a double
    //print out crude estimate of cubed root
    //print out crude guess when cubed
    //improve guess four more times by coding substitution
//compile the program
    //javac Root.java
//run the program
    //java Root
    
//import scanner
import java.util.Scanner;

//define a class
public class Root {
    //main method
    public static void main(String[] args)  {
        //declare scanner as a variable
        //call scanner constructor
        Scanner input=new Scanner(System.in);   //create instance of scanner class
        
        System.out.print("Enter value of a double: ");  //prompt user to input a double
        double x= input.nextDouble(); //accept user input for number
        double guess1=x/3;  //guess square root
        double resultGuess1=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);   //crude guess when cubed
        double resultGuess2=(2*resultGuess1*resultGuess1*resultGuess1+x)/(3*resultGuess1*resultGuess1);   //crude guess when result is cubed
        double resultGuess3=(2*resultGuess2*resultGuess2*resultGuess2+x)/(3*resultGuess2*resultGuess2);   //crude guess when cubed
        double resultGuess4=(2*resultGuess3*resultGuess3*resultGuess3+x)/(3*resultGuess3*resultGuess3);   //continue to guess the cubed answer
        double resultGuess5=(2*resultGuess4*resultGuess4*resultGuess4+x)/(3*resultGuess4*resultGuess4);   //closer guess to real cubed
        
        System.out.println("The cube root is "+resultGuess5+".");   //print estimate answer of cube root
        System.out.println("The value cubed is "+resultGuess5+"*"+resultGuess5+"*"+resultGuess5+"="+(resultGuess5*resultGuess5*resultGuess5)+".");    //print out estimate of cube root cubed
    }
}

