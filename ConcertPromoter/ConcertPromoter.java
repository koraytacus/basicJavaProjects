public class ConcertPromoter {

    private String bandName;
    private int capacityOfVenue;
    private int ticketsSoldCount;
    private int ticketPriceByPhone=250;
    private int ticketPriceAtVenue = 325;




    public ConcertPromoter(String bandName,int capacityOfVenue,int ticketsSoldCount){

        this.bandName=bandName;
        this.capacityOfVenue=capacityOfVenue;
        this.ticketsSoldCount=ticketsSoldCount;


    }





    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getCapacityOfVenue() {
        return capacityOfVenue;
    }

    public void setCapacityOfVenue(int capacityOfVenue) {
        this.capacityOfVenue = capacityOfVenue;
    }

    public int getTicketsSoldCount() {
        return ticketsSoldCount;
    }

    public void setTicketsSoldCount(int ticketPriceByPhone) {
        this.ticketPriceByPhone = ticketPriceByPhone;
    }

    public int getTicketPriceByPhone() {
        return ticketPriceByPhone;
    }

    public void setTicketPriceByPhone(int ticketPriceByPhone) {
        this.ticketPriceByPhone = ticketPriceByPhone;
    }

    public int getTicketPriceAtVenue() {
        return ticketPriceAtVenue;
    }

    public void setTicketPriceAtVenue(int ticketPriceAtVenue) {
        this.ticketPriceAtVenue = ticketPriceAtVenue;
    }

    public void record(int numberOfNewSales){//Record sales

        if( this.remainingTickets()  >= numberOfNewSales){

            this.ticketsSoldCount += numberOfNewSales;}


        else{
            System.out.println("There is no enough ticket");
        }

    }//End of record method

    public int totalSoldTickets(){//Return the number of tickets sold

        return this.ticketsSoldCount;
    }//End of totalSoldTickets method

    public int remainingTickets(){//Return the number of tickets remaining

        return this.capacityOfVenue - this.ticketsSoldCount;
    }// End of the  remainingTickets method


    public int totalSalesPayment(){ //Return the total sales for the concert

        int onlineTicketsNumbers = this.capacityOfVenue - this.ticketsSoldCount;
        int totalOnlinePayment = onlineTicketsNumbers * this.ticketPriceByPhone;
        int totalVenueTicketsPayment = this.ticketsSoldCount * this.ticketPriceAtVenue;

        return totalOnlinePayment + totalVenueTicketsPayment;

    } //End of the totalSalesPayment




































































}
