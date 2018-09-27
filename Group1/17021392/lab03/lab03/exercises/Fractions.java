package lab03.exercises;

public class Fractions 
{
	private int numerator;
	private int denumerator;
	
	public Fractions(int numerator, int denumerator) 
	{
		this.numerator = numerator;
		
		if (denumerator == 0) 
		{
			System.out.println("Mau so cua phan so phai khac 0!");
		}
		else this.denumerator = denumerator;
	}
	
	public int getNumerator() 
	{
		return numerator;
	}
	
	public void setNumerator(int numerator) 
	{
		this.numerator = numerator;
	}
	
	public int getDenumerator() 
	{
		return denumerator;
	}
	
	public void setDenumerator(int denumerator) 
	{
		this.denumerator = denumerator;
	}
	
	public boolean equals(Object obj)
	{
		return (double) this.numerator/this.denumerator == (double) ((Fractions)obj).getNumerator()/((Fractions)obj).getDenumerator();
	}
	
}
