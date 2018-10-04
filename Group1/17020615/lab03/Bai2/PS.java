package Bai2;

import Bai1.Caculator;

import java.io.IOException;

public class PS {
    private int tu;
    private int mau;
    private int tu_RG;
    private int mau_RG;
    private static final Caculator c;

    static {
        c = new Caculator();
    }


    public PS(int tu, int mau) throws IOException {
        if (mau == 0)
            throw new IOException("Mau so bang khong.");
        if (mau < 0)
        {
            this.tu = -tu;
            this.mau = -mau;
        }
        else
        {
            this.tu = tu;
            this.mau = mau;
        }

        int GCD = c.getGCDOf(this.tu, this.mau);

        this.tu_RG = this.tu / GCD;
        this.mau_RG = this.mau / GCD;
    }

    public PS(PS _ps)
    {
        this.tu = _ps.tu;
        this.mau = _ps .mau;
        this.tu_RG = _ps.tu_RG;
        this.mau_RG = _ps.mau_RG;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;

        int GCD = c.getGCDOf(this.tu, this.mau);

        this.tu_RG = this.tu / GCD;
        this.mau_RG = this.mau / GCD;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) throws IOException {
        this.mau = mau;

        if (this.mau == 0)
            throw new IOException("Mau so bang khong.");

        int GCD = c.getGCDOf(this.tu, this.mau);

        this.tu_RG = this.tu / GCD;
        this.mau_RG = this.mau / GCD;
    }

    public PS cong(PS _ps)
    {
        PS temp1 = new PS(this);
        PS temp2 = new PS(_ps);

        int mauChung = temp1.mau * temp2.mau / c.getGCDOf(temp1.mau, temp2.mau);

        temp1.tu = temp1.tu * (mauChung / this.mau);
        temp2.tu = temp2.tu * (mauChung / _ps.mau);

        PS result = null;
        try {
            result = new PS(temp1.tu + temp2.tu, mauChung);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public PS tru(PS _ps)
    {
        PS temp1 = new PS(this);
        PS temp2 = new PS(_ps);

        int mauChung = temp1.mau * temp2.mau / c.getGCDOf(temp1.mau, temp2.mau);

        temp1.tu = temp1.tu * (mauChung / this.mau);
        temp2.tu = temp2.tu * (mauChung / _ps.mau);

        PS result = null;
        try {
            result = new PS(temp1.tu - temp2.tu, mauChung);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public PS nhan(PS _ps) {
        PS result = null;
        try {
            result = new PS(this.tu * _ps.tu, this.mau * _ps.mau);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public  PS chia(PS _ps)
    {
        PS result = null;
        try {
            result = new PS(this.tu * _ps.mau, this.mau * _ps.tu);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof PS))
        {
            return false;
        }
        else
        {
            PS _ps = (PS) obj;

            //return (this.tu_RG == _ps.tu_RG) && (this.mau_RG == _ps.mau_RG);

            return (this.tu * _ps.mau == this.mau*_ps.tu);
        }
    }

    public void print()
    {
        if(this.tu == 0)
        {
            System.out.println(0);
        }
        else if (this.mau == 1)
        {
            System.out.println(this.tu);
        }
        else
        {
            System.out.println(this.tu + "/" + this.mau);
        }
    }

    public void print_RG()
    {
        if (this.tu_RG == 0)
        {
            System.out.println(0);
        }
        else if (this.mau_RG == 1)
        {
            System.out.println(this.tu_RG);
        }
        else
        {
            System.out.println(this.tu_RG + "/" + this.mau_RG);
        }
    }
}
