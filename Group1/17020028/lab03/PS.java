public class PS
{
    int ts, ms;

    public PS(int ts, int ms)
    {
        this.ts = ts;
        this.ms = ms;
        simplify();
    }

    private void simplify()
    {
        int d = GreatestCommonDivisor.gcd(ts, ms);
        ts /= d;
        ms /= d;
    }  

    public PS plus(PS another)
    {
        return new PS(ts*another.ms + another.ts*ms, ms*another.ms);
    }

    public PS minus(PS another)
    {
        return new PS(ts*another.ms - another.ts*ms, ms*another.ms);
    }

    public PS times(PS another)
    {
        return new PS(ts*another.ts, ms*another.ms);
    }

    public PS by(PS another)
    {
        return new PS(ts*another.ms, ms*another.ts);
    }

    public boolean equalsTo(Object object)
    {
        if (object instanceof PS)
        {
            PS another = (PS) object;
            return ts*another.ms == another.ts*ms;
        }
        else return false;
    }

    public static void main(String[] args) {
        PS a = new PS(5, 4);
        PS b = new PS(8, 24);
        PS c;
        c = a.plus(b);
        System.out.println(c.ts + " " + c.ms);
        c = a.minus(b);
        System.out.println(c.ts + " " + c.ms);
        c = a.times(b);
        System.out.println(c.ts + " " + c.ms);
        c = a.by(b);
        System.out.println(c.ts + " " + c.ms);
    }

}