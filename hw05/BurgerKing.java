//Daniella Fodera
//September 28,2014
//CSE 02
//Burger King Program
    //prompt user to enter order that they want 
            //choose between burger (B/b)
                    //choose all the fixins (A or a)
                    //choose cheese (C or c)
                    //choose none of the above (N or n)
            // or fries (F/f)
                //large (L/l)
                //small (S/s)
            //or soda (S/s)
                //pepsi (P or p)
                //coke (C or c)
                //sprite (S or s)
                //mountain dew (M or m)
    //print their order back for them
//import scanner
import java.util.Scanner;

public class BurgerKing {
    public static void main(String[] args)  {
        Scanner myScanner;  //create varaible for the scanner
        //call constructor
        myScanner= new Scanner(System.in);  //create instance
        
        System.out.print("Enter a letter to indicate the choice of \nBurger(B/b) \nfries(F/f) \nSoda(S/s): "); //prompt user to enter choice
        if (myScanner.hasNext())    {
            String order= myScanner.next(); //accept input and make it equal to order
            if (order.equals("A") || order.equals("a") || order.equals("R") || order.equals("r") || order.equals("K") || order.equals("k") || order.equals("D") || order.equals("d") || order.equals("E") || order.equals("e") || order.equals("C") || order.equals("c") || order.equals("G") || order.equals("g") || order.equals ("H")||  order.equals("h") || order.equals("I") || order.equals("i") || order.equals("J") || order.equals("j") || order.equals("L") || order.equals("l") || order.equals("M") || order.equals("m") || order.equals("N") || order.equals("n") || order.equals("O")  || order.equals("o") || order.equals("Q")  || order.equals("q") || order.equals("P") || order.equals("p") || order.equals("T") || order.equals("t") || order.equals("U") || order.equals("u")  || order.equals("V") || order.equals("v") || order.equals("W") || order.equals("w") || order.equals("x") || order.equals("X") || order.equals("Y") || order.equals("y")  || order.equals("Z") || order.equals("z"))    {
                System.out.println("'"+order+"' is not one of 'B', 'b', 'F', 'f', 'S', or 's'");    //print out error message when single character that is not the ones listed is entered
            }
            else if (order.equals("B") || order.equals("b"))    {   //when user wants a burger
            System.out.print("Enter A or a for 'all the fixins' \nC or c for cheese \nN or n for none of the above \n"); //prompt user to enter specific topping
                if (myScanner.hasNext())    {
                    String topping= myScanner.next();   //accept user input
                    switch (topping)    {
                        case "A":   //if they want all the fixins
                            System.out.println("You ordered a burger with 'all the fixins'");   //print statement
                            break;  //end
                        case "a":   //if they want all the fixins
                            System.out.println("You ordered a burger with 'all the fixins'");   //print statement
                            break;  //end
                        case "C":   //if they want cheese on their burger
                            System.out.println("You ordered a burger with cheese.");    //print staement
                            break;
                        case "c":   //also if they want cheese on their burger
                            System.out.println("You ordered a burger with cheese.");    //print staement
                            break;
                        case "n":   //if they do not want any toppings
                            System.out.println("You ordered a plain burger.");  //print statement
                            break;
                        case "N":   //also if they do not want any toppings on their burger
                            System.out.println("You ordered a plain burger.");  //print statement
                            break;
                        default:    //if entered input is not one of expected variables
                            System.out.println("You did not enter appropriate variable (C/c/N/n/A/a)!");    //print error staement if said variables not entered
                    }   
                }
            } 
            else if (order.equals("F") || order.equals("f"))    {
                System.out.print("Do you want an order of large or small fries (L/l/S/s)? ");   //prompt the user to enter if they want large or small fries
                if (myScanner.hasNext())    {
                    String size= myScanner.next();  //accept user input
                    switch (size)   {
                        case "L":   //large fries ordered
                            System.out.println("You ordered large fries."); //print their order of large fries
                            break;
                        case "l":   //another situation of large fries
                            System.out.println("You ordered large fries."); //print their order of large fries
                            break;
                        case "S":   //condition of small fries
                            System.out.println("You ordered small fries."); //print order of small fries as acknowledgement
                            break;
                        case "s":   //second condition of small fries
                            System.out.println("You ordered small fries."); //print order of small fries as acknowledgement
                            break;
                        default:    //if l/L/s/S is not inputed
                            System.out.println("You did not enter one of the appropriate variables (L/l/S/s)!");    //error statement
                            break;
                    }
                }
            }
            else if (order.equals("S") || order.equals("s"))    {
                System.out.print("Do you want Pepsi(P/p), Coke(C/c), Sprite(S/s), or Mountain Dew(M/m)? "); //prompt user to input particular soda that they desire
                if (myScanner.hasNext())    {
                    String soda= myScanner.next();  //accept user input
                    switch (soda)   {
                        case "P":   //user wants a pepsi
                            System.out.println("You ordered a Pepsi."); //print staement indicating soda choice
                            break;
                        case "p":   //user desires a pepsi
                            System.out.println("You ordered a Pepsi."); //print staement indicating soda choice
                            break;
                        case "C":   //user wants a coke
                            System.out.println("You ordered a Coke.");   //print statement when they want a coke
                            break;
                        case "c":   //user wants a coke
                            System.out.println("You ordered a Coke.");   //print statement when they want a coke
                            break;
                        case "S":   //if the user wants a sprite
                            System.out.println("You ordered a Sprite."); //print statement
                            break;
                        case "s":   //if the user wants a sprite
                            System.out.println("You ordered a Sprite.");    //print statement
                            break;
                        case "M":   //if the user wants a mountain dew
                            System.out.println("You ordered a Mountain Dew.");  //print statement if mountain dew is ordered
                            break;
                        case "m":   //if the user wants a mountain dew
                            System.out.println("You ordered a Mountain Dew.");  //print statement for alternate input 
                            break;
                        default:    //if one of the above variables are not inputed
                            System.out.println("You did not enter one of the the appropriate variables.");
                            break;
                    }
                }
            }
            else {
                System.out.println("You did not enter a single character.");    //print if single character is not entered
                return;
            }
        
        }
        
    }   //end of method
}   //end of class
            