/**
 * Write a class Purchase. The class has the following attributes:
 * • The number of items purchased
 * • The price of each item
 * The class has the following methods:
 * • A method to set the number of items and the price per item
 * • A method to calculate and return the total cost of the purchase
 * • A method to calculate and return the total cost of the purchase including a 7 percent sales tax
 *
 * Oranges: 10 for $2.99
 * Eggs: 12 for $1.69
 * Apples: 3 for $1.00
 * Watermelons: $4.39 each
 * Bagels: 6 for $3.50
 *
 * Then calculate the cost of each of the following five items and the total bill:
 * 2 dozen oranges
 * 3 dozen eggs
 * 20 apples
 * 2 watermelons
 * 1 dozen bagels
 * */



public class Purchase {

    private int numberOfItems;
    private double pricePerItem;

    public Purchase(){

        this.numberOfItems = 0;
        this.pricePerItem =  0;

    }

    public void setPurchase(int numberOfItems,double pricePerItem) {
        this.pricePerItem = pricePerItem;
        this.numberOfItems = numberOfItems;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double totalCost(){
        return numberOfItems*pricePerItem;
    }

    public double totalCostWithTax(){
        return totalCost()*1.07; // totalCost() + (totalCost()*0.07), 7% sales tax
    }






}



