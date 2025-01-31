/*
2.Write a Java program to shuffle a given array of integers.  
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
*/

import java.util.Random;

class ArrayQ2
{
	public static void main(String[] arge)
	{
	Random ra = new Random();
	int a[] = { 1, 2, 3, 4, 5, 6 };
	
	System.out.println("Normal Array :");
	for (int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");		
	}

	
	for (int i=0;i<a.length;i++)
	{
		int j = ra.nextInt(i+1);
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;		
	}
	
	System.out.println("\nShuffle Array :");
	for (int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");		
	}
	
	}
}