package com.company;

public class PhanSo {
    private int ts;
    private int ms;

    public PhanSo(PhanSo ps) {
        {
            this.ms=ps.ms;
            this.ts=ps.ts;
        }
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public int getTs() {
        return ts;
    }

    public int getMs() {
        return ms;
    }
    public void print()
    {
        if (ms==1)
        {
            System.out.print(ts);
            return;
        }
        System.out.print(ts + "/" + ms);
    }
    public void println()
    {
        if (ms==1)
        {
            System.out.println(ts);
            return;
        }
        System.out.println(ts + "/" + ms);
    }
    public void toiGian()
    {
        int a= ts;
        int b= ms;
        a= (a<0) ? -a : a;
        b= (b<0) ? -b : b;
        while (a!=b)
        {
            if (a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        setMs(ms/a);
        setTs(ts/a);
    }
    public PhanSo add(PhanSo ps)
    {
        PhanSo result = new PhanSo(ts*ps.ms + ps.ts*ms,ms*ps.ms);
        result.toiGian();
        return result;
    }
    public PhanSo tru(PhanSo ps)
    {
        PhanSo result = new PhanSo(ts*ps.ms - ps.ts*ms,ms*ps.ms);
        result.toiGian();
        return result;
    }
    public PhanSo nhan(PhanSo ps)
    {
        PhanSo result = new PhanSo(ts*ps.ts,ms*ps.ms);
        result.toiGian();
        return result;
    }
    public PhanSo chia(PhanSo ps)
    {
        PhanSo result = new PhanSo(ts*ps.ms,ms*ps.ts);
        result.toiGian();
        return result;
    }
    public boolean equals(Object obj)
    {
        if (this == obj){
            return true;
        }
        if (this == null){
            return false;
        }
        if (obj instanceof PhanSo)
        {
            PhanSo other =(PhanSo) obj;
            return (other.ts*this.ms == this.ts*other.ms);
        }
            return false;

    }
}
