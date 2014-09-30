//Daniella Fodera
//September 29,2014
//CSE02
//BoolaBoola Program
    //three boolean variables to each of which the value of true or false is randomly assigned
    //then, at random, combine the three variables with random choices
        //choices: && and ||
        //stores the result
    //present expression to the user
    //ask the user to state if the expression is true or false
    //print correct if guess is correct; print Wrong:Try again if guess is incorrect

//import scanner
import java.util.Scanner;   

//create class 
public class BoolaBoola {
    //create main method
    public static void main(String[] args)  {
        
        Scanner myScanner;  //declare scanner variable
        myScanner= new Scanner(System.in);  //instance of scanner
        
        String result;  //user input of guess; declaring variable
        
        boolean var1=Math.random()<0.5;   //declare variable and randomly assign "true" or "false"
        boolean var2=Math.random()<0.5;   //declare variable and randomly assign true or false
        boolean var3=Math.random()<0.5;   //declare variable and randomly assign true or false
        
        int andOrVar1= (int)((Math.random()*2)+1);   //generate random int between 1 and 2
            //note: 1=&&, 2=||
            //considers combinations of && and ||
        int andOrVar2= (int)((Math.random()*2)+1);   //generate random int between 1 and 2
        
        if (andOrVar1==1 && andOrVar2==1)   {   //if && && statement is generated
            boolean value1= (var1 && var2 && var3);  //true/false values 
            
            System.out.print("Does "+var1+" && "+var2+" && "+var3+" have the value true(T/t) or false(F/f)?");  //prompt the user to input their guess of true or false
            if (myScanner.hasNext())   
         {
                result=myScanner.next();    //accept user input
             /*   if ( !(result.equals("T")) || !result.equals("t") || !result.equals("f") || !result.equals("F")) {
                    System.out.println("Wrong. Try Again."); //print if anything else is entered
                    return;  //terminate program
                } */
                
                if (value1==true)  {    //if the result of the value1 staement is determined to be true
                    switch (result) {
                        case "T":   //when statement is true and user in put is true-overall correct
                            System.out.println("Correct."); //print affirmation of correct answer
                            break;
                        case "t":   //same as T condition
                            System.out.println("Correct."); //print when correct
                            break;
                        case "F":   //user input is wrong because they guessed false when the statement was true
                            System.out.println("Wrong. Try Again.");    //print when guessed wrong
                            break;
                        case "f":   //same as F
                            System.out.println("Wrong. Try again.");    //print when guessed wrong
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                    return;
                }
                else if (value1==false)  {   //if the result of the value1 statement is determined to be false
                    switch (result) {
                        case "T":   //this guess is actually incorrect since statement is false
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "t":   //same conditions as T
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "F":   //this guess matches result of statement
                            System.out.println("Correct."); //print if correct
                            break;
                        case "f":   //same conditons as F
                            System.out.println("Correct."); //print if correct
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                return;
                }
                   
        
        }
            
        }   //end of first &&/|| possibility
        
        else if (andOrVar1==1 && andOrVar2==2)  {   //&& then ||
            boolean value2=(var1 && var2 || var3);  //second combination of && and ||
            
            System.out.print("Does "+var1+" && "+var2+" || "+var3+" have the value true(T/t) or false(F/f)?");  //prompt the user to input their guess of true or false
           if (myScanner.hasNext())   {
                result=myScanner.next();    //accept user input
             /*   if ( !(result.equals("T")) || !result.equals("t") || !result.equals("f") || !result.equals("F")) {
                    System.out.println("Wrong. Try Again."); //print if anything else is entered
                    return;  //terminate program
                } */
                
                if (value2==true)  {    //if the result of the value1 staement is determined to be true
                    switch (result) {
                        case "T":   //when statement is true and user in put is true-overall correct
                            System.out.println("Correct."); //print affirmation of correct answer
                            break;
                        case "t":   //same as T condition
                            System.out.println("Correct."); //print when correct
                            break;
                        case "F":   //user input is wrong because they guessed false when the statement was true
                            System.out.println("Wrong. Try Again.");    //print when guessed wrong
                            break;
                        case "f":   //same as F
                            System.out.println("Wrong. Try again.");    //print when guessed wrong
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                    return;
                }
                else if (value2==false)  {   //if the result of the value1 statement is determined to be false
                    switch (result) {
                        case "T":   //this guess is actually incorrect since statement is false
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "t":   //same conditions as T
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "F":   //this guess matches result of statement
                            System.out.println("Correct."); //print if correct
                            break;
                        case "f":   //same conditons as F
                            System.out.println("Correct."); //print if correct
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                return;
                }
            return;
            }
                
        }
        
        else if (andOrVar1==2 && andOrVar2==1)   {   //when || then &&
            boolean value3=(var1 || var2 && var3);  //third combination of &&s and ||s
            
            System.out.print("Does "+var1+" || "+var2+" && "+var3+" have the value true(T/t) or false(F/f)?");  //prompt the user to input their guess of true or false
            if (myScanner.hasNext())    {
                result=myScanner.next();    //accept user input
               /* if ( !(result.equals("T")) || !result.equals("t") || !result.equals("f") || !result.equals("F")) {
                    System.out.println("Wrong. Try Again."); //print if anything else is entered
                    return;  //terminate program
                } */
                 if (value3==true)  {    //if the result of the value1 staement is determined to be true
                    switch (result) {
                        case "T":   //when statement is true and user in put is true-overall correct
                            System.out.println("Correct."); //print affirmation of correct answer
                            break;
                        case "t":   //same as T condition
                            System.out.println("Correct."); //print when correct
                            break;
                        case "F":   //user input is wrong because they guessed false when the statement was true
                            System.out.println("Wrong. Try Again.");    //print when guessed wrong
                            break;
                        case "f":   //same as F
                            System.out.println("Wrong. Try again.");    //print when guessed wrong
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                    return;
                }
                else if (value3==false)  {   //if the result of the value1 statement is determined to be false
                    switch (result) {
                        case "T":   //this guess is actually incorrect since statement is false
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "t":   //same conditions as T
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "F":   //this guess matches result of statement
                            System.out.println("Correct."); //print if correct
                            break;
                        case "f":   //same conditons as F
                            System.out.println("Correct."); //print if correct
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                return;
                }
                   
            return;
            }
            
        }
        
        else if (andOrVar1==2 && andOrVar2==2)    {   //the conition in which || and ||
            boolean value4=(var1 || var2 || var3);  //fourth combination of && and ||
            
            System.out.print("Does "+var1+" || "+var2+" || "+var3+" have the value true(T/t) or false(F/f)?");  //prompt the user to input their guess of true or false
            if (myScanner.hasNext())    {
                result=myScanner.next();    //accept user input
               /* if ( !(result.equals("T")) || !result.equals("t") || !result.equals("f") || !result.equals("F")) {
                    System.out.println("Wrong. Try Again."); //print if anything else is entered
                    return;  //terminate program
                }*/
                
                
                if (value4==true)  {    //if the result of the value1 staement is determined to be true
                    switch (result) {
                        case "T":   //when statement is true and user in put is true-overall correct
                            System.out.println("Correct."); //print affirmation of correct answer
                            break;
                        case "t":   //same as T condition
                            System.out.println("Correct."); //print when correct
                            break;
                        case "F":   //user input is wrong because they guessed false when the statement was true
                            System.out.println("Wrong. Try Again.");    //print when guessed wrong
                            break;
                        case "f":   //same as F
                            System.out.println("Wrong. Try again.");    //print when guessed wrong
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                    return;
                }
                else if (value4==false)  {   //if the result of the value1 statement is determined to be false
                    switch (result) {
                        case "T":   //this guess is actually incorrect since statement is false
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "t":   //same conditions as T
                            System.out.println("Wrong. Try Again.");    //print statement if guessed incorrectly
                            break;
                        case "F":   //this guess matches result of statement
                            System.out.println("Correct."); //print if correct
                            break;
                        case "f":   //same conditons as F
                            System.out.println("Correct."); //print if correct
                            break;
                        default:    //anything else
                            System.out.println("Wrong. Try again.");
                            break;
                    }
                return;
                }
            return;
            }
        } 
        
        
    }   //end of main method
}   //end of class