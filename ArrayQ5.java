/*
5. Write a Java program to find maximum difference between two elements in a given array of integers such that smaller element appears before larger element.

Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10
*/

class ArrayQ5
{
	public static void main(String[] arge)
	{
	int a[] = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
	
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i]>a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	
	System.out.println("The maximum diffrerebce between two elements of the said array elements is :"+(a[a.length-1]-a[0]));
	}
}