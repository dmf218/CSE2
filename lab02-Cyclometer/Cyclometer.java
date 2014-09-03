//Daniella Fodera
//September 3, 2014
//CSE 02
//Cyclometer Program
//  measure the time elapsed in seconds and number of roatations of front wheel made
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//
//          print the number of minutes for each trip
//          print the number of counts for each trip
//          print the distance of each trip in miles
//          print the distance for the two trips combined

//  define a class
public class Cyclometer {
    //main method required for every java program
    public static void main(String[] args) {
        //our input data
        int secsTrip1=480;  //make variable for length of trip one in seconds
        int secsTrip2=3220; //make variable for length of trip two in seconds
        int countsTrip1=1561;   //state number of rotations per trip
        int countsTrip2=9037;   //state number of rotations per trip
        double wheelDiameter=27.0,  //create variable for wheel diameter
        PI=3.14159, //create variable for pi
        feetPerMile=5280,   //create variable for conversion unit of feet to mile
        inchesPerFoot=12,   //create variable for conversion unit of inches to foot
        secondsPerMinute=60;    //create variable for conversion unit of seconds to minutes
        double distanceTrip1, distanceTrip2,totalDistance; //create variables that can have an answer with decimal points
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts. ");  //print the given statement with the appropriate variables
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+"counts. ");  //print the given statement with the appropriate variables
        //run the calculations
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above give the distance in inches
        //(for each count, a rotation wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;   //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;   //Gives distance in miles
        totalDistance=distanceTrip1+distanceTrip2;  //Adds distances of each trip
        //print the output data
        System.out.println("Trip 1 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}

    
