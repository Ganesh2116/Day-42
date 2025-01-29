/*
Q12.Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

Note: If the element is not present in the array return {-1,-1} as pair.

Example 1:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.
*/
import java.util.Scanner;

class ArrayQ12
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	int a[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
	
	System.out.println("Which elements occurance you want to see :");
	int x = sc.nextInt();

	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i]>a[j])
			{
				int temp = a[i];	
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	
	for (int i=0;i<a.length;i++)
	{
		if (x == a[i])
		{
			System.out.print("Start: "+i);
			break;
		}		
	}

	
	for (int i=a.length-1;i>=0;i--)
	{
		if (x == a[i])
		{
			System.out.print(" end: "+i);
			break;
		}		
	}


	
	}
}