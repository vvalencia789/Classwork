
public class OverloadingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Overloading = two methods with the same name 
		int num=doubleNumber(4);
		System.out.println(num);
		
		double numD;
		numD=doubleNumber(4.5);
		System.out.println(numD);
		numD=doubleNumber("One");
		
		double numDE=doubleNumber(3,4);
		System.out.println(numDE);
		
		
	}
	
	public static int doubleNumber(int n)
	{
		int total=n*n;
		return total;
				
	}
	
	public static double doubleNumber(double n)
	{
		double total=n*n;
		return total;
		 
	}
	public static double doubleNumber(double n, double m)
	{
		double total=(n+m)*(n+m);
		return total;
		
	}
	
	public static double doubleNumber(String n)
	{
		System.out.println("Can't calculate a string");
		return 0;
		
	}

}
