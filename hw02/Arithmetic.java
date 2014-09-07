//Daniella Fodera
//September 6, 2014
//CSE 02
//Arithmetic Program
//  Determine cost of each item with and without sales tax (6%)
//  Determine cost of entire purchase
//  Determine total paid (with sales tax)
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic

//  define a class
public class Arithmetic {
    //main method required for every java program
    public static void main(String[] args) {
        //our input data
        int nSocks=3;   //number of pairs of socks
        double sockCost$=2.58;  //number of pairs of socks
        int nGlasses=6;  //number of pairs of socks
        double glassCost$=2.29; //cost per drinking glass
        int nEnvelopes=1;   //number of boxes of envelopes
        double envelopeCost$=3.25;   //cost per box of envelopes
        double taxPercent=0.06; //PA state tax
        //basic calculations
        double totalSockCost$=nSocks*sockCost$; //determine cost of socks before tax (bt)
        double salesTaxSocks$=totalSockCost$*taxPercent;    //determine just sales tax for socks
        double taxTotalSockCost$=totalSockCost$*taxPercent+totalSockCost$;    //determine cost of socks with tax
        double totalGlassesCost$=nGlasses*glassCost$;   //determine cost of glasses bt
        double salesTaxGlasses$=totalGlassesCost$*taxPercent;   //determine just sales tax for glasses
        double taxTotalGlassesCost$=totalGlassesCost$*taxPercent+totalGlassesCost$;   //determine cost of glasses with tax
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$; //determine cost of envelopes bt
        double salesTaxEnvelopes$=totalEnvelopeCost$*taxPercent;    //determine sales tax of just envelopes
        double taxTotalEnvelopeCost$=totalEnvelopeCost$*taxPercent+totalEnvelopeCost$; //determine cost of envelopes after tax
        
        System.out.println("At a rate of $2.58 per pair of socks, the total cost of 3 socks before tax is "+totalSockCost$+"."+
            " The sales tax collected from this item is "+salesTaxSocks$+
            " and the total cost of 3 socks after tax is "+taxTotalSockCost$);    //print costs of socks
        System.out.println("At a rate of $2.29 per drinking glass, the total cost of 6 drinking glasses before tax is "+
            totalGlassesCost$+"."+" The sales tax collected from this item is "+salesTaxGlasses$+ 
            " and the total cost of 6 glasses after tax is "+taxTotalGlassesCost$);  //print costs of drinking glasses
        System.out.println("At a rate of $3.25 per box of envelopes, the total cost of 1 box of envelopes before tax is "+
            totalEnvelopeCost$+"."+" The sales tax collected from this item is "+salesTaxEnvelopes$+
            " and the total cost of 1 box of envelopes after tax is "+
            taxTotalEnvelopeCost$); //print costs of envelopes
        
        double totalPurchaseCost$=totalSockCost$+totalGlassesCost$+totalEnvelopeCost$;  //determine cost of entire purchase before tax
        
        System.out.println("The total cost of the entire purchase without tax is "+totalPurchaseCost$); //print total cost bt
        
        double totalSalesTaxCost$=salesTaxEnvelopes$+salesTaxGlasses$+salesTaxSocks$;   //calculate total sales tax accrued
        
        System.out.println("The total sales tax collected from this purchase is "+totalSalesTaxCost$);  //print total sales tax cost
        
        double taxTotalPurchaseCost$=taxTotalEnvelopeCost$+taxTotalGlassesCost$+taxTotalSockCost$;  //calculate cost of entire purchase with tax
        //print the output data
        System.out.println("The total cost of the entire purchase with tax is "+taxTotalPurchaseCost$); 
    }
}