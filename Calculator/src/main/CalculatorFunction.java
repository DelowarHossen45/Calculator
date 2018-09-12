package main;

public class CalculatorFunction {
	public static int addition(int num1,int num2)
	
	{
		return num1+num2;
		
	}
	public static int subtraction(int num1,int num2)
	
	{
		return num1-num2;
		
	}
	public static void main(String arg[])
	{
		int add,sub;
		add=addition(10,20);
		sub=subtraction(20,10);
		System.out.println(add);
		System.out.println(sub);
	}
}
