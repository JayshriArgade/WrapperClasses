package WrapperClasses;

import java.util.Arrays;

public class OneDimArrayAsc {

	public static void main(String[] args)
	{
		int arr[] = {99,12,34,23,78,56,89,45};
		System.out.println("Given array is = ");
		for(int i : arr)
		{
			System.out.print(i+"  ");
		}
		System.out.println();System.out.println();
		
		int max=arr[0], min=arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			max = Math.max(max, arr[i]);
		    min = Math.min(min, arr[i]);
		}
		
		System.out.println("Larger number from array = "+max);
		System.out.println();
		System.out.println("Smaller number from array = "+min);
		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.println("Array in Ascending order ");
		for(int i : arr)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		
		
	}

}
