/** Oranges: 10 for $2.99
 * Eggs: 12 for $1.69
 * Apples: 3 for $1.00
 * Watermelons: $4.39 each
 * Bagels: 6 for $3.50*/

public class PurchaseTest {
    public static void main(String[] args) {
        Purchase Oranges = new Purchase();
        Purchase Eggs = new Purchase();
        Purchase Apples = new Purchase();
        Purchase Watermelons = new Purchase();
        Purchase Bagels = new Purchase();


        Purchase oranges = new Purchase();
        oranges.setPurchase(24, 2.99/10); // 2 dozen oranges
        double costOranges = oranges.totalCostWithTax();

        Purchase eggs = new Purchase();
        eggs.setPurchase(36, 1.69/12); // 3 dozen eggs
        double costEggs = eggs.totalCostWithTax();

        Purchase apples = new Purchase();
        apples.setPurchase(20, 1.0/3); // 20 apples
        double costApples = apples.totalCostWithTax();

        Purchase watermelons = new Purchase();
        watermelons.setPurchase(2, 4.39); // 2 watermelons
        double costWatermelons = watermelons.totalCostWithTax();

        Purchase bagels = new Purchase();
        bagels.setPurchase(12, 3.50/6); // 1 dozen bagels
        double costBagels = bagels.totalCostWithTax();

        // Displaying costs
        System.out.println("Cost of 2 dozen oranges: $" + costOranges);
        System.out.println("Cost of 3 dozen eggs: $" + costEggs);
        System.out.println("Cost of 20 apples: $" + costApples);
        System.out.println("Cost of 2 watermelons: $" + costWatermelons);
        System.out.println("Cost of 1 dozen bagels: $" + costBagels);

        // Total bill
        double totalBill = costOranges + costEggs + costApples + costWatermelons + costBagels;
        System.out.println("Total bill: " + totalBill + "$");
    }






    }

