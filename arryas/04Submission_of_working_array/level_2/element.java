import java.util.*;
class Element
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int maxDigit=10;
		int arr[]=new int[maxDigit];
		int index=0;
		while(num!=0){
			if(index==maxDigit)
			{
				break;
			}
			arr[index]=num%10;
			num=num/10;
			index++;
		}
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<index;i++){
			if(arr[i]>largest){
				secondLargest=largest;
				largest=arr[i];
				
				
			}
			else if(arr[i]>secondLargest && arr[i]!=largest)
			{
				secondLargest=arr[i];
			}
		}
		System.out.println("Larget digit:" +largest);
		System.out.println("Second largest digit:" +secondLargest);
	}
}