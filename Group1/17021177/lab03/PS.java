/**
 * @Class Calculated with Fraction
 * @Author Phạm Thiên Long
 */
public class PS
{
    private int tuSo;
    private int mauSo;
    public Lab03Bt1 calculatedGCD = new Lab03Bt1();

    /*getter/setter cho tuSo*/
    public int getTuSo() {return tuSo;}
    public void setTuSo(int i) {this.tuSo = i;}

    /*getter/setter cho mauSo*/
    public int getMauSo() {return mauSo;}
    public void setMauSo(int i) {
        if (i == 0) {
            throw new Error("Fraction not found");
        }
        else {
            this.mauSo = i;
        }
    }


    /*Khoi tao PS voi tu so va mau so biet truoc*/
    public PS(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    /*Khoi tao PS voi gia tri mac dinh*/
    public PS() {
        this.tuSo = 8;
        this.mauSo = 6;
    }

    /*
    * Calculated the Sum of 2 Fractions
    * */
    public void sumFractions(PS firstFraction)
    {
        PS sumFraction = new PS();

        int i = firstFraction.getTuSo()*this.getMauSo() + firstFraction.getMauSo()*this.getTuSo();
        sumFraction.setTuSo(i);

        sumFraction.setMauSo(firstFraction.getMauSo() * this.getMauSo());

        sumFraction.MinimalFraction();

        System.out.println(sumFraction.getTuSo() + "/" + sumFraction.getMauSo());
    }

    /*
    * Calculated the Sub of 2 Fractions
    * */
    public void subFractions(PS firstFraction)
    {
        PS subFraction = new PS();

        int i = firstFraction.getTuSo()*this.getMauSo() - firstFraction.getMauSo()*this.getTuSo();
        subFraction.setTuSo(i);
        subFraction.setMauSo(firstFraction.getMauSo() * this.getMauSo());

        subFraction.MinimalFraction();

        System.out.println(subFraction.getTuSo() + "/" + subFraction.getMauSo());
    }

    /*
    * Calculated the Mul of 2 Fractions
    * */
    public void mulFractions(PS firstFraction)
    {
        PS mulFraction = new PS();

        mulFraction.setTuSo(firstFraction.getTuSo()*this.getTuSo());
        mulFraction.setMauSo(firstFraction.getMauSo()*this.getMauSo());

        mulFraction.MinimalFraction();

        System.out.println(mulFraction.getTuSo() + "/" + mulFraction.getMauSo());
    }

    /*
    * Calculated the Div of 2 Fractions
    * */
    public void divFractions(PS firstFraction)
    {
        PS divFraction = new PS();

        divFraction.setTuSo(firstFraction.getTuSo()*this.getMauSo());
        divFraction.setMauSo(firstFraction.getMauSo()*this.getTuSo());

        divFraction.MinimalFraction();

        System.out.println(divFraction.getTuSo() + "/" + divFraction.getMauSo());
    }

    /*Toi gian phan so va toi uu hoa dau "-" */
    public PS MinimalFraction()
    {
        /*Toi gian phan so*/
        int a = calculatedGCD.USCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / a);
        this.setMauSo(this.getMauSo() / a);

        /*Chuan hoa dau "-" o mau so*/
        if (this.getMauSo() < 0 && this.getTuSo() > 0)
        {
            this.setMauSo(Math.abs(this.getMauSo()));
            this.setTuSo(0 - this.getTuSo());
        }

        else if (this.getMauSo() < 0 && getTuSo() < 0)
        {
            this.setMauSo(Math.abs(this.getMauSo()));
            this.setTuSo(Math.abs(this.getTuSo()));
        }

        return this;
    }

    /*So sanh 2 phan so*/
    public boolean equals (Object obj)
    {
        if (obj instanceof PS)
        {
            ((PS) obj).MinimalFraction();
            PS other = (PS) obj;
            other.MinimalFraction();
            return (this.tuSo == other.tuSo) && (this.mauSo == other.mauSo) ;
        }

        else
            return false;
    }

    public static void main(String[] args)
    {
        PS canculatedPS = new PS();
        PS firstFraction = new PS(10, 8);
        firstFraction.MinimalFraction();
        System.out.println(firstFraction.getTuSo() + " " + firstFraction.getMauSo());

        PS secondFraction = new PS(4, 2);
        secondFraction.MinimalFraction();

        canculatedPS.sumFractions(firstFraction);
        canculatedPS.subFractions(firstFraction);
        canculatedPS.divFractions(firstFraction);
        canculatedPS.mulFractions(firstFraction);

        boolean compareFraction = firstFraction.equals(secondFraction);
        System.out.println(compareFraction);
    }
}
