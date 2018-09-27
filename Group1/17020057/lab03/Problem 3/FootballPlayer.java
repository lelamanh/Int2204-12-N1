public class FootballPlayer
{
    private String name;
    private int age;
    private String positions;
    private int ability;
    
    public static void main(String[] args) 
    {
        FootballPlayer a = new FootballPlayer("Sergio", 30, "CDM", 90);
        a.getInfo();
        a.increaseAbility(-10);
        a.addPositions("CB");
        a.getInfo();
    }
    // initialize a football player with name, age, positions, ability.
    public FootballPlayer(String name, int age, String positions, int ability)
    {
        this.name = new String(name);
        this.age = age;
        this.positions = new String(positions);
        this.ability = ability;
    }

    // initialize a football player with same propeties as a
    public FootballPlayer(FootballPlayer a)
    {
        this(a.name, a.age, a.positions, a.ability);
    }

    // print info of this football player to stdout
    public void getInfo()
    {
        System.out.println("Player's Name: " + name);
        System.out.println("Player's Age: " + age);
        System.out.println("Player's Positions: " + positions);
        System.out.println("Player's Ability: " + ability);
        System.out.println();
    }

    //return the name
    public String getName() 
    {
        String result = new String(name);
        return result;
    }

    //set name of this object to name.
    public void setName(String name) 
    {
        this.name = new String(name);
    }

    //return the age
    public int getAge() 
    {
        return age;
    }

    //set age of this object to age.
    public void setAge(int age) 
    {
        this.age = age;
    }

    // increase age if if isNewYear = true 
    public void increaseAge(boolean isNewYear)
    {
        if (isNewYear) this.age++;
    }

    //return the positions
    public String getPositions() 
    {
        String result = new String(positions);
        return result;
    }

    //set positions of this object to positions.
    public void setPositions(String positions) 
    {
        this.positions = new String(positions);
    }

    // add new Positions
    public void addPositions(String newPositions)
    {
        this.positions += " & " + newPositions;
    }

    //return the ability
    public int getAbility() {
        return ability;
    }

    //set ability of this object to ability.
    public void setAbility(int ability) 
    {
        this.ability = ability;
    }

    // raise this's ability of a extra x
    public void increaseAbility(int x)
    {
        this.ability += x;
    }
}
