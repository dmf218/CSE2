////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//CSE02
//November 2, 2014
//Arrays Program
    //Create an array that can hold 10 ints
    //Ask the user enter 10 ints and store them in the array
    //Search the array for the highest entry and print it out
    //Search the array for the lowest entry and print it out
    //Sum the ints in the array and print out the sum
    //Copy the contents of the array into a second array in reverse order 
    //Print the contents of the two arrays in two columns, side by side. 
    
import java.util.Scanner;
public class Arrays {
    public static void main(String [] args) {
        Scanner scan;
        scan= new Scanner (System.in); //scanner instance
        final int numbers=10;   //make a variable for the size of the array
        int[] entry= new int[numbers];  //declare the array
        
        System.out.print("Enter 10 ints: ");    //prompt the user to enter 10 ints
        for(int i=0;i<10;i++)    {
            entry[i]=scan.nextInt();    //accpets all the inputs from user
        }
        
        
        /*System.out.println("Array elements are : ");
        for (int j=0;j<entry.length;j++)    {   //loop that print out all the values inputed
            System.out.println(entry[j]);
        }
        */
        int min=entry[0];
        int max=entry[0];
        int sum=0;
        for (int z=0; z<entry.length; z++)  {   //go through all elements in an array
            sum+=entry[z];
            
            if (entry[z] < min) {
                min=entry[z];
            }
            if (entry[z] >max)  {
                max=entry[z];
            }
        }
        System.out.println("The lowest entry is " +min); //print out the minimum value from array
        System.out.println("The highest entry is "+max);    //print max value
        System.out.println("The sum is "+sum);
        
        System.out.println("Array elements are : ");
        for (int j=0;j<entry.length;j++)    {   //loop that print out all the values inputed
            System.out.println(entry[j]+"\t"+entry[9-j]);
        }

        
        
    }   //end of main method
}   //end of class
