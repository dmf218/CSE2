//Daniella Fodera
//September 19, 2014
//CSE 02
//Course Number Program
    //read inputed 6 digit number
        //print out what year that it was offered
                //years between 1865 and 2014 are valid
        //print out what semester that it was offered
                //Last two digits: 10-spring, 20-summer 1, 30-summer 2, 40-fall
    //create if statements to make sure number adheres to set structure
//compile the program
    //javac CourseNumber.java
//run the program
    //java CourseNumber
//import the scanner
import java.util.Scanner;

//create a class
public class CourseNumber   {
    //create a main method
    public static void main(String[] args)  {
        //call scanner constuctor
        Scanner myScanner;
        myScanner= new Scanner (System.in); //create instance for scanner
        int courseNum;  //create variable
        int sem;    //create variable for semester
        int year;   //create variable for semester
        
        System.out.print("Enter a six digit number giving the course semester:" );  //prompt user to input number for course
        if (myScanner.hasNextInt()) {   //if inputed variable is an integer
            courseNum=myScanner.nextInt();  //set input value equal courseNum
                if (courseNum>=186510 && courseNum<=201440)  {   //inputs must be within this range
                    sem=courseNum%100;  //extract last two digits
                    year=courseNum/100; //divide by 100 and round to int, extract first 4 digits
                        if (sem==10)    {   //spring semester 
                            System.out.println("The course was offered in the Spring semester of "+year);    //print if semester is in spring
                            return;
                        }
                        if (sem==20)    {   //summer 1 semester
                            System.out.println("The course was offered in the Summer 1 semester of "+year); //print statement if summer 1 semester
                            return;
                        }
                        if (sem==30)    {   //summer 2 semester
                            System.out.println("The course was offered in the Summer 2 semester of "+year); //print statement if summer 2 semester (30)
                            return;
                        }
                        if (sem==40)    {   //fall semester
                            System.out.println("The course was offered in the Fall semester of "+year); //print statement if fall semester
                            return;
                        }
                        else {
                            System.out.println(sem+" is not a legitimate semester");    //print if last digits are not 10, 20, 30, or 40
                            return;
                        }
                }
                else {  //inputs outside of range
                System.out.println("The number inputed was outside the range [186510,201440]"); //print statement when error
                }
              return;  
        }
        else {
            System.out.println("You did not enter a valid number.");    //print if input is not a int
        return; //terminate program
        }
    }
}