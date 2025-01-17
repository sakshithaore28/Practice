package java_test;

import java.util.Scanner;

public class ProductOfArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arrSize=sc.nextInt();
		
		int nums[]=new int[arrSize];
		for(int i=0;i<nums.length;i++) nums[i]=sc.nextInt();
		for(int i=0;i<nums.length;i++)
		{
			int product=1;
			for(int j=1;j<nums.length;j++)
			{
				if(nums[i]!=nums[j]) product*=nums[j];
			}
			System.out.println(product);
		}
		
		
	}
}
