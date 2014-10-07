////////////////////////////////////////////////////////////////////////////////
//Daniella Fodera
//October 6th,2014
//CSE 02
//Enigma2 program
    //fix program to work in desired way
    
    import java.util.Scanner;
public class Enigma2{
  public static void main(String [] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
        break;
      case 13: out+=13;
        break;
      case 40: out+=40;
        break;
     
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * arg instead of args
 added breaks to cases
 error: dividing by 0
        Using the java.lang.ArithmeticException error that popped up when I tried to run the
        program indicated the error that dividing by 0 was illegal
 * 
 * 
 * 
 * 
 */
