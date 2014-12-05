////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//December 3rd, 2014
//CSE02
//Poker Hands Program
        //prompt the user to enter 5 card hand (suit & rank)
        //print out hand
        //prints out type of hand (i.e. straight/ full house/ etc)
//import scanner and arrays 
import java.util.Scanner;
import java.util.Arrays;

public class PokerHands{
    public static void main (String[] args) {
        Scanner scan= new Scanner (System.in); //scanner instance
        int[] suit=new int [5]; //create array that is length 5 to store the suits
        int[] rank= new int [5];    //create an array that is length 5 to store ranks
        String answer=" ";  //varible stores y  or Y to run do while loop again
        String suitAnswer=" ";  //stores suits user inputs
        String rankAnswer=" ";  //stores rank user inputs
        int suitInt=0;  //initialize variable
        int rankInt=0;  //initialize to 0
        int i=0;    //initalize counter
//do while loop controls entire program basically
        do{
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand-");  //prompt user to enter 
            answer=scan.next(); //accept input
                if (!(answer.equals("Y") || answer.equals("y"))){   //if not equal to acceptable value
                    break;  //get out of do while loop
                }
        for (int x=0; x<5; x++) {   //places user inputs in arrays
            
            controlLoop: for (int l=0; l<1; l++) {
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");    //prompt user for suit
            suitAnswer=scan.next(); //accept input
            while (!(suitAnswer.equals("c") || suitAnswer.equals("d")  || suitAnswer.equals("h") || suitAnswer.equals("s"))){   
                //if not one of above characters
                System.out.println("You did not enter an appropriate response.");   //error message
                 System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");   //prompt for dditional input
                 suitAnswer=scan.next();    //accept next input
            }
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': ");    //prompt user for rank
            rankAnswer=scan.next(); //accept user input for rank
            while (!(rankAnswer.equals("a") || rankAnswer.equals("k") || rankAnswer.equals("q") || rankAnswer.equals("j") || rankAnswer.equals("10") || rankAnswer.equals("9") || rankAnswer.equals("8") || rankAnswer.equals("7") || rankAnswer.equals("8") || rankAnswer.equals("7") || rankAnswer.equals("6") || rankAnswer.equals("5") || rankAnswer.equals("4") || rankAnswer.equals("3") || rankAnswer.equals("2"))){
                System.out.println("You did not enter an appropriate response.");   //error message
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': ");    //prompt user to enter another rank
                rankAnswer=scan.next(); //accept new user input
            }
        //convert the suit to an appropriate corresponding number
           switch (suitAnswer)  {
               case "c": 
                   //clubs corresponds to 1
                   suitInt=1;
                   break;
               case "d":
                   //diamonds
                   suitInt=2;
                   break;
                case "h":
                    //hearts
                    suitInt=3;
                    break;
                case "s":
                    //spades
                    suitInt=4;
                    break;
           }
           
           //make the string equal a corresponding int value
           //useful when printing out type for the user
           switch (rankAnswer)  {
               case "a":
                   rankInt=14;
                   break;
                case "2":
                    rankInt=2;
                    break;
                case "3":
                    rankInt=3;
                   break;
                case "4":
                    rankInt=4;
                   break;
                case "5":
                    rankInt=5;
                   break;
                 case "6":
                    rankInt=6;
                   break;
                 case "7":
                    rankInt=7;
                   break;
                 case "8":
                     rankInt=8;
                   break;
                 case "9":
                     rankInt=9;
                     break;
                case "10":
                    rankInt=10;
                   break;
                case "j":
                    rankInt=11;
                   break;
                case "q":
                    rankInt=12;
                    break;
                case "k":
                    rankInt=13;
                   break;
           }
           
           
           suit[x]=suitInt; //store suit value from user in appropriate array space
           rank[x]=rankInt; //store rank value from user
           for (int p=4; p>=0; p--) {
               i=x; //set equal
               if (suit[p]!= 0) {   //when not equal to 0
                   if ((suit[i] ==suit[p]) && (rank[i]==rank[p] ) && i!=p)  {
                       System.out.println("Already entered. Try again.");   //error message
                       suit[x]=0;   //reset element value
                       rank[x]=0;   //reset element value
                       x--; //so the loop is not repeated
                       break controlLoop;   //break to this particular loop
                   }
               }
           } 
        }
        }
        
            showOneHand(suit, rank);    //call showOneHand method that prints out the correpsponding suit with rank
            System.out.println("This is a "+Hand(suit, rank));  //reports to the user the type of poker hand
        }while(answer.equals("Y") || answer.equals("y"));
            
        

    }   //end of main method
    
    public static String Hand(int suit[], int rank[])   {
        boolean booFlush=false;   //variable for flush
        boolean booStraightFlush=false; //varible for straight flush
        boolean booRoyalFlush=false;    //boolean variable for royal flush
        boolean booStraight=false;  //boolean variable
        boolean booFourKind=false;  //boolean variable
        boolean booFullHouse=false;     //boolean variable
        boolean booTwoPair=false;   //boolean variable
        boolean booOnePair=false;   //boolean variable
        
        booFlush=Flush(suit);    //call the method Flush to determine if flush
        if (booFlush==true) {
            booStraightFlush=straightFlush(rank);   //call the method straight flush to see if sequential
            if (booStraightFlush==true) {   //if it is a straight then test if is a royal
                booRoyalFlush=royalFlush(rank);
                if (booRoyalFlush==true )   {
                    return "Royal Flush";   //return to main method
                }
                else{   //if not a royal flush but still a straight flush
                    return "Straight Flush";    //return to main method
                }
            }
            else {
                return "Flush"; //return to the main method
            }
        }
        else {  //when it is not a flush
            booFourKind=FourKind(rank); //call method FourKind
            if (booFourKind==true)  {
                return "Four of a Kind";    //return to main method
            }
            else    {
                booFullHouse=FullHouse(rank);   //call the method fullhouse
                if (booFullHouse==true) {   //if it is a full house
                    return "Full House";    //return to main method
                }
                else{
                    booStraight=Straight(rank); //call method straight
                    if (booStraight==true)  {
                        return "Straight";  //return the string to the main method
                    }
                    else {
                        booTwoPair=TwoPair(rank);   //call the method twopair
                        if (booTwoPair==true)   {   //if a true is returned
                            return "Two Pair";  //return this string to main method
                        }
                        else {
                            booOnePair=OnePair(rank);   //call this additional method
                            if (booOnePair==true)   {   //if true
                                return "One Pair";  //return this string to the main method
                            }
                            else {
                                return "High Card!";    //last thing that can be returned to the main method
                            }
                        }
                    }
                }
            }
        }
    }   //end of hand method
    
    public static boolean OnePair(int rank[])   {
        //check for one pair
        //sort the array 
        Arrays.sort(rank);
        for (int i=0; i<rank.length-1; i++)   {
            if (rank[i]==rank[i+1]) {   //if two elements next two each other are equal to each other
                return true;    //return to hand method
            }
        }
        return false;   //if there is no pair
    }
    
    public static boolean TwoPair(int rank[])   {
        //sort the array
        Arrays.sort(rank);
        int first=rank[0];//MAKE VARIABLE FOR SEcond element in the array
        int second=rank[1]; //make varible for first element in the array
        int third=rank[2];  //make variable for the 3rd element
        int fourth=rank[3]; //make variable for 4th element
        int fifth=rank[4];  //make varibale for 5th element
        
        if (first==second && third==fourth) {
            return true;    //return to hand method
        }
        else if (second==third && fourth==fifth)    {
            return true;
        }
        else {
            return false;   //if neither is true
        }
    }
    
    public static boolean FullHouse(int rank[]){
        //sort the array
        Arrays.sort(rank);
        int first=rank[0];//MAKE VARIABLE FOR SEcond element in the array
        int second=rank[1]; //make varible for first element in the array
        int third=rank[2];  //make variable for the 3rd element
        int fourth=rank[3];
        int fifth=rank[4];
        //this set of if else statements checks to see if it is a full house by comparing the individual elements
        if (first==second)  {   //this should be true if a full house whether pair or triple
            if (second==third && fourth==fifth)  {   //if triple is first
                return true;
            }
            else if (third==fourth && third==fifth) {   //if the pair is the first in ordered array
                return true;
            }
            else {
                return false;   
            }
        }
        else {
            return false;   //if they do not match
        }
        
    }   //end of full house
    
    
    public static boolean FourKind(int rank[])  {
        //sort the array ascending
        Arrays.sort(rank);
        int first=rank[0];  //set variable equal to the first element
        int second=rank[1]; //set varibale equal to the second element
        for (int i=1; i<rank.length-1; i++)   {
            //test values less than the size so get good reading
            if (rank[i]==first) {
                continue;   //continue through the loop
            }
            else{
                for (int j=2; j<rank.length; j++)   { 
                    //check end part of data
                    if (!(rank[j]==second))    {
                        return false;
                    }
                }
                return true;    //return to hand method
            }
        }
        return false;   //return to hand method
    }
    
    public static boolean Straight(int rank[])  {
        //sort the array
        Arrays.sort(rank);  
        int first=rank[0];  //make variable equal to first element
        for (int k=1; k<rank.length; k++)   {   //search the sorted array
            if (!(rank[k]>first && ((rank[k]-rank[k-1])==1)))   {
                //if the next number is greater than the previous and differs by one
                return false;
            }
        }
        return true;    //return a value of true
    }
    
    public static boolean royalFlush(int rank[])    {
        //sort the array
        Arrays.sort(rank);
        if (rank[0]==10 && rank[1]==11 && rank[2]==12 && rank[3]==13 && rank[4]==14)    {
            //of it is an ace, queen, king, jack and 10
            return true;    //return true value
        }
        else{   //if not a royal flush
            return false;
        }
    }
    
    public static boolean straightFlush(int rank[]) {
        //sort the array in sequential order
        Arrays.sort(rank);  
        int first=rank[0];  //make variable equal to first element
        for (int k=1; k<rank.length; k++)   {   //search the sorted array
            if (!(rank[k]>first && ((rank[k]-rank[k-1])==1)))   {
                //if the next number is greater than the previous and differs by one
                return false;
            }
        }
        return true;    //return a value of true
    }   //end of straightFlush method
    
    public static boolean Flush(int suit[]) {
        //flush is 5 cards of the same suit
        int number=suit[0];
        for (int i=1; i<suit.length; i++)   {   //search the array suit
            if (!(suit[i]==number)) {   //if number does not equal first value
                return false;  //return value of false
            }   
        }
        return true;    //return true if all 5 cards are the same
        
    }   //end of Flush method

    
    public static void showOneHand(int suit[], int rank[]){
    	String clubs=" ";   //make a string that stores clubs
    	String diamonds=" ";    //make a string that stores diamonds
    	String hearts=" ";  //make a string that stores hearts
    	String spades=" ";  //create a string that stores the spades
    	for (int i=0; i< suit.length; i++)  {   
    	    //go through the entire array and change the element to its string equivalent
    	    //the following if statements does the following depending on the suit
    	    if (suit[i]==1) {   //if it the suit is a club
    	        if (rank[i]==14) {  //changes an ace to the value 14
    	            clubs+="A ";    //add to the clubs string
    	        }
    	        else if (rank[i]==11)   {
    	            clubs+="J ";
    	        }
    	        else if (rank[i]==12)       {
    	            clubs+="Q ";
    	        }
    	        else if (rank[i]==13)   {
    	            clubs+="K ";
    	        }
    	        else {
    	            //add to the club string
    	            clubs+=Integer.toString(rank[i]);   //if not an ace, king, jack, or queen
    	        }
    	    }
    	    if (suit[i]==2) {
    	        //if the suit is a diamond
    	        if (rank[i]==14) {
    	            diamonds+="A "; //add to the diamond string
    	        }
    	        else if (rank[i]==11)   {
    	            diamonds+="J ";
    	        }
    	        else if (rank[i]==12)       {
    	            diamonds+="Q ";
    	        }
    	        else if (rank[i]==13)   {
    	            diamonds+="K ";
    	        }
    	        else {
    	            diamonds+=Integer.toString(rank[i]);    //if not an ace, king, jack, or queen
    	        }
    	    }
    	    if (suit[i]==3) {
    	        //if the suit is a heart
    	        if (rank[i]==14) {
    	            hearts+="A ";   //add to the hearts string
    	        }
    	        else if (rank[i]==11)   {
    	            hearts+="J ";
    	        }
    	        else if (rank[i]==12)       {
    	            hearts+="Q ";
    	        }
    	        else if (rank[i]==13)   {
    	            hearts+="K ";
    	        }
    	        else {
    	            hearts+=Integer.toString(rank[i]);  //if not an ace, king, jack, or queen
    	        }
    	    }
    	    if (suit[i]==4) {  
    	        //if the suit is a spade
    	        if (rank[i]==14) {
    	            spades+="A ";   //add to the spades string
    	        }
    	        else if (rank[i]==11)   {
    	            spades+="J ";
    	        }
    	        else if (rank[i]==12)       {
    	            spades+="Q ";
    	        }
    	        else if (rank[i]==13)   {
    	            spades+="K ";
    	        }
    	        else {
    	            spades+=Integer.toString(rank[i]);  //if not an ace, king, jack, or queen
    	        }
    	    }
    	}
    	//the following prints out the collected ranks with their according suit
    	System.out.println("Clubs: "+ clubs);
    	System.out.println("Diamonds: "+ diamonds);
    	System.out.println("Hearts: "+hearts);
    	System.out.println("Spades: "+spades);
    	
      } //end of showOneHand method


}   //end of class