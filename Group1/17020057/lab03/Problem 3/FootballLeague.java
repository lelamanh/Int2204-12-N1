import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FootballLeague
{
    private String name;
    private ArrayList <FootballClub> clubList;
    private FootballPlayer bestPlayer;
    
    public static void main(String[] args) 
    {
        FootballLeague a = new FootballLeague("Laliga");
        FootballPlayer m10 = new FootballPlayer("Messi", 31, "Right Forward",98);
        FootballPlayer cr7 = new FootballPlayer("Cris. Ronaldo", 32, "Centre Forward",97);
        FootballClub fcb = new FootballClub("Barcelona", 1);
        FootballClub rma = new FootballClub("Real Madrid", 2);
        FootballClub atm = new FootballClub("Atletico Madrid", 3);
        a.addClub(rma);
        a.addClub(atm);
        a.addClub(fcb);
        a.setBestPlayer(m10);
        a.getInfo();

        FootballLeague b = new FootballLeague(a);
        b.setName("Laliga B");
        b.setBestPlayer(cr7);
        atm.setRanking(2);
        rma.setRanking(3);
        b.getInfo();
    }


    // initialize a league with name
    public FootballLeague(String name)
    {
        this.name = new String(name);
    }

    // initialize a football league with same propeties as a
    public FootballLeague(FootballLeague a)
    {
        this.name = new String(a.name);
        if (a.clubList != null)
        {
            this.clubList = new ArrayList<>();
            for(FootballClub x : a.clubList)
            {
                this.clubList.add(x);
            }
        }
        if (a.bestPlayer != null)
            this.bestPlayer = new FootballPlayer(a.bestPlayer);

    }

    // add a club to league
    public void addClub(FootballClub x)
    {
        if (clubList == null) 
        {
            clubList = new ArrayList<>();
        }
        clubList.add(x);
    }

    // print info of this league to stdout
    public void getInfo()
    {
        System.out.println("League name: " + name);
        if (this.clubList == null) return;
        if (this.clubList.size() == 0)
        {
            System.out.println("There are no club");
            return;
        }
        this.sortByRanking();
        System.out.println("Standing:");
        for(FootballClub x : clubList)
        {
            System.out.println("Rank " + x.getRanking() + ": " + x.getName());
        }
        if (bestPlayer == null) return;
        System.out.println();
        System.out.println("Best Player: ");
        bestPlayer.getInfo();
    }

    // Comparator to sort club by ranking
    private Comparator <FootballClub> rankingComparator = new Comparator<FootballClub>() 
    {
        public int compare(FootballClub a, FootballClub b)
        {
            if (a.getRanking() > b.getRanking()) return 1;
            if (a.getRanking() == b.getRanking()) return 0;
            return -1;
        }
    };

    // sort club list by ranking 
    public void sortByRanking()
    {
        Collections.sort(clubList, rankingComparator);
    }

    /**
     * @return the name
     */
    public String getName() 
    {
        return new String(name);
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = new String(name);
    }

    /**
     * @param clubList the clubList to set
     */
    public void setClubList(ArrayList<FootballClub> clubList) 
    {
        this.clubList = new ArrayList<>();
        for(FootballClub x : clubList)
        {
            this.clubList.add(x);
        }
    }

    /**
     * @return the clubList
     */
    public ArrayList<FootballClub> getClubList() 
    {
        ArrayList <FootballClub> result = new ArrayList<>();
        for(FootballClub x : clubList)
        {
            result.add(x);
        }
        return result;
    }

    /**
     * @return the bestPlayer
     */
    public FootballPlayer getBestPlayer() 
    {
        return new FootballPlayer(bestPlayer);
    }

    /**
     * @param bestPlayer the bestPlayer to set
     */
    public void setBestPlayer(FootballPlayer bestPlayer) 
    {
        this.bestPlayer = new FootballPlayer(bestPlayer);
    }

}
