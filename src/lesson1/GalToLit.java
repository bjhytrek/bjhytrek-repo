/*
 *  Try this 1-1
 * This program converts gallons to liters.
 * call this program CaToLit.java
 */
class GalToLit {
    public static void main(String args[]) {
        double gallons; // holds the number of gallons
        double liters; // holds conversion to liters
        
        gallons = 10; //starts with 10 gallons
        liters = gallons* 3.7854; //conver to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}