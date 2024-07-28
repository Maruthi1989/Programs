package test;

public class BiggestOf3Numbers {

	public static void main(String[] args) 
	{
		biggestOf3Numbers(10, 20, 30);

	}
	
	static void biggestOf3Numbers(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is the biggest of 3 numbers");
			}
			else
			{
				System.out.println("C is the biggest of 3 numbers");
			}
		}
		else if(b>c)
		{
			System.out.println("B is the biggest of 3 numbers");
		}
		else
		{
			System.out.println("C is the biggest of 3 numbers");
		}
	}

}
