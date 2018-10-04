class Tuan3{
    public void UCLN(int a, int b){
        int result = 0;
        if (a >= b){
            for(int i = 1; i <= b; i++){
                if ((a % i == 0) && (b % i == 0)){
                    result = i;
                }
            }
        }
        else{
                for(int i = 1; i <= a; i++){
                    if ((a % i == 0) && (b % i == 0)){
                        result = i;
                    }
                }
            }
        System.out.println(result);
        }
    public void Fibonaxi(int a){
        int array[] = new int[a];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= a; i++){
            array[i] = array[i-1] + array[i-2];
        }
        System.out.println(array[a]);
    }
	public static void main(String[] args){
        Tuan3 pro = new Tuan3();
        int a = 5;
        int b = 40;
        pro.Fibonaxi(a);
        pro.UCLN(a,b);
    }
}
