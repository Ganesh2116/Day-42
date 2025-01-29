/*
1.Write a Java program to find maximum product of two integers in a given array of integers.
*/

class ArrayQ1
{
	public static void main(String[] arge)
	{
	int a[] = {1,2,3,5,4,6,9,8,7,4,5,6,2,1};
	
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] <a[j])
			{
				int temp  = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
	}
	
	System.out.println("Maximum product is :"+a[0]*a[1]);
	}
}