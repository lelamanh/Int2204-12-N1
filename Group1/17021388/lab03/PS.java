class PS {
	//khai bao thuoc tinh lop PS
    private int numerator;
    private int denomirator;
	// phuong thuc get/set cho cac doi tuong
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    PS(int numerator,int denomirator) {
        this.numerator = numerator;
        this.denomirator = denomirator;
    }
    public int getDenomirator() {
        return denomirator;
    }
    public void setDenomirator(int denomirator) {
        this.denomirator = denomirator;
    }
	// Cong 2 phan so
    public void PlusPS(PS a, PS b) {
        int denomirator1 = a.denomirator * b.denomirator;
        int numerator1 = a.numerator * b.denomirator + a.denomirator * b.numerator;
        System.out.println(numerator1 + " / " + denomirator1);
    }
    // Tru 2 phan so
    public void MinusPS(PS a, PS b){
        int denomirator1 = a.denomirator * b.denomirator;
        int numerator1 = a.numerator * b.denomirator - a.denomirator * b.numerator;
        System.out.println(numerator1 + " / " + denomirator1);
    }
	// Nhan 2 phan so
    public void MultiplyPS(PS a, PS b){
        int denomirator1 = a.denomirator * b.denomirator;
        int numerator1 = a.numerator * b.numerator;
        System.out.println(numerator1 + " / " + denomirator1);
    }
	// Chia 2 phan so
    public void dividePS(PS a, PS b){
        int denomirator1 = a.denomirator * b.numerator;
        int numerator1 = a.numerator * b.denomirator;
        System.out.println(numerator1 + " / " + denomirator1);
    }
	// kiem tra 2 phan so 
    public boolean equals(PS a, PS b){
		int denomirator1 = a.denomirator * b.denomirator;
        int numerator1 = a.numerator * b.denomirator - a.denomirator * b.numerator;
		double result =(double) numerator1 / denomirator1;
        if (result > 0){
            return true;
        }else{return false;}
    }
	public static void main(String[] args){
		PS a = new PS(2,3);
		PS b = new PS(3,5);
		System.out.println(a.equals(a,b));
	}
}