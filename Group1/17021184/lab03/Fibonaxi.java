public class Fibonaxi{
    private int[] a = new int[1000];
    
    public void setAi(int i, int j){
        this.a[i] = j;
    }

    public void calFibonaxi(){
        for(int i=0;i<998;i++) this.a[i+2] = this.a[i] + this.a[i+1];
    }

    public void getA(int i){
        System.out.println(this.a[i]);
    }

    public static void main(String[] args){
        Fibonaxi fibo = new Fibonaxi();
        fibo.setAi(0,0);
        fibo.setAi(1,1);
        fibo.calFibonaxi();
        fibo.getA(6);
    }
}