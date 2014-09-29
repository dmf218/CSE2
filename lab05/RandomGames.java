//Daniella Fodera
//September 24,2014
//CSE02
//Random Games Program
            //  utilize Math.random()
            //utilize switch statements
        //prompt user to choose a game of roulette, craps, or picking a card froma deck of playing cards
                //if string is not length 1, return error statement
                //if not allowed input characters, return an error staement
            //if they choose roulette, print the results of a play
                //one of the numbers 0,00,1,2,...,36
            //if they choose craps, 

//import scanner
import java.util.Scanner;
//create class
public class RandomGames    {
    //add main method
    public static void main(String[] args)   {
        //call scanner constructor 
        Scanner myScanner;
        myScanner=new Scanner(System.in);   //create instance of scanner
        int roll1;  //declare variable
        int roll2;  //declare variable
        int roll;   //declare variable
        int spin;   //declare variable
        int randSuit;   //declare variable
        int cards;   //declare variable
       
        System.out.print("Enter R or r for Roulette, C or c for craps, and P or p for playing cards: ");  //prompt the user to input game desired
        if (myScanner.hasNext())    {
            String games=myScanner.next();
            if (games.equals("A") || games.equals("a") || games.equals("B") || games.equals("b") || games.equals("K") || games.equals("k") || games.equals("D") || games.equals("d") || games.equals("E") || games.equals("e") || games.equals("F") || games.equals("f") || games.equals("G") || games.equals("g") || games.equals ("H")||  games.equals("h") || games.equals("I") || games.equals("i") || games.equals("J") || games.equals("j") || games.equals("L") || games.equals("l") || games.equals("M") || games.equals("m") || games.equals("N") || games.equals("n") || games.equals("O")  || games.equals("o") || games.equals("Q")  || games.equals("q") || games.equals("S") || games.equals("s") || games.equals("T") || games.equals("t") || games.equals("U") || games.equals("u")  || games.equals("V") || games.equals("v") || games.equals("W") || games.equals("w") || games.equals("x") || games.equals("X") || games.equals("Y") || games.equals("y")  || games.equals("Z") || games.equals("z"))    {
                System.out.println("'"+games+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
            }
            else if (games.equals("R") || games.equals("r"))  {
                 //go up til 37, make if statement
                //note: you want up to #36 but 00=37
                spin=(int)((Math.random()*37));  //randomize numbers between 0 and 37
                        if (spin==37)   {
                            System.out.println("Roulette: 00"); //print this only if it should be 00
                            return; //terminate program
                        }
                        else    {
                            System.out.println("Roulette: "+spin);  //print the result of the spin
                            return;
                        }
            }
            else if (games.equals("C") || games.equals("c")) {
                    //game play for craps
                    //roll die twice, display and add results
                    //want to randomize 6 numbers not including 0
                    roll1=(int)(Math.random()*6+1); //randomize numbers between 1 and 6
                    roll2=(int)(Math.random()*6+1); //do again
                    roll=roll1+roll2;   //calculate addition of the two random rolls
                    System.out.println(roll1+" + "+roll2+" = "+roll);   //print two rolls and addition
                    return;
            }
            else if (games.equals("P") || games.equals("p")) {  
                //game play for playing cards
                //print out random card and its suit
                 cards=(int)(Math.random()*13+1);    //randomize numbers from 1 to 13
                        switch (cards)  {
                            case 1: //1=ace
                                System.out.print("Ace of "); //print out result of randomized suits and randomized card
                                break;
                            case 11: //11=jack
                                System.out.print("Jack of ");    //print out result
                                break;
                            case 12:    //12=queen
                                System.out.print("Queen of ");   //print out result
                                break;
                            case 13:    //13=king
                                System.out.print("King of ");
                                break;
                            default:
                                System.out.print(cards+" of "); //print when not a special case
                                break;
                        }
                           randSuit=(int)(Math.random()*4+1);    //randomize numbers from 1 to 4
                        switch (randSuit)  {
                            case 1: //1=hearts
                                System.out.print("Hearts");
                                break;
                            case 2: //2=spades
                                //suit="spades";
                                System.out.print("Spades");
                                break;
                            case 3: //3=diamonds
                                System.out.print("Diamonds");
                                break;
                            case 4: //4=clubs
                                System.out.print("Clubs");
                                break;
                        }
            return;
        }
        else {
            System.out.println("Error. You did not enter single character.");   //print statement
            return;
        }
       
        
        
    }   //end of main method
  }
 }//end of class