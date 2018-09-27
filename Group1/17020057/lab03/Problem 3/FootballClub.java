import java.util.ArrayList;


public class FootballClub
{
    private String name;
    private int ranking;
    private  ArrayList <FootballPlayer> playerList;
    
    public static void main(String[] args) 
    {
        FootballClub fcb = new FootballClub("Barelona", 1);
        FootballPlayer a = new FootballPlayer("Sergio", 30, "Center Defensive Midfielde", 90);
        FootballPlayer b = new FootballPlayer("Sergio", 30, "Center Back", 90);
        FootballPlayer c = new FootballPlayer("Lionel", 31, "Second Stricker", 90);
        fcb.addPlayer(a);
        fcb.addPlayer(b);
        fcb.addPlayer(c);
        fcb.getInfo();   
        fcb.removePlayer("Lionel");
        fcb.getInfo(); 
        
    }

    // initialize a football player with name, ranking and empty player list
    public FootballClub(String name, int ranking)
    {
        this.name = new String(name);
        this.ranking = ranking;
        playerList = new ArrayList<>();
    }

      // initialize a football club with same propeties as a
    public FootballClub(FootballClub a)
    {
        this.name = a.name;
        this.ranking = a.ranking;
        this.playerList = new ArrayList<>();
        for(FootballPlayer x : a.playerList)
            this.playerList.add(x);
    }

    // register new player 
    void addPlayer(FootballPlayer player)
    {
        this.playerList.add(player);    
    }

    // remove a player name player
    void removePlayer(String player)
    {
        ArrayList <FootballPlayer> result = new ArrayList<>();
        for(FootballPlayer x : this.playerList)
        {
            if (!x.getName().equals(player))
                result.add(x);
        }
        this.playerList = result;
    }

    // print info of this club to stdout
    public void getInfo()
    {
        System.out.println("Club's Name: " + name);
        System.out.println("Ranking of " + name +": " + ranking);
        if (playerList.size() == 0)
        {
            System.out.println("There are no football player in " + name + " football club");
            return;
        }
        System.out.println("List of " + name + " playes");
        System.out.println();
        for(FootballPlayer x : playerList)
        {
            x.getInfo();
        }
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
        String result = new String(this.name);
        return result;
    }
    
    /**
     * @param ranking the ranking to set
     */
    public void setRanking(int ranking) 
    {
        this.ranking = ranking;
    }

    /**
     * @return the ranking
     */
    public int getRanking() 
    {
        return ranking;
    }

    /**
     * @param playerList the playerList to set
     */
    public void setPlayerList(ArrayList<FootballPlayer> playerList) 
    {
        this.playerList = new ArrayList<>();
        for(FootballPlayer x : playerList)
            this.playerList.add(x);
    }

    /**
     * @return the playerList
     */
    public ArrayList<FootballPlayer> getPlayerList() 
    {
        ArrayList <FootballPlayer> result = new ArrayList<>();
        for(FootballPlayer x : this.playerList)
        {
            result.add(x);
        }
        return result;
    }


}