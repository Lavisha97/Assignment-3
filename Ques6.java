import java.util.Scanner;
class Sort
{
	public static void main(String args[])
	{
		/*System.out.println("Enter the size of array");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the "+i+" value of arr");
			int arr[i] = sc.nextInt();
		}*/
		
		int temp;
		int arr[] = new int[8];
		arr[0]=1;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=0;
		arr[5]=0;
		arr[6]=1;
		arr[7]=0;
		
		for(int i = 0; i < 8 ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array is: "+arr[0]+" , "+arr[1]+" , "+arr[2]+" , "+arr[3]+" , "+arr[4]+" , "+arr[5]+" , "+arr[6]+ " , "+arr[7]);
		
	}
}