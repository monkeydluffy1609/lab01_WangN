// This program shows how to design a simple function statement.


import java.text.DecimalFormat;

public class Function_WangN
{
	public static void main(String args[])
	{
		int x = 11;
		int y = 5;
		int radius = 5;
		DecimalFormat df = new DecimalFormat("#.##");
		String formatted = df.format(areaCircle(radius));


			
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
			{
				System.out.println("Sum of " + "i:" + i + " " + " and j:" + j + " equals " + addElements(i,j));
			}
		
		System.out.println( x + " divide by " + y + " has a remainder of " + findRemainder(x,y));
		System.out.println("Area of circle with radius " + radius + " is " + formatted);
	}
	
	// this function add two numbers
	public static int addElements(int a, int b)
	{
		int total = 0;
		total = a + b;
		return total;
	}
	
	// this function finds the remainder 
	public static int findRemainder(int c, int d)
	{
		int remainder = 0;
		remainder = c%d;
		return remainder;
	}

	// this function calculates the area of a circle
	public static double areaCircle(int e)
	{
		final double PI = 3.14159;
		double area = 0;
		area = PI * e * e;
		return area;
	}

}