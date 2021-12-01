package WrapperClasses;

public class IntegerClassMethods {

	public static void main(String[] args)
	{
		
		System.out.println(Integer.compare(12, 13)); //Returns value=0 if(x==y); a value<0 if(x<y); and a value>0 if(x>y)
		
		System.out.println(Integer.SIZE); //The number of bits used to represent an int value in two's complement binary form
		
		System.out.println(Integer.max(45, 54)); //Returns the greater of two int values
		
		System.out.println(Integer.min(45, 54)); //Returns the smaller of two int values
		
		String str3 = "456";
		System.out.println(Integer.parseInt(str3)); //Parses the string argument as a signed decimal integer
		
		System.out.println(Integer.reverse(34)); //the value obtained by reversing order of the bits in the specified int value
		
		System.out.println(Integer.sum(12, 10)); //Adds two integers together as per the + operator
		
		int a=90;
		System.out.println(Integer.valueOf(a)); //Returns an Integer instance representing the specified int value
		
	}

}
