import java.util.Scanner;
class Pattern
{
	public static void Pat(int n)
	{
		for(int i = n ; i >= 1 ; i--)
		{
			for(int j = 1 ; j <=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		Pat(a);
	}
}