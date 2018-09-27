public class Fraction
{
    private int x, y;

    //is this fraction valid?
    private void validator()
    {
        if (this.y == 0) //Denominator not equal to 0
        {
            throw new IllegalArgumentException("Error!!! Denominator equal to 0");
        }
    }

    public Fraction(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.validator();
    }

    public Fraction(Fraction a)
    {
        this(a.x, a.y);
    }

    // convert to minimal fractions
    public void toMinimalFraction()
    {
        int _gcd = gcd(x, y);
        x /= _gcd;
        y /= _gcd;
        if (y < 0) 
        {
            x = -x;
            y = -y;
        }
    }

    // write x/y to Stdout
    public void Write()
    {
        System.out.print(this.x + "/" + this.y);
    }

    // return this + a
    public Fraction addition(Fraction a)
    {
        int _gcd = gcd(this.y, a.y);
        int _y = this.y / _gcd * a.y;
        int _x = ((_y / this.y) * this.x) + ((_y / a.y) * a.x);
        Fraction result = new Fraction(_x, _y);
        result.toMinimalFraction();
        return result;
    }

    // return this - a
    public Fraction subtraction(Fraction a)
    {
        int _gcd = gcd(this.y, a.y);
        int _y = this.y / _gcd * a.y;
        int _x = ((_y / this.y) * this.x) - ((_y / a.y) * a.x);
        Fraction result = new Fraction(_x, _y);
        result.toMinimalFraction();
        return result;
    }

    //return this * a
    public Fraction multiplication(Fraction a)
    {
        // a/b * c/d = (a * c) / (b * d)
        int _x = this.x * a.x;
        int _y = this.y * a.y;
        int _gcd = gcd(_x, _y);
        Fraction result = new Fraction(_x / _gcd, _y/_gcd);
        return result;
    }

    // return 1/a 
    private Fraction reverse()
    {
        Fraction result = new Fraction(this.y, this.x);
        result.validator();
        return result;
    }

    // return this / a
    public Fraction division(Fraction a)
    {
        Fraction b = a.reverse();
        return this.multiplication(b); // this / a = this * (1/a);
    }

    // return true if this fraction equal to a, else return false
    private boolean fractionEqual(Fraction a)
    {
        return (this.x * a.y == this.y * a.x);
    }

    // return true if this object equal to a, else return false
    public boolean equals(Object a)
    {
        if (!(a instanceof Fraction)) return false;
        Fraction otherFraction = (Fraction) a;
        return fractionEqual(otherFraction);
    }

    // caulate gcd of two positive interger a, b
    private int gcd(int a, int b)
    {
        return (b == 0) ? Math.abs(a) : gcd(b, a%b); 
    }
}
