package WrapperClasses;

import java.util.Arrays;

public class ArrayClassMethods {

	public static void main(String[] args) 
	{
		int a[] = {12,23,45,67,92,34};
		
		Arrays.sort(a);
		for(int i=0 ; i<a.length ; i++)
			   System.out.print(a[i]+"  ");
		
		System.out.println();
		
		System.out.println(Arrays.binarySearch(a, 34)); //Returns index value of searched key
		
		int b[] = Arrays.copyOf(a, 4);  //Copies the specified array, truncating with zeros so the copy has the specified length
		for(int i=0 ; i<b.length ; i++)
		   System.out.print(b[i]+"  ");
		
		System.out.println();
		
		int[] c = Arrays.copyOfRange(a, 2, 5); //Copies the specified range of the specified array into a new array
		for(int i=0 ; i<c.length ; i++)
			   System.out.print(c[i]+"  ");
		
		System.out.println();
		
		System.out.println(Arrays.equals(b, c)); //Returns true if the two specified arrays of int are equal to one another
		
		Arrays.fill(b, 85); //Assigns the specified int value to each element of the specified array of ints
		for(int i=0 ; i<b.length ; i++)
			   System.out.print(b[i]+"  ");
			
			System.out.println();
		
		String s = Arrays.toString(a);	//Returns a string representation of the contents of the specified array. 
		System.out.println(s);
	}

}
