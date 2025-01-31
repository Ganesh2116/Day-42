/*
3.Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.  

Example:
Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]
*/

class ArrayQ3
{
	public static void main(String[] arge)
	{
	int a[] = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
	
	for (int i=1;i<a.length-1;i=i+2)
	{
		int temp = a[i];
		a[i] = a[i+1];
		a[i+1] = temp;
	}
	
	System.out.println("rearrange array :");
	for (int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");		
	}

	}
}
