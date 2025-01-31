/*
Q9.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
  the element that occurs more than once and whose index of the first occurrence is the smallest.

Examples:

  Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
  Output: 5
*/

class Question09
{
	public static void main(String[] arge)
	{
	int arr[] = {10, 5, 3, 4, 3, 5, 6};
	
	for (int i=0;i<arr.length;i++)
	{
		int count=1;
		for (int j=i+1;j<arr.length;j++)
		{
			if (arr[i] == arr[j])
			{
				System.out.print("Repeating first element is :"+j);
				count++;
			}
		}
		if (count>1)
		{
			break;
		}
	}
		
	}
}