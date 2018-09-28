import java.sql.Date;
import java.util.ArrayList;

//Doi tuong 1 - Nguoi
class Person
{
    private String name;    // Ho va Ten
    private int id;         // Can cuoc
    private boolean gender; // Gioi tinh - true = nam, false = nu
    private Date birthday;  // Sinh nhat
    private String job;     // Cong viec
    private Person partner; // Hon the

    public Person(String name, int id, String gender, Date birthday, String job, Person partner)
    {
        this.name       = new String(name);
        this.id         = id;
        this.gender     = gender.equals("male");
        this.birthday   = new Date(birthday.getTime());
        this.job        = new String(job);
        this.partner    = new Person(partner);
    }

    public Person(Person another)
    {
        name        = another.getName();
        id          = another.getId();
        gender      = another.getGender().equals("male");
        birthday    = another.getBirthday();
        job         = another.getJob();
        partner     = another.getPartner();
    }

    public String getName()
    {
        return new String(name);
    }

    public void setName(String name)
    {
        this.name = new String(name);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getGender()
    {
        if (this.gender) return new String("male");
        else return new String("female");
    }

    public void setGender(String gender)
    {
        this.gender = gender.equals("male");
    }

    public Date getBirthday()
    {
        return new Date(birthday.getTime());
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = new Date(birthday.getTime());
    }

    public String getJob()
    {
        return new String(job);
    }

    public void setJob(String job)
    {
        this.job = new String(job);
    }

    public Person getPartner()
    {
        return new Person(partner);
    }

    public void setPartner(Person partner)
    {
        this.partner = new Person(partner);
    }

}

//Doi tuong 2 - Phong
class Room
{
    private int address;                                    // So phong
    private int floor;                                      // Tang
    private int indicator;                                  // So thu tu trong tang
    private double length;                                  // Chieu dai
    private double width;                                   // Chieu rong
    private double area;                                    // Dien tich
    private ArrayList<Person> resident = new ArrayList<>(); // Thong tin nguoi luu tru trong phong

    public Room(int address, double length, double width, ArrayList<Person> resident)
    {
        this.address            = address;
        this.floor              = address / 100;
        this.indicator          = address % 100;
        this.length             = length;
        this.width              = width;
        this.area               = length*width;
        this.resident.clear();
        for(Person person : resident)
            this.resident.add(new Person(person));
    }

    public Room(Room another)
    {
        address             = another.getAddress();
        floor               = another.getFloor();
        indicator           = another.getIndicator();
        length              = another.getLength();
        width               = another.getWidth();
        area                = another.getArea();
        resident.clear();
        for(Person person : another.resident)
            resident.add(new Person(person));
    }

    public int getAddress()
    {
        return address;
    }

    public void setAddress(int address)
    {
        this.address    = address;
        this.floor      = address / 100;
        this.indicator  = address % 100;
    }

    public int getFloor()
    {
        return floor;
    }

    public void setFloor(int floor)
    {
        this.floor  = floor;
        this.address = floor*100 + indicator;
    }

    public int getIndicator()
    {
        return indicator;
    }

    public void setIndicator(int indicator)
    {
        this.indicator  = indicator;
        this.address    = floor*100 + indicator;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
        this.area   = length*width;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width  = width;
        this.area   = length*width;
    }

    public double getArea()
    {
        return area;
    }

    public int getNumberOfResident()
    {
        return resident.size();
    }

    public Person getResident(int i)
    {
        return new Person(resident.get(i));
    }

    public void setResidents(ArrayList<Person> resident)
    {
        this.resident.clear();
        for(Person person : resident)
            this.resident.add(new Person(person));
    }

}

//Doi tuong 3 - Tang
class Floor
{
    private int indicator;              // Chi so tang
    private int population;             // Dan so
    private int numberOfRooms;          // So phong trong tang
    private Room[] room = new Room[20]; // Thong tin cac phong
    private double height;              // Chieu cao tang
    
    public Floor(int indicator, int numberOfRooms, Room[] room)
    {
        this.indicator      = indicator;
        this.numberOfRooms  = numberOfRooms;
        this.population     = 0;
        for(int i = 0; i < numberOfRooms; ++i)
        {
            this.room[i]    = new Room(room[i]);
            this.population += room[i].getNumberOfResident();
        }
    }

    public Floor(Floor another)
    {
        this(another.indicator, another.numberOfRooms, another.room);
    }

    public int getIndicator()
    {
        return indicator;
    }

    public void setIndicator(int indicator)
    {
        this.indicator = indicator;
    }

    public int getPopulation()
    {
        return population;
    }

    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    public Room getRoom(int i)
    {
        return new Room(room[i]);
    }

    public void setRooms(int numberOfRooms, Room[] room)
    {
        this.numberOfRooms  = numberOfRooms;
        this.population     = 0;
        for(int i = 0; i < numberOfRooms; ++i)
        {
            this.room[i]    = new Room(room[i]);
            this.population += room[i].getNumberOfResident();
        }
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

}

//Doi tuong 4 - Toa nha
class Building
{
    private int address;                    // So nha
    private int population;                 // Dan so
    private int numberOfFloors;             // So tang
    private Floor[] floor = new Floor[100]; // Tang
    private double height;                  // Chieu cao
    
    //public Building() {}

    public Building(int address, int numberOfFloors, Floor[] floor)
    {
        this.address        = address;
        this.population     = 0;
        this.height         = 0;
        this.numberOfFloors = numberOfFloors;
        for(int i = 0; i < numberOfFloors; ++i)
        {
            this.floor[i]   = new Floor(floor[i]);
            this.population += floor[i].getPopulation();
            this.height     += floor[i].getHeight();
        }
    }

    public Building(Building another)
    {
        this(another.getAddress(), another.getNumberOfFloors(), another.floor);
    }

    public int getAddress()
    {
        return address;
    }

    public void setAddress(int address)
    {
        this.address = address;
    }

    public int getPopulation()
    {
        return population;
    }

    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    public Floor getFloor(int i)
    {
        return new Floor(floor[i]);
    }

    public void setFloor(int numberOfFloor, Floor[] floor)
    {
        this.population     = 0;
        this.height         = 0;
        this.numberOfFloors = numberOfFloor;
        for(int i = 0; i < numberOfFloor; ++i)
        {
            this.floor[i]   = new Floor(floor[i]);
            this.population += floor[i].getPopulation();
            this.height     += floor[i].getHeight();
        }
    }

    public double getHeight()
    {
        return this.height;
    }

}

//Doi tuong 5 - Pho
class Street
{
    private String name;                                // Ten pho
    private int population;                             // Dan so
    private int numberOfBuildings;                      // So toa nha
    private Building[] building = new Building[100];    // Thong tin cac toa nha

    public Street() {}

    public Street(String name, int numberOfBuildings, Building[] building)
    {
        this.name               = new String(name);
        this.population         = 0;
        this.numberOfBuildings  = numberOfBuildings;
        for(int i = 0; i < numberOfBuildings; ++i)
        {
            this.building[i]    = new Building(building[i]);
            this.population     += building[i].getPopulation();
        }
    }

    public Street(Street another)
    {
        this(another.name, another.numberOfBuildings, another.building);
    }

    public String getName()
    {
        return new String(name);
    }

    public void setName(String name)
    {
        this.name = new String(name);
    }

    public int getPopulation()
    {
        return population;
    }

    public int getNumberOfBuldings()
    {
        return numberOfBuildings;
    }

    public Building getBuilding(int i)
    {
        return new Building(building[i]);
    }

    public void setBuilding(int numberOfBuildings, Building[] building)
    {
        this.numberOfBuildings  = numberOfBuildings;
        this.population         = 0;
        for(int i = 0; i < numberOfBuildings; ++i)
        {
            this.building[i]    = new Building(building[i]);
            this.population     += building[i].getPopulation();
        }
    }

}

//Doi tuong 6 - Dai lo
class Avenue extends Street
{
    private Building[] building = new Building[1000];
    /*
    Dai lo ke thua cac thuoc tinh cua duong, tuy nhien so toa nha nhieu hon 10 lan
    */

    public Avenue(String name, int numberOfBuildings, Building[] building)
    {
        setName(name);
        setBuilding(numberOfBuildings, building);
    }

    public Avenue(Avenue another)
    {
        this(another.getName(), another.getNumberOfBuldings(), another.building);
    }

    public double highestBuilding()
    {
        double highestBuilding = 0;
        for(int i = 0; i < getNumberOfBuldings(); ++i)
            highestBuilding = Math.max(highestBuilding, building[i].getHeight());
        return highestBuilding;
    }
}

//Doi tuong 7 - Quan
class District
{
    private String name;                        // Ten quan
    private int population;                     // Dan so
    private int numberOfStreets;                // So pho
    private Street[] street = new Street[100];  // Thong tin cac pho
    private int numberOfAvenues;                // So dai lo
    private Avenue[] avenue = new Avenue[100];  // Thong tin cac dai lo

    public District(String name, int numberOfStreets, Street[] street, int numberOfAvenues, Avenue[] avenue)
    {
        this.name               = new String(name);
        this.population         = 0;
        this.numberOfStreets    = numberOfStreets;
        for(int i = 0; i < numberOfStreets; ++i)
        {
            this.street[i]      = new Street(street[i]);
            this.population     += street[i].getPopulation();
        }
        this.numberOfAvenues    = numberOfAvenues;
        for(int i = 0; i < numberOfAvenues; ++i)
        {
            this.avenue[i]      = new Avenue(avenue[i]);
            this.population     += avenue[i].getPopulation();
        }
    }

    public District(District another)
    {
        this(another.name, another.numberOfStreets, another.street, another.numberOfAvenues, another.avenue);
    }

    public String getName()
    {
        return new String(name);
    }

    public void setName(String name)
    {
        this.name = new String(name);
    }

    public int getPopulation()
    {
        return population;
    }

    public int getNumberOfStreets()
    {
        return numberOfStreets;
    }

    public Street getStreet(int i)
    {
        return new Street(street[i]);
    }

    public void setStreet(int numberOfStreets, Street[] street)
    {
        for(int i = 0; i < this.numberOfStreets; ++i)
            this.population     -= this.street[i].getPopulation();     
        this.numberOfStreets    = numberOfStreets;
        for(int i = 0; i < this.numberOfStreets; ++i)
        {
            this.street[i]      = new Street(street[i]);
            this.population     += street[i].getPopulation();
        }
    }

    public int getNumberOfAvenues()
    {
        return numberOfAvenues;
    }

    public Avenue getAvenue(int i)
    {
        return new Avenue(avenue[i]);
    }

    public void setAvenue(int numberOfAvenues, Avenue[] avenue)
    {
        for(int i = 0; i < this.numberOfAvenues; ++i)
            this.population     -= this.avenue[i].getPopulation();     
        this.numberOfAvenues    = numberOfAvenues;
        for(int i = 0; i < this.numberOfAvenues; ++i)
        {
            this.avenue[i]      = new Avenue(avenue[i]);
            this.population     += avenue[i].getPopulation();
        }
    }

}

//Doi tuong 8 - Thanh pho
class City
{
    private String name;                            // Ten thanh pho
    private int population;                         // Dan so
    private int numberOfDistricts;                  // So quan
    private District[] district = new District[20]; // Thong tin cac quan

    public City(String name, int numberOfDistricts, District[] district)
    {
        this.name               = new String(name);
        this.population         = 0;
        this.numberOfDistricts  = numberOfDistricts;
        for(int i = 0; i < numberOfDistricts; ++i)
        {
            this.district[i]    = new District(district[i]);
            this.population     += district[i].getPopulation();
        }
    }

    public City(City another)
    {
        this(another.name, another.numberOfDistricts, another.district);
    }

    public String getName()
    {
        return new String(this.name);
    }

    public void setName(String name)
    {
        this.name = new String(name);
    }

    public int getPopulation()
    {
        return this.population;
    }

    public int getNumberOfDistricts()
    {
        return this.numberOfDistricts;
    }

    public District getDistrict(int i)
    {
        return new District(this.district[i]);
    }

    public void setDistrict(int numberOfDistricts, District[] district)
    {
        this.numberOfDistricts  = numberOfDistricts;
        this.population         = 0;
        for(int i = 0; i < numberOfDistricts; ++i)
        {
            this.district[i]    = new District(district[i]);
            this.population     += district[i].getPopulation();
        }
    }

}

//Doi tuong 9 - Nuoc
class Country
{
    private String name;                    // Ten nuoc
    private int population;                 // Dan so
    private int numberOfCities;             // So thanh pho
    private City[] city = new City[100];    // Thong tin ca thanh pho

    public Country(String name, int numberOfCities, City[] city)
    {
        this.name           = new String(name);
        this.population     = 0;
        this.numberOfCities = numberOfCities;
        for(int i = 0; i < numberOfCities; ++i)
        {
            this.city[i]    = new City(city[i]);
            this.population += city[i].getPopulation();
        }
    }

    public Country(Country another)
    {
        this.name           = new String(another.name);
        this.population     = another.population;
        this.numberOfCities = another.numberOfCities;
        for(int i = 0; i < numberOfCities; ++i)
            this.city[i] = new City(another.city[i]);
    }

    public String getName()
    {
        return new String(this.name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPopulation()
    {
        return this.population;
    }

    public int getNumberOfCities()
    {
        return this.numberOfCities;
    }

    public City getCity(int i)
    {
        return new City(this.city[i]);
    }

    public void setCity(int numberOfCities, City[] city)
    {
        this.population     = 0;
        this.numberOfCities = numberOfCities;
        for(int i = 0; i < numberOfCities; ++i)
            this.city[i] = new City(city[i]);
    }
}

//Doi tuong 10 - The gioi
class World
{
    private int numberOfCountries = 195;            // So nuoc
    private int population;                         // Dan so
    private Country[] country = new Country[195];   // Thong tin cac nuoc

    public World(Country[] country)
    {
        this.population = 0;
        for(int i = 0; i < numberOfCountries; ++i)
        {
            this.country[i] = new Country(country[i]);
            this.population += country[i].getPopulation();
        }
    }

    public int getPopulation()
    {
        return population;
    }

    public int getNumberOfCountries()
    {
        return numberOfCountries;
    }

    public Country getCountry(String name)
    {
        for(int i = 0; i < numberOfCountries; ++i)
            if (country[i].getName().equals(name)) return new Country(country[i]);
        return null;
    }

    public void setCountry(String name, Country country)
    {
        for(int i = 0; i < numberOfCountries; ++i)
            if (this.country[i].getName().equals(name))
            {
                this.population += this.country[i].getPopulation() - country.getPopulation();
                this.country[i] = new Country(country);
                break;
            }
    }

    public void setCountry(Country[] country)
    {
        this.population = 0;
        for(int i = 0; i < numberOfCountries; ++i)
        {
            this.country[i] = new Country(country[i]);
            this.population += this.country[i].getPopulation();
        }
    }

}