package WrapperClasses;

public class BooleanClassMethods {

	public static void main(String[] args) 
	{
		System.out.println(Boolean.compare(true, false)); //Compares two boolean values
		
		System.out.println(Boolean.toString(false)); //Returns a String object representing the specified boolean
		
		System.out.println(Boolean.logicalAnd(true, true)); //Returns the result of applying the logical AND operator to the specified boolean operands.
		
		System.out.println(Boolean.logicalOr(false, false)); //Returns the result of applying the logical OR operator to thespecified boolean operands.
		
		System.out.println(Boolean.valueOf(true)); //Returns a Boolean instance representing the specified boolean value
		
		Boolean b = false;
		System.out.println(Boolean.valueOf(b));
	}

}
