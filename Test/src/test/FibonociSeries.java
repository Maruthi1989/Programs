package test;

public class FibonociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonociSeries(10);

	}
	
	
	static void fibonociSeries(int num) {
		
		
		int n=0;
		int n1=1;
		
		System.out.println(n+"\n"+n1);
		
		for(int i=2;i<num;i++)
		{
			
			int n2=n+n1;
			n=n1;
			n1=n2;
			
			System.out.println(n2);
			
		}
		
		
		
		
	}

}
