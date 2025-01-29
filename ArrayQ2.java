/*
2.Write a Java program to shuffle a given array of integers.  
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
*/
/*
Q3.Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array.
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
*/


class ArrayQ2
{
	public static void main(String[] arge)
	{
	int a[]  = {1,3,2,5,2,2,2};
	 
	for (int i=0;i<a.length;i++)
	{
		int lsum = 0;
		int rsum = 0;

		for (int j=0;j<i;j++)
		{
			lsum = lsum +a[j];
			
		}
		 		
		for (int k=i+1;k<a.length;k++)
		{
			rsum = rsum +a[k];
			
		}
		
		
		if (lsum == rsum)
		{
			System.out.println("output Equilibrium index : "+i);
			System.out.println("output Equilibrium position is  : "+(i+1));
			System.out.print("output Equilibrium elements is : "+a[i]);
			break;
		}
		
	}
	
	
	}
}