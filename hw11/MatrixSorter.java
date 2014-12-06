////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//CSE02
//December 4th, 2014
//Matrix Sorter Program
    //return a ragged 3D array, where the 
        //first slab has three rows, the second slab five rows, and the third slab seven rows
    //matrix should be initialized with random numbers from 1 to 99 inclusive
    //show should print out all array elements

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
       int [][][] matrix= new int[3][0][0];    //declare and allocate array containign five arrays
       
       for (int i=0; i<matrix.length; i++)  {
           matrix[i]=new int [i*2+3][];
           for (int j=0; j<i*2+3; j++ ){
               matrix[i][j]=new int [i+j+1];
             for (int k=0; k<i+j+1; k++)  {
             matrix[i][j][k] = (int)(Math.random()*99+1);  //fill with random numbers from 0 to 99
       
             }
           }
        }
        return matrix;  //retrun to the main method
     
   }
   
   //method used to print out the elements in the array
   public static void show(int [][][] matrix)   {
       for(int i=0; i<3; i++)  { 
           System.out.println("---------------------------Slab "+ (i+1));   //will change to 1, 2, and 3
            for(int j=0; j<matrix[i].length; j++)  {   //loop through that array length
                for (int k=0; k<matrix[i][j].length; k++)   { //loop through that array length
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
       return min;  //etrun this value
   }    //end of findMin method
   
   //sorting arrays
    public static void sort(int[][] list) {
     //loop through all the elements in array   
     //this part sorts the rows
     //loops through entire array 'list'
        for (int i=0; i<3; i++)  {
               for (int j=0; j<i*2+3; j++ ){
                 for (int k=0; k<i+j+1; k++)  {
                     for(int z=k+1; z<i+j+1; z++) {   //to check the next element as well
                        if (list[j][z]<list[j][k]) {    
                            int temp= list[j][k];   //create temporary variable that stores element value
                            list[j][k]=list[j][z];  //switch values
                            list[j][z]=temp;    //set that thing to temp again so the value is correctly stored
                         }
                     }
                 }
               }
        }
        //the following sorts the matrix by columns
       for (int q=1; q<list.length; q++)   {
             int [] temp=list[q];   //create temp array value
             int x=list[q][0];  //iniialize variable
             int row=q; //initialize varibale
             while(row>0 && list[row-1][0]>x)   {
                list[row]=list[row-1];  //reset element value
                row--;  //counter that controls the while loop
            }
            list[row]=temp; //replace value
        }
    }   //end of sort array
    
   
   
   
}   //end of class
    