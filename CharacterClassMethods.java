package WrapperClasses;

public class CharacterClassMethods {

	public static void main(String[] args)
	{
		char a = 's';
		
		System.out.println(Character.SIZE); //The number of bits used to represent a char value in unsigned binary form
		
		System.out.println(Character.compare('m', 'm')); //Compares two char values numerically. ( 0 , 1 , -1)
		
		System.out.println(Character.isLowerCase(a)); //Determines if the specified character is a lower case character
		
		char b = ' ';
		//System.out.println(Character.isSpace(b));The method isSpace(char) from the type Character is deprecated since version 1.1
		
		System.out.println(Character.isWhitespace(b)); //Determines if the specified character is white space according to Java
		
		System.out.println(Character.isSpaceChar(a)); //Determines if the specified character is a Unicode space character
		
		System.out.println(Character.digit('A', 65));
		
		char ch = '4';
	    int br = Character.getNumericValue(ch); //Returns the int value that the specified Unicode character represents
		System.out.println(br);
	}

}
