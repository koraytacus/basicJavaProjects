public class Movie {

    private String movieName;
    private String ratingMPAA;
    private int numberOfRated1;//Terrible
    private int numberOfRated2;//Bad
    private int numberOfRated3;//OK
    private int numberOfRated4;//Good
    private int numberOfRated5;//Great
    private int voteCounter;


    public Movie(String movieName, String ratingMPAA, int numberOfRated1, int numberOfRated2, int numberOfRated3,
                 int numberOfRated4, int numberOfRated5,int voteCounter) {
        super();
        this.movieName = movieName;
        this.ratingMPAA = ratingMPAA;
        this.numberOfRated1 = 0;
        this.numberOfRated2 = 0;
        this.numberOfRated3 = 0;
        this.numberOfRated4 = 0;
        this.numberOfRated5 = 0;
        this.voteCounter = 0;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getRatingMPAA() {
        return ratingMPAA;
    }

    public void setRatingMPAA(String ratingMPAA) {
        this.ratingMPAA = ratingMPAA;
    }

    public int getVoteCounter() {
        return this.voteCounter;
    }


    public void addRating(int vote) {

        switch(vote){

            case 1:
                this.numberOfRated1++;
                this.voteCounter++;
                break;
            case 2:
                this.numberOfRated2++;
                this.voteCounter++;
                break;

            case 3:
                this.numberOfRated3++;
                this.voteCounter++;
                break;

            case 4:
                this.numberOfRated4++;
                this.voteCounter++;
                break;

            case 5:
                this.numberOfRated5++;
                this.voteCounter++;
                break;

            default:
                System.out.println("This rate is not acceptable");

        }
    }//End of the addRating method



    public void getAverage() {
        int totalVote = this.numberOfRated1+this.numberOfRated2+this.numberOfRated3+this.numberOfRated4+this.numberOfRated5;

        System.out.println("-------Rate of " + getMovieName()+" -------");

        System.out.println("1(Terrible)-> %"+((100*this.numberOfRated1)/(totalVote)));
        System.out.println("2(Bad)-> %"+((100*this.numberOfRated2)/(totalVote)));
        System.out.println("3(OK)-> %"+((100*this.numberOfRated3)/(totalVote)));
        System.out.println("4(Good)-> %"+((100*this.numberOfRated4)/(totalVote)));
        System.out.println("5(Great)-> %"+((100*this.numberOfRated5)/(totalVote)));

    }//End of getAverage method.



}

