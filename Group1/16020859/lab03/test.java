/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author anhco
 */
 class PS {

    /**
     * @param args the command line arguments
     */
    private int tuso;
    private int mauso;
    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    
    public PS(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    
    public PS congps(PS a)
    {   
        this.tuso=(a.tuso*this.mauso+a.mauso*this.tuso);
        this.mauso=(a.mauso*this.mauso);
        return this;
    }
    public PS trups(PS a)
    {   
        
        this.tuso= this.tuso*a.mauso-a.tuso*this.mauso;
        this.mauso= this.mauso*a.mauso;
        return this;
    }
    public PS nhanps(PS a)
    {
        this.tuso=a.tuso*this.tuso;
        this.mauso=a.mauso*this.mauso;
        return this;
    }
    public PS chiaps(PS a)
    {
        this.tuso=a.mauso*this.tuso;
        this.mauso=a.tuso*this.mauso;
        return this;
    }
   
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof PS){
            PS other = (PS) obj;
            return this.tuso*other.mauso==this.mauso*other.tuso;
        }
        else return false;
    }
    
}

public class test
{
    public static void main(String[] args)
    {
        PS a= new PS(1,3);
        PS b= new PS(5,7);
        
          a.congps(b); 
        System.out.println("tử số:"+a.getTuso()+", mẫu số"+a.getMauso());
        
        a.trups(b);
        System.out.println("tử số:"+a.getTuso()+", mẫu số"+a.getMauso());
        a.nhanps(b);
        System.out.println("tử số:"+a.getTuso()+", mẫu số"+a.getMauso());
         a.chiaps(b);
        System.out.println("tử số:"+a.getTuso()+", mẫu số"+a.getMauso());
        
    }
}
