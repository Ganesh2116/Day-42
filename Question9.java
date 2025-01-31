/*
Q9.Union and Intersection of two sorted arrays
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
Output: Union : {1, 2, 3, 4, 5, 6, 7}
         Intersection : {3, 5}

Input: arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10}
Output: Union : {2, 4, 5, 6, 8, 10}
         Intersection : {6}
*/

class Question9
{
	public static void main(String[] arge)
	{
	int arr1[] = {1, 3, 4, 5, 7};

	int arr2[] = {2, 3, 5, 6};
	
	int uninter[] = new int[arr1.length+arr2.length];

	for (int i=0;i<arr1.length;i++)
	{
		uninter[i]=arr1[i];
		
	}
		
	for (int i=0;i<arr2.length;i++)
	{
		uninter[arr1.length+i]=arr2[i];
		
	}
	
	System.out.println("\nIntersection Arrays is :");
	for (int i=0;i<uninter.length;i++)
	{
		for (int j=i+1;j<uninter.length;j++)
		{	
			if (uninter[i] == uninter[j])
			{
				System.out.print(uninter[i]+" ");
			}
		}
	}

	
	System.out.println("\nUnion Arrays is :");
	for (int i=0;i<uninter.length;i++)
	{
		for (int j=i+1;j<uninter.length;j++)
		{
			if (uninter[i] == uninter[j])
			{
				uninter[i] = -1;
			}
		}
	}
		
	for (int i=0;i<uninter.length;i++)
	{
		if (uninter[i] != -1)
		{
				System.out.print(uninter[i]+" ");
		}
	}	

	}
}