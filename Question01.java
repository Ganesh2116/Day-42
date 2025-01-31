/*Q1.Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.

 Note: For corner elements, we need to consider only one neighbor.

  Example:
 Input: array[]= {5, 10, 20, 15}
 Output: 20*/


class Question01
{
	public static void main(String[] arge)
	{
	int arr[] =  {10, 20, 15, 2, 23, 90, 67};
	
	System.out.println("Peak elements is:");
	if (arr[0] >arr[1])
	{
		System.out.print(arr[0]);
	}
		
	for (int i=1;i<arr.length;i++)
	{
		if (arr[i-1]<arr[i] && arr[i]>arr[i+1])
		{
			System.out.print(arr[i]+" ");
		}
	}

	}
}