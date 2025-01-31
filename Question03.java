/*
Q3.Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
  Examples:
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]
*/

class Question03
{
	public static void main(String[] arge)
	{
	int arr[] = {1, 1, 2, 2, 2, 2, 3,};
	int x = 2;
	int count = 0;
	for (int i=0;i<arr.length;i++)
	{
		if (x == arr[i])
		{
			count++;
		}
	}
	
	System.out.println("Occurrences of x is :"+count);
	}
}