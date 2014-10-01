////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//October 1, 2014
//CSE02
//Enigma0 program
    //fix any errors whatsoever
    
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
      
    int n;  //declare variable
    
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    int sum=k+p+q+r;  //calculate sum
    
    System.out.println("The sum is "+sum);  //print sum
    System.out.println("To repeat, you entered "+n);    //print again
    }
  }


/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */

//there was an extra curly bracket
//intialized n in the beginning rather than it being nested
        //effects initilization when there are outside statements
//removed the switch statement at the end so that it would work for other inputs other than 9
    //replaced with two print statements
//n was declared twice (again in line 32)
    //removed it
//created the variable sum to calculate the sum
