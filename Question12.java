/*
Q12. Count pairs with given sum
nput:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

Input:  arr[] = {1, 5, 7, -1, 5}, sum = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).
*/


class Question12
{
	public static void main(String[] arge)
	{
	int arr[] = {1, 5, 7, -1, 5};
	int sum = 6;
	
	System.out.println("Output is :");
	
	for (int i=0;i<arr.length;i++)
	{
		for (int j=i+1;j<arr.length;j++)
		{
			if ((arr[i]+arr[j]) == sum)
			{
				System.out.print("("+arr[i]+" "+arr[j]+") ");
			}
		}
	}
	
	}
}
