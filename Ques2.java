import java.util.Scanner;
class Even
{
	public static void even(int n)
	{
		for(int i = 0 ; i <= n ; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
			even(a);
	}
}