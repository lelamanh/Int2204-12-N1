
public class Fraction {
    int numerator, denominator;
    public Fraction(){numerator = 1; denominator = 1;}
    public Fraction(int numerator, int denominator){
        if(denominator == 0) {
            throw new Error("Invalid denominator!! Denominatior must not equals zero");
        }
        this.numerator = numerator; this.denominator = denominator;
        this.minialFraction();
    }
    public Fraction add(Fraction a)
    {

        Fraction rtFrac = new Fraction(this.numerator*a.denominator + a.numerator*this.denominator, 
            this.denominator*a.denominator);
            rtFrac.minialFraction();
        return rtFrac;

    }
    public Fraction subtract(Fraction a)
    {
        Fraction rtFrac =new Fraction(this.numerator*a.denominator - a.numerator*this.denominator, 
        this.denominator*a.denominator);
        rtFrac.minialFraction();
        return rtFrac;

    }

    public Fraction multiply(Fraction a) {
        Fraction rtFrac = new Fraction(this.numerator*a.numerator, this.denominator*a.denominator);
        rtFrac.minialFraction();
        return rtFrac;
    }

    public Fraction divide(Fraction a) {
        Fraction rtFrac = new Fraction(this.numerator*a.denominator, this.denominator*a.numerator);
        rtFrac.minialFraction();
        return rtFrac;
    }

    public void minialFraction() {
        if(denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        int gcd = Utils.GCD(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator/= gcd;

    }
    public String toString() {
        String out;
        if(denominator == 1) {
            out = "" + numerator;
        } else {
            out = numerator + "/" + denominator;
        }
        return out;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Fraction) {
            Fraction b = (Fraction) obj;
            b.minialFraction();
            return numerator*b.denominator == denominator*b.numerator;
        } else {
            return false;
        }
        
       
    }

}