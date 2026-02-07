import java.util.*;
class TwoDArray_OneDArray
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6}};
		int row=arr.length;
		int col=arr[0].length;
		
		int size=arr.length*arr[0].length;
		int OneD[]=new int[size];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				OneD[index]=arr[i][j];
				index++;
			}
		}
		System.out.println(Arrays.toString(OneD));
	}
}