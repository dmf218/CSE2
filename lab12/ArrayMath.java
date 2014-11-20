////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//CSE02
//November 12, 2014
//Array Arithmetic Program
    //equals() should take two arrays of integers as input and return true if and only if the two arrays are of the same length and have the same values in the same locations
    //method addArrays() should take two arrays of integers as input and return a new array of integers whose entries are the sum of the entries
/*  OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
                      

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double[] array1, double[] array2)    {
      if (array1.length==array2.length) {
          for (int i=0; i<array1.length; i++)   {
              if (array1[i] != array2[i])   {
                  return false;
              }
          }
          return true;
      }
      else  {
          return false;
      }
  }
  
  
  public static double[] addArrays(double[] array1, double[] array2){
      double [] sumArray= new double[array1.length];  //make new array
      if (array2.length<array1.length){
       double [] largerz= new double[array1.length]; //make new array to store values from z
                largerz[3]=0;   //set these element to 0
                largerz[4]=0;
                largerz[5]=0;
                
        for (int i=0; i<array2.length; i++)   {
          largerz[i]=array2[i];
        }
         for (int k=0; k<array1.length; k++)    {   //loop through all the elements in an array
            sumArray[k]=array1[k]+largerz[k]; //add the arrays
          }
          return sumArray;
      }
      else {
          for (int k=0; k<array1.length; k++)    {   //loop through all the elements in an array
            sumArray[k]=array1[k]+array2[k]; //add the arrays
          }
          return sumArray;
      }
      
  }
  
  
}   //end of class