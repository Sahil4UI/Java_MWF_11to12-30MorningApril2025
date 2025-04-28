
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Array is collection of homogenous(Same) type of data

//		int x[];
//		x = new int [5];

		
//		int x [] = new int[5];
		
//		int x[] = {1,2,3,4,5,896,7,8,9,10};
		
//		System.out.println(x);
//		it gives array address
		
//		for (int i=0;i<x.length;i++)
//		{
//			System.out.println(x[i]);
//		}
		
//		Write a program to find then sum of elements of array
//		int result = 0;
//		for (int i=0;i<x.length;i++)
//		{
//			result+=x[i];
//		}
//		System.out.println(result);
		
//		find the largest number from array
//		int x[] = {1,2,3000,4,5,896,7,8,9,10};
//		int large = x[0];
//		for (int i=1;i<x.length;i++)
//		{
//			if (large<x[i])
//			{
//				large = x[i];
//			}
//		}
//		System.out.println(large);
		
//		find the second largest number from the array
//		int x[] = {1,2,3000,4,5,896,7,8,9,10};
//		int large = x[0];
//		int s_large = x[1];
//		for (int i=2;i<x.length;i++)
//		{
//			if (large<x[i])
//			{
//				s_large = large;
//				large = x[i];
//			}
//			else if (s_large<x[i])
//			{
//				s_large = x[i];
//			}
//		}
//		System.out.println(large);
//		System.out.println(s_large);
		
//		remove duplicates from array
//		int x[] = {1,1,1,2,2,2,3,3,3,2,2,2,2,3,3,3,2,2,2,4,5,5,5};
//		int res[] = new int[x.length];
//		int found=0;
//		int j=0;
//		for (int i=0;i<x.length;i++)
//		{
//			for (j=0;j<res.length;j++)
//			{
//				if (x[i]==res[j])
//				{
//					found=1;
//					break;
//				}
//				else {
//					found=0;
//				}
//			}
//			
//			if (found==0)
//			{
//				res[i] = x[i];
//			}
//		}
//		
//		for (int i=0;i<x.length;i++)
//			{
//				if (res[i]!=0)
//				System.out.println(res[i]);
//			}
		
//		Sorting
		int x[] = {3,4,3,3,3,3,3,3,5,2,21,10,-100};
		for (int i=0;i<x.length-1;i++)
		{
			for (int j=i+1;j<x.length;j++)
			{
				if (x[i]>x[j])
				{
					int temp = x[i];
					x[i] =x[j];
					x[j] = temp;
				}
			}
		}
		
		for (int i=0;i<x.length;i++)
			{
				
				System.out.println(x[i]);
			}
		
		
	}

}
