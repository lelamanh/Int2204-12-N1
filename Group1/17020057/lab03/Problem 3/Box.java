public class Box
{
    private int length, width, height;
    public static void main(String[] args) 
    {   
        Box a = new Box(6, 5, 7);
        Box b = new Box(a);
        b.setLength(10);
        a.getInfo();
        b.getInfo();
    }

    // initialize a box with length, width, height
    public Box(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // initialize a box with same propeties as a
    public Box(Box a)
    {
        this(a.length, a.width, a.height);
    }

    // print this box to stdout
    public void getInfo()
    {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + this.calVolume());
        System.out.println();
    }

    // caculate this box's volume
    public long calVolume()
    {
        long res = (long) length * width * height;
        return res;
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
     * @return the length
     */
    public int getLength() 
    {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) 
    {
        this.length = length;
    }

    /**
     * @return the width
     */
    public int getWidth() 
    {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) 
    {
        this.width = width;
    }
}