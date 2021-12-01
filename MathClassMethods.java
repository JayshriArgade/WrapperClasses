package WrapperClasses;

public class MathClassMethods {

	public static void main(String[] args) 
	{
		int a=45;
		int b=34;
		
		System.out.println(Math.PI); //Returns value of pi
		
		System.out.println(Math.abs(a)); //Returns the absolute value of an int value
		
		System.out.println(Math.addExact(a, b)); //Returns the sum of its arguments
		
		System.out.println(Math.decrementExact(a)); //Returns the argument decremented by one
		
		System.out.println(Math.incrementExact(b)); //Returns the argument incremented by one
		
		System.out.println(Math.max(a, b)); //Returns the greater of two int values
		
		System.out.println(Math.min(a, b)); //Returns the smaller of two int values
		
		System.out.println(Math.subtractExact(a, b)); //Returns the difference of the arguments
		
		System.out.println(Math.sqrt(256)); //Returns the correctly rounded positive square root of a double value
		
		System.out.println(Math.cbrt(125)); //Returns the correctly rounded positive cube root of a double value
		

	}

}
