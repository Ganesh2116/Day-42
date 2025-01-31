/*
 Q14.Write a Java program to find maximum product of two integers in a given array of integers.

 Example:
 Input :
 nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
 Output:
 Pair is (7, 8), Maximum Product: 56
*/

class Question14
{
	public static void main(String[] arge)
	{
	int nums[] = { 2, 3, 5, 7, -7, 5, 8, -5 };
	
	for (int i=0;i<nums.length;i++)
	{
		for (int j=i+1;j<nums.length;j++)
		{
			if (nums[i]<nums[j])
			{
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				
			}
		}
	}
	
	System.out.println("Maximun product is : "+(nums[0]*nums[1]));
	}
}