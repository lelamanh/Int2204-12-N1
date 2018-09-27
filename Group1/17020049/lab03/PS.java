class PS {
    private int numerator;
    private int denominator;
 //constructers
    PS() {

    }
    PS(int numerator, int denominator) {
        if(denominator==0) 
            throw new IllegalArgumentException("Denominator can't be zero!");
        this.numerator = numerator;
        this.denominator = denominator;
    }
    PS(PS x) {
        this.numerator = x.numerator;  
        this.denominator = x.denominator;
    }

//setters

    public void setNum(int n) {
        numerator = n;
    }
    public void setDen(int d) {
        denominator = d;
    }

//getters

    public int getNum() {
        return numerator;
    }
    public int getDen() {
        return denominator;
    }

//reduce fraction method

    private void reduce(){
		if(numerator!=0) {
			GCD UCLN = new GCD();
			int gcd = UCLN.gcd(numerator, denominator);
			numerator = numerator/gcd;
			denominator = denominator/gcd;
		}
    }

//add two fracions and reduce

    public void add(PS x) {
        
        numerator = denominator*x.getNum() + numerator*x.getDen();
        denominator = denominator*x.getDen();
		reduce();
    }

//subtract two fractions and reduce

    public void subtract(PS x) {
        numerator = numerator*x.getDen()-x.getNum()*denominator;
        denominator = denominator*x.getDen();
		reduce();
    }

//multiply two fractions and reduce

    public void multiply(PS x) {
       
        numerator = numerator*x.getNum();
        denominator = denominator*x.getDen();
		reduce();
    }

 //divide two fractions and reduce

    public void divide(PS x) {
        if(x.numerator==0) 
            throw new IllegalArgumentException("Numerator can't be zero!");
        numerator = numerator*x.getDen();
        denominator = denominator*x.getNum();
		reduce();
    }

//Compare two fractions
    public boolean equals(Object obj) {
        if(obj instanceof PS) {
			PS other = (PS) obj;
			subtract(other);
			if(numerator==0) {
				return true;
			}
			else 
				return false;
			}	
		else
			return false;

}
}
