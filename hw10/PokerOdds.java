////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//CSE02
//November 17, 2014
//Poker Odds Program
        //showOneHand() method
                //generate random poker hands, prompting the user if they would like another hand to be generated 
                //(it will repeat as long the user desires)
        //simulateOdds() method
                //randomly generate 10000 hands
                //count the number of times that a hand with a pair of a specific rank occurs
                //count number of hands that do not have a pair
                
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();    //call method
    simulateOdds(); //call method
  } //end of main method
  
  public static void showHands(){
        Scanner scan=new Scanner(System.in);    //declare scanner
        String answer="";
        int[] deck = new int[52]; //initialize a array named deck with a size of 52(# of cards)
        String[] suits={"Clubs", "Diamonds", "Hearts", "Spades"};  //create an array of strings to represent the set of cards
                //0-12 clubs, 13-25 Diamonds, 26-38 Hearts, 39-51 Spades
        String[] ranks={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};  //array of strings to represent the specific type of card
                //0=A (Ace), 1=K, 2=Q...12=2
        String clubs=" ";   //set string equal to clubs
        String diamonds=" ";    //create diamonds variable to store string
        String hearts=" ";  //create hearts variable to store string
        String spades=" "; //create spades variable to store string
        
        for (int i=0; i<deck.length; i++)   {   //assign the spots in deck array with sequential numbers
            deck[i]=i;  //set element equal to number in the loop
        }
      do{
        for (int j=0; j<deck.length; j++)   {   //this loop shuffles the cards
            //generate the index randomly
            int element= (int)(Math.random()*deck.length);  //generate random number between 0 and 52, not including 52 (which is ok)
                //represents the specific index of the array
            int temp= deck[j];  //creating temporary variable to store number for future use
            deck[j]=deck[element];  //set the original array equal to the same array but with different index
            deck[element]=temp;
            //effectively shuffle the deck
        }
        //display the first 5 cards with their respective suit and "number"
        for (int k=0; k<5; k++) {
            String suit= suits[deck[k]/13]; //determines the suit
                    //deck[k]/13   0=clubs, 1=diamonds, 2=hearts, 3=spades
                    //then represented by string equivalent from the first suits array
            String rank= ranks[deck[k]%13]; //determines specific type of card
                    //deck[k]%13 returns number between 0 and 12, which determines rank of card
                    //0=A, 1=K, and so on
            
                
                if (suit.equals("Clubs"))    {   //if it is generated to be a club
                    clubs+=(rank + " ");    ////add the character from the ranks array set equal to rank variable
                }
                else if (suit.equals("Diamonds"))   {   //if it is a diamond
                    diamonds+=(rank+ " "); //add the character from the ranks array set equal to rank variable
                }
                else if (suit.equals("Hearts"))   {   //if it is a heart
                    hearts+=(rank+ " ");
                }
                else if (suit.equals("Spades"))   {   //if it is a spade
                    spades+=(rank+ " ");
                }
        }
        System.out.println(suits[0] + ": "+ clubs); //print out clubs
        System.out.println(suits[1] + ": "+ diamonds);  //print out diamonds
        System.out.println(suits[2] + ": "+ hearts);    //print out hearts
        System.out.println(suits[3] + ": "+ spades);    //print out spades
        
        clubs=" ";   //set string equal to clubs
        diamonds=" ";    //create diamonds variable to store string
        hearts=" ";  //create hearts variable to store string
        spades=" "; //create spades variable to store string
        
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");    //ask user if they want to do it again
        answer=scan.next(); //accept user input
      }while(answer.equals("Y") || answer.equals("y"));
            
  } //end of show hands method
  
  public static void simulateOdds() {
                //note: from previous method
                //initializes card deck
        int[] deck = new int[52]; //initialize a array named deck with a size of 52(# of cards)
        String[] ranks={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};  //array of strings to represent the specific type of card
                //0=A (Ace), 1=K, 2=Q...12=2
        
        for (int i=0; i<deck.length; i++)   {   //assign the spots in deck array with sequential numbers
            deck[i]=i;  //set element equal to number in the loop
        }
        //shuffle deck
        for (int j=0; j<deck.length; j++)   {   //this loop shuffles the cards
            //generate the index randomly
            int element= (int)(Math.random()*deck.length);  //generate random number between 0 and 52, not including 52 (which is ok)
                //represents the specific index of the array
            int temp= deck[j];  //creating temporary variable to store number for future use
            deck[j]=deck[element];  //set the original array equal to the same array but with different index
            deck[element]=temp;
            //effectively shuffle the deck
        }
        int counter=0;  //initialize counter to 0
        int notPair=0;  //counter for those that are not pairs
        String samePairRank=" ";    //create variable to store the rank that is duplicated
        //create counters for each individual rank
        int aceCounter=0;
        int kingCounter=0;
        int queenCounter=0;
        int jackCounter=0;
        int tenCounter=0;
        int nineCounter=0;
        int eightCounter=0;
        int sevenCounter=0;
        int sixCounter=0;
        int fiveCounter=0;
        int fourCounter=0;
        int threeCounter=0;
        int twoCounter=0;
        
        for (int i=0; i<10000; i++)   {   //for loop that run the program 10000 times
            String [] hand= new String[5]; //create new array with 5 spaces for storage
            for (int k=0; k<hand.length; k++) {   //generates 5 cards
                String rank= ranks[deck[k]%13]; //determines specific type of card
                    //deck[k]%13 returns number between 0 and 12, which determines rank of card
                    //0=A, 1=K, and so on
                hand[k]=rank;   //assigns the string array hand at index k to rank variable generated
            }
            for (int j=0; j<hand.length; j++){ //loops through all the numbers in the array
                for (int z=0; z<5; z++){     //checks each to see if duplicate
                    if (z!=j && hand[z]==hand[j]){    //if the array # is not the same but two numbers are still equal
                    samePairRank=hand[z];   //set the string value equal to variable samePairRank
                    counter++;    //increment counter
                        //counts the duplicates
                    }
                }
            }
            if (counter==2) {   //if there is one set of duplicates
                if (samePairRank.equals("A"))   {   //if the thing saved is an ace
                    aceCounter++;   //increment ace counter
                }
                else if (samePairRank.equals("K"))  {   //if duplicates are kings
                    kingCounter++;
                }
                else if (samePairRank.equals("Q"))  {
                    queenCounter++;
                }
                else if (samePairRank.equals("J"))  {
                    jackCounter++;
                }
                else if (samePairRank.equals("10"))  {
                    tenCounter++;
                }
                else if (samePairRank.equals("9"))  {
                    nineCounter++;
                }
                else if (samePairRank.equals("8"))  {
                    eightCounter++;
                }
                else if (samePairRank.equals("7"))  {
                    sevenCounter++;
                }
                else if (samePairRank.equals("6"))  {
                    sixCounter++;
                }
                else if (samePairRank.equals("5"))  {
                    fiveCounter++;
                }
                else if (samePairRank.equals("4"))  {
                    fourCounter++;
                }
                else if (samePairRank.equals("3"))  {
                    threeCounter++;
                }
                else if (samePairRank.equals("2"))  {
                    twoCounter++;
                }
            }
            else    {
                notPair++;
            }
            samePairRank=" ";   //reset this variable
            counter=0;
      } //end of 10000 for loop
      
      //print statements detailing the results from the 10000 loop trial
      System.out.println("rank    freq of exactly one pair");
      System.out.println(" A                "+ aceCounter);
      System.out.println(" K                "+ kingCounter);
      System.out.println(" Q                "+ queenCounter);
      System.out.println(" J                "+ jackCounter);
      System.out.println(" 10               "+ tenCounter);
      System.out.println(" 9                "+ nineCounter);
      System.out.println(" 8                "+ eightCounter);
      System.out.println(" 7                "+ sevenCounter);
      System.out.println(" 6                "+ sixCounter);
      System.out.println(" 5                "+ fiveCounter);
      System.out.println(" 4                "+ fourCounter);
      System.out.println(" 3                "+ threeCounter);
      System.out.println(" 2                "+ twoCounter);
      System.out.println("---------------------------------");
      System.out.println("Total not exactly one pair: "+ notPair);
      
      
  } //end of simulateOdds method


}   //end of class

        