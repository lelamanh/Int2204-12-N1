public class Problem
{
    private String name;
    private String author;
    private int levelOfDificult, score;

    public static void main(String[] args) 
    {
        Problem A = new Problem("UETACM", "longhoang08", 4, 500);
        Problem B = new Problem(A);
        B.setName("BIRTHDAY");
        B.setAuthor("HoangBaoLong");
        B.setLevelOfDificult(5);
        B.setScore(1000);
        A.getInfo();
        B.getInfo();
        //System.out.println(A.getAuthor());
        //System.out.println(A.getAuthor());
    }

    // initialize a problem with name, author, levelOfDificult and score
    public Problem(String name, String author, int levelOfDificult, int score)
    {
        this.name = new String(name);
        this.author = new String(author);
        this.levelOfDificult = levelOfDificult;
        this.score = score;
    }

    // initialize a problem with same propeties as a
    public Problem(Problem a)
    {
        this(a.name, a.author, a.levelOfDificult, a.score);
    }

    // print info of this problem to stdout
    public void getInfo()
    {
        System.out.println("Problem " + name);
        System.out.println("Author: " + author);
        System.out.println("Level of dificult: " + levelOfDificult + "*");
        System.out.println("Score of this problem: " + score);
        System.out.println();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = new String(name);
    }

    /**
     * @return the name
     */
    public String getName() 
    {
        return new String(name);
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) 
    {
        this.author = new String(author);
    }

    /**
     * @return the author
     */
    public String getAuthor() 
    {
        return new String(author);
    }

    /**
     * @return the levelOfDificult
     */
    public int getLevelOfDificult() 
    {
        return levelOfDificult;
    }

    /**
     * @param levelOfDificult the levelOfDificult to set
     */
    public void setLevelOfDificult(int levelOfDificult) 
    {
        this.levelOfDificult = levelOfDificult;
    }

    /**
     * @return the score
     */
    public int getScore() 
    {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) 
    {
        this.score = score;
    }
}   