/*
8. Move all negative numbers to beginning and positive to end with constant extra space
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/

class Question8
{
	public static void main(String[] arge)
	{
	int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6};
	int arrt[] = new int[arr.length];

	int x = 0;
	for (int i=0;i<arrt.length;i++)
	{
		if (arr[i]<0)
		{
			arrt[x]=arr[i];
			x++;
		}
	}
	
	for (int i=0;i<arrt.length;i++)
	{
		if (arr[i]>0)
		{
			arrt[x]=arr[i];
			x++;
		}
	}

	
	System.out.print("Output array is:");
	for (int i=0;i<arrt.length;i++)
	{
		System.out.print(arrt[i]+" ");
	}
	}
}