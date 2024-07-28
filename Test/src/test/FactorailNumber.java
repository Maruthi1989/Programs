package test;

public class FactorailNumber {

	public static void main(String[] args) 
	{
		factorailNumber(5);

	}
	
	
	static void factorailNumber(int num)
	{
		int fact=1;
		
		for(int i=1;i<num;i++) 
		{
		
			fact*=i;
		}
		
		System.out.println(fact);
		
	}

}
