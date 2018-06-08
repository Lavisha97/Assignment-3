import java.util.Scanner;
class Prime
{
	public static void prime(int n)
	{
		int num = 1 , flag , i;
		while(num <= n)
		{
			flag = 0;
			i = 2;
		    while(i <= num/2 )
		    {
		    	if(num % i == 0)
		    	{
		    		flag++;
		    		break;
		    	}
		    	i++;
		    }
		    if(flag == 0 && num != 1 )
		    {
		    	System.out.println(num);
		    }
		    num++;
		}
	}
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
			prime(a);
	}
}