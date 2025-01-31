/*
4.Write a Java program to replace each element of the array with product of every other element in a given array of integers.

Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]
*/

class ArrayQ4
{
	public static void main(String arg[])
	{
	int nums1[] = { 1, 2, 3, 4, 5, 6, 7};
	//int nums2[] = {0, 1, 2, 3, 4, 5, 6, 7};
	int product = 1;
	int zeroCount = 0;
	

	// first way
	for (int i=0;i<nums1.length;i++)
	{
		if (nums1[i] != 0)
		{
			product = product*nums1[i];
		}
		else 
		{
			zeroCount++;		
		}
	}
	
	int nums3[] = new int[nums1.length];

	for (int i=0;i<nums3.length;i++)
	{
		if (zeroCount >1)
		{
			nums3[i] = 0;
		}
		else if (zeroCount == 1)
		{
			if (nums3[i] == 0)
			{
				nums3[i] = product;
			}
			else 
			{
				nums3[i] = 0;	
			}
			
		}
		else
		{
			nums3[i] = product/nums1[i];
		}
	}
	
	System.out.println("First way to :");
	for (int i=0;i<nums3.length;i++)
	{
		System.out.print(nums3[i]+" ");	
	}
	
	// 2nd way 
	int nums4[] = new int[nums1.length];
	
	for (int i=0;i<nums1.length;i++)
	{
		int dproduct = 1;
		for (int j=0;j<nums1.length;j++)
		{
			if (i==j)
			{
				continue;
			}
			else 
			{
				dproduct = dproduct*nums1[j];
			}
				
		}
		nums4[i] = dproduct;
	}
	
	System.out.println("\n2nd way to :");
	for (int i=0;i<nums4.length;i++)
	{
		System.out.print(nums4[i]+" ");	
	}
	}
}