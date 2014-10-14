////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//October 12, 2014
//CSE 02
//Roulette Program
        //utilize random number generator (math.random())
                //simulate betting on 100 spins
                //run the siulation 1000 times
        //play a game of roulette
//import Scanner 
import java.util.Scanner;

public class Roulette   {
    public static void main(String[] args)  {
        
        Scanner myScanner;  //establish scanner variable
        myScanner=new Scanner(System.in);   //scanner instance
        
        int spin;  //declare variable
        int roll;   //declare variable
        int n=0;  //counter for 100 while
        int k=0;  //2nd counter for 1000 while
        int z=0;    //counter for when random number equals selected (100 while)
        int losses=0; //count number of times you lose everything in 100 loop
        int profitCount=0; //count number of times you gain a profitCountCount
        int profit$=0;  //count total profit
        int totalLosses=0;  //count total losses
        
        System.out.print("Enter a number between 0 and 37 (00=37): ");  //prompt the user to enter a number
        if (myScanner.hasNextInt()) {
            int chosen=myScanner.nextInt(); //make user input equal to nStars
            if (chosen>=0 && chosen<=37)    {
                
                //go up til 37, make if statement
                //note: you want up to #36 but 00=37
                while (k<1000)   {
                    
                  
                    while (n<100)  {
                        
                        spin=(int)((Math.random()*37));  //randomize numbers between 0 and 37 (38 possible numbers)
                        
                        if (chosen==spin)   {
                            z=z+1;
                        }
                        n++;  //counter
                    }   //end of 100 while
                     profit$=(z*36); //count total profit
                         
                      if (profit$ > 100) {
                          profitCount++;
                      }
                        
                    else if (z==0)    {
                            losses=losses+1;    //count number of times you lose everything in 100 loop
                            totalLosses++;
                    }
                    z=0;
                    
                  k=k+1;  //add one to the counter
                }   //1000 while       
                    System.out.println("You lost everything "+totalLosses+" times.");    //print out number of complete losses
                    System.out.println("You made a profit "+profitCount+" times.");  //print out number of times you gain a profitCount
                    System.out.println("You made a total profit of $"+profitCount*36); //print total profit
            }
            else {
                System.out.println("You did not enter a value between 0 and 37.");  //error message when input is not between 0 and 37
            }
        }
        else    {
            System.out.println("You did not enter a appropriate input.");   //error message when int not entered
        }
    }   //end of main method
}   //end of class 
