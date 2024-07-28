package test;

public class Polindrome {

	public static void main(String[] args) 
	{
		polindrome(121);

	}
	
	
	static void polindrome(int num)
	{
		
		int rem=0;
		int rev=0;
		int tmp=num;
		
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10+rem);
			num=num/10;
		}
		
		if(tmp==rev) 
		{
			System.out.println("The given number is polindrome");
		}
		else
		{
			System.out.println("The given number is not polindrome");
		}
	}

}
