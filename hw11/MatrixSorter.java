////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//CSE02
//December 4th, 2014
//Matrix Sorter Program
    //return a ragged 3D array, where the 
        //first slab has three rows, the second slab five rows, and the third slab seven rows
    //matrix should be initialized with random numbers from 1 to 99 inclusive
    //show should print out all array elements
import java.util.Arrays;
public class MatrixSorter{

  public static void main(String arg[]){
    int mat3d[][][];    //initaialize 3d matrix
    mat3d=buildMat3d(); //call method and set equal to mat3d to build the array
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);

   }    //end of main method
   
   public static int[][][] buildMat3d ()    {
       int [][][] matrix= new int[3][7][9];    //declare and allocate array containign five arrays
       for (int i=0; i<matrix.length; i++)  {
           for (int j=0; j<i*2+3; j++ ){
             for (int k=0; k<i+j+1; k++)  {
             matrix[i][j][k] = (int)(Math.random()*99+1);  //fill with random numbers from 0 to 99
       
             }
           }
        }
        return matrix;
     
   }
   
   //method used to print out the elements in the array
   public static void show(int [][][] matrix)   {
       for(int i=0; i<3; i++)  { 
           System.out.println("---------------------------Slab "+ (i+1));   //will change to 1, 2, and 3
            for(int j=0; j<i*2+3; j++)  {   //loop through that array length
                for (int k=0; k<i+j+1; k++)   { //loop through that array length
                System.out.print(matrix[i][j][k]+"  "); //print out individual elements
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("---------------------------");
   }
   
   //method that finds the min value
   public static int findMin(int [][][] matrix) {
       int min=matrix[0][0][0];  //set min as the first value
       for (int i=0; i<3; i++)  {   //go through all elements in an array
            for (int j=0; j<i*2+3; j++ )    {
                for (int k=0; k<i+j+1; k++) {
                    if (matrix[i][j][k] < min) { //compare to the min variable
                        min=matrix[i][j][k]; //replace if it is smaller
                    }
                }
            }
       }
       return min;
   }    //end of findMin method
   
   
    //first method to sort the members of the array
   //from main method
   //public static void sort (int[][] array)  {
       
       
   //}
  
   //sorting arrays
    public static void sort(int[][] list) {
        for (int i=0; i<list.length-1; i++) {
            for (int b=0; b<list[i].length-1; b++)  {
            //find the minimum in the list [i... list.length-1]
            int currentMin= list[i][b];
            int currentMinIndex=i;
            
            for (int j=i+1; j<list.length; j++) {
                if (currentMin>list[i][j]) {
                    currentMin=list[i][j];
                    currentMinIndex=j;
                }
            }
            
            //swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != b)   {
                list[currentMinIndex]=list[i];
                list[i][b]= currentMin;
            }
        }
        }
    }
    
   
   
   
}   //end of class
    