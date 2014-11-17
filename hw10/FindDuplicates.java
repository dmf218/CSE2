////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//CSE02
//November 11th, 2014
//Find Duplicates Program
    //hasDups() method 
            //should return true if and only if the input array has at least one repeated entry
    //exactlyOneDup()
            // returns true if and only if there is exactly one repeated entry 
            
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  } //end of main method

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int[] num)  {
      boolean duplicates=false;   //creat variable to return 
      for (int i=0; i<num.length; i++){ //loops through all the numbers in the array
          for (int z=0; z<num.length; z++){     //checks each to see if duplicate
            if (z!=i && num[z]==num[i]){    //if the array # is not the same but two numbers are still equal
              duplicates= true; //set variable equal to boolean true
              //return duplicates;
            }
          }
      }
      return duplicates;    //return value of duplicates
  } //end of hasDups method
  
  
 public static boolean exactlyOneDup(int[] num){
     boolean duplicates=false;   //creat variable to return
     int counter=0;
      for (int i=0; i<num.length; i++){ //loops through all the numbers in the array
          for (int z=0; z<num.length; z++){     //checks each to see if duplicate
            if (z!=i && num[z]==num[i]){    //if the array # is not the same but two numbers are still equal
              counter++;    //increment counter
              }
            }
          }
      if (counter==2){
        duplicates=true;
        }
      return duplicates;    //return value of duplicates
     
 }  //end of exactlyOneDup method
  
}   //end of class
