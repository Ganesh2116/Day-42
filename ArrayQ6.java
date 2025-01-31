/*
6. Find a peak element which is not smaller than its neighbours

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
*/

class ArrayQ6
{
	public static void main(String[] arge)
	{
	int a[] = {5, 10, 20, 15};
	int b[] = {10, 20, 15, 2, 23, 90, 67};

	System.out.println("Output Array A peak element is");
	for (int i=1;i<a.length-1;i++)
	{
		if (a[i-1]<a[i] && a[i]>a[i+1])
		{
			System.out.print(a[i]);
		}
	}
	
	System.out.println("\nOutput Array B peak element is");
	for (int i=1;i<b.length-1;i++)
	{
		if (b[i-1]<b[i] && b[i]>b[i+1])
		{
			System.out.print(b[i]+" ");
		}
	}
	}
}