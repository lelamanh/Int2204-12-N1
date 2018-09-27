public class TestFraction
{
    public static void main(String[] args) 
    {
        Fraction a = new Fraction(2, 6);
        Fraction b = new Fraction(4, 15);
        Fraction c = a.addition(b);
        c.Write();
        System.out.println();
        c = a.subtraction(b);
        c.Write();
        System.out.println();

        c = b.subtraction(a);
        c.Write();
        System.out.println();

        c = a.multiplication(b);
        c.Write();
        System.out.println();

        c = a.division(b);
        c.Write();
        System.out.println();

        c = b.division(a);
        c.Write();
        System.out.println();

        Fraction d = new Fraction(-2, 3);
        Fraction e = new Fraction(2, -3);
        System.out.println(d.equals(e));

        d = new Fraction(4, 6);
        e = new Fraction(2, 4);
        System.out.println(d.equals("abc"));
    }
}