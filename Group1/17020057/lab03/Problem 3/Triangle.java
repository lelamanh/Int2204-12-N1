public class Triangle
{
    private double a, b, c; // length of this triangle's edges
    public static void main(String[] args) 
    {
        Triangle a = new Triangle(3, 4, 5);
        a.getInfo();
        Triangle b = new Triangle(a);
        b.setC(6);
        b.getInfo();
    }
    
     // initialize a triangle with length of 3 edges is a, b, c
    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        validator();
    }

    // initialize a triangle with same propeties as a
    public Triangle(Triangle a)
    {
        this(a.a, a.b, a.c);
    }

    // print info of this triangle to stdout
    public void getInfo()
    {
        System.out.println("Length of this triangle's edges: " + a + " " + b + " " + c);
        System.out.println("Area of this triangle: " + this.caculateArea());
    }

    // check if this triangle is not valid
    void validator()
    {
        if (a <= 0 || b <= 0 || c <= 0) 
            throw new IllegalArgumentException("Edges must be positive");
        if (a + b < c || a + c < b || b + c < a)
            throw new IllegalArgumentException("Triangle with this propeties does not exist");
    }

    // caculate area of this triangle using Heron's formula 
    public double caculateArea()
    {
        double p = (a + b + c)/2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    /**
     * @return the a
     */
    public double getA() 
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) 
    {
        this.a = a;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) 
    {
        this.b = b;
    }

    /**
     * @return the b
     */
    public double getB() 
    {
        return b;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) 
    {
        this.c = c;
    }

    /**
     * @return the c
     */
    public double getC() 
    {
        return c;
    }
}