public class TestConcertPromoter {

    public static void main(String[] args) {

        ConcertPromoter promoter = new ConcertPromoter("Leyla the Band",
                10000,6000);


        System.out.println("Name of the group is " + promoter.getBandName() + ".");
        System.out.println("Capacity of the concert is " + promoter.getCapacityOfVenue()+".");

        promoter.record(3000);

        System.out.println(promoter.remainingTickets() + " tickets left .");
        System.out.println(promoter.totalSoldTickets() + " tickets was sold");
        System.out.println("Total payment is " + promoter.totalSalesPayment() + "$ right now .");






    }


}
