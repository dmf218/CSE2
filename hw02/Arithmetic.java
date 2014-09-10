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
        double totalSockCost$=((nSocks*sockCost$)*100)/100; //determine cost of socks before tax (bt)
        double salesTaxSocks$=(totalSockCost$*taxPercent*100)/100.0;    //determine just sales tax for socks
        double roundOffSocksTax = Math.round(salesTaxSocks$*100)/100.00;    //round decimals
        double taxTotalSockCost$=((totalSockCost$*taxPercent+totalSockCost$)*100)/100.0;    //determine cost of socks with tax
        double roundOffTotalSocksTax = Math.round(taxTotalSockCost$*100)/100.00;
        double totalGlassesCost$=((nGlasses*glassCost$)*100)/100;   //determine cost of glasses bt
        double salesTaxGlasses$=((totalGlassesCost$*taxPercent)*100)/100.0;   //determine just sales tax for glasses
        double roundOffSalesTaxGlasses = Math.round(salesTaxGlasses$*100)/100.00;
        double taxTotalGlassesCost$=(salesTaxGlasses$+totalGlassesCost$);   //determine cost of glasses with tax
        double roundOffTaxTotalGlasses = Math.round(taxTotalGlassesCost$*100)/100.00;
        double totalEnvelopeCost$=((nEnvelopes*envelopeCost$)*100)/100; //determine cost of envelopes bt
        double salesTaxEnvelopes$=((totalEnvelopeCost$*taxPercent)*100)/100.0;    //determine sales tax of just envelopes
        double roundOffSalesTaxEnvelopes = Math.round(salesTaxEnvelopes$*100)/100.00;   //round decimals
        double taxTotalEnvelopeCost$=((totalEnvelopeCost$*taxPercent+totalEnvelopeCost$)*100)/100.0; //determine cost of envelopes after tax
        double roundOffTaxTotalEnvelope = Math.round(taxTotalEnvelopeCost$*100)/100.00;
        
        System.out.println("At a rate of $2.58 per pair of socks, the total cost of 3 socks before tax is $"+totalSockCost$+"."+
            " The sales tax collected from this item is $"+roundOffSocksTax+
            " and the total cost of 3 socks after tax is $"+roundOffTotalSocksTax);    //print costs of socks
        System.out.println("At a rate of $2.29 per drinking glass, the total cost of 6 drinking glasses before tax is $"+
            totalGlassesCost$+"."+" The sales tax collected from this item is $"+roundOffSalesTaxGlasses+ 
            " and the total cost of 6 glasses after tax is $"+roundOffTaxTotalGlasses);  //print costs of drinking glasses
        System.out.println("At a rate of $3.25 per box of envelopes, the total cost of 1 box of envelopes before tax is $"+
            totalEnvelopeCost$+"."+" The sales tax collected from this item is $"+roundOffSalesTaxEnvelopes+
            " and the total cost of 1 box of envelopes after tax is $"+
            roundOffTaxTotalEnvelope); //print costs of envelopes
        
        double totalPurchaseCost$=((totalSockCost$+totalGlassesCost$+totalEnvelopeCost$)*100)/100;  //determine cost of entire purchase before tax
        
        System.out.println("The total cost of the entire purchase without tax is $"+totalPurchaseCost$); //print total cost bt
        
        double totalSalesTaxCost$=((salesTaxEnvelopes$+salesTaxGlasses$+salesTaxSocks$)*100)/100;   //calculate total sales tax accrued
        double roundOff2 = Math.round(totalSalesTaxCost$*100)/100.00;   //round decimals
        System.out.println("The total sales tax collected from this purchase is $"+roundOff2);  //print total sales tax cost
        
        double taxTotalPurchaseCost$=((taxTotalEnvelopeCost$+taxTotalGlassesCost$+taxTotalSockCost$)*100)/100;  //calculate cost of entire purchase with tax
        //print the output data
        double roundOff = Math.round(taxTotalPurchaseCost$*100)/100.00;
        System.out.println("The total cost of the entire purchase with tax is $"+(roundOff)); 
    }
}