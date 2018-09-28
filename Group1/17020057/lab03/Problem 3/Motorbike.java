public class Motorbike
{
    private String name;
    private int height;
    private int weight;
    private int cylinderCapacity;

    public static void main(String[] args) 
    {   
        Motorbike a = new Motorbike("CB1000R", 830, 212, 998);
        a.getInfo();
        Motorbike b = new Motorbike(a);
        b.setName("Future");
        b.setWeight(106);
        b.setHeight(756);
        b.setCylinderCapacity(125);
        b.getInfo();
    }

    // initialize a motobike with name, height, weight, cylinderCapacity
    public Motorbike(String name, int height, int weight, int cylinderCapacity)
    {
        this.name = new String(name);
        this.height = height;
        this.weight = weight;
        this.cylinderCapacity = cylinderCapacity;
    }

    // initialize a motobike with same propeties as a
    public Motorbike(Motorbike a)
    {
        this(a.name, a.height, a.weight, a.cylinderCapacity);
    }

    // print info of this motobike to stdout
    public void getInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + "mm");
        System.out.println("Weight: " + weight + "kq");
        System.out.println("Cylinder capacity: " + cylinderCapacity + "cc");
        System.out.println();
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
     * @return the weight
     */
    public int getWeight() 
    {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) 
    {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public int getHeight() 
    {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) 
    {
        this.height = height;
    }

    /**
     * @return the cylinderCapacity
     */
    public int getCylinderCapacity() 
    {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    public void setCylinderCapacity(int cylinderCapacity) 
    {
        this.cylinderCapacity = cylinderCapacity;
    }
}
