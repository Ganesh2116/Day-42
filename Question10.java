/*
Q10. Program to cyclically rotate an array by one
Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
*/


class Question10
{
	public static void main(String[] arge)
	{
	int arr[] = {1, 2, 3, 4, 5};
	
	int temp = arr[arr.length-1];
	for (int i=arr.length-1;i>0;i--)
	{
		int tempa = arr[i];
		arr[i] = arr[i-1];
		arr[i-1] = temp;	

	}
	arr[0] = temp;
	
	for (int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
}