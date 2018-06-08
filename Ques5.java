import java.util.Scanner;
class Reverse
{
	public static void rev(int n)
	{
		int z , y , sum = 0;
		z = n;
		while(z != 0)
		{
			y = z % 10;
			z = z/10;
			sum = sum *10 + y;
		}
		System.out.println(sum);
	}
	
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		rev(a);
	}
}