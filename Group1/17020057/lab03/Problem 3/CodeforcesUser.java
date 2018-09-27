public class CodeforcesUser
{
    private String handle;
    private int rating;
    private Date dateRegistered;
    private int pastContests;

    public static void main(String[] args) 
    {
        Date thatDate = new Date(8, 11, 2016);
        CodeforcesUser hbl = new CodeforcesUser("longhoang08", 2153, thatDate, 35);
        hbl.solveNewContest();
        hbl.getInfo();
        hbl.getDateRegistered().getDate();
    }

    // initialize a ure with handle, rating, dateRegistered and pastContests
    public CodeforcesUser(String handle, int rating, Date dateRegistered, int pastContests)
    {
        this.handle = new String(handle);
        this.rating = rating;
        this.dateRegistered = new Date(dateRegistered);
        this.pastContests = pastContests;
    }

    // initialize a user with same propeties as a
    public CodeforcesUser(CodeforcesUser a)
    {
        this(a.handle, a.rating, a.dateRegistered, a.pastContests);
    }

    // print this user to stdout
    public void getInfo()
    {
        System.out.println("Handle: " + handle);
        System.out.println("Rating: " + rating);
        System.out.print("Registered: :");
        this.dateRegistered.getDate();
        System.out.println("Past Contests: " + pastContests);
    }

    // this user slove one more contest
    public void solveNewContest()
    {
        this.pastContests++;
    }

    /**
     * @param handle the handle to set
     */
    public void setHandle(String handle) 
    {
        this.handle = new String(handle);
    }

    /**
     * @return the handle
     */
    public String getHandle() 
    {
        String result = new String(this.handle);
        return result;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the dateRegistered
     */
    public Date getDateRegistered() 
    {
        Date result = new Date(this.dateRegistered);
        return result;
    }

    /**
     * @param dateRegistered the dateRegistered to set
     */
    public void setDateRegistered(Date dateRegistered) 
    {
        this.dateRegistered = dateRegistered;
    }

    /**
     * @return the pastContests
     */
    public int getPastContests() 
    {
        return pastContests;
    }

    /**
     * @param pastContests the pastContests to set
     */
    public void setPastContests(int pastContests) 
    {
        this.pastContests = pastContests;
    }
}
