// Program to check whether the no is prime or not
import java.util.*;
public class Primenum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a=sc.nextInt();
		int i=2;
		boolean flag=false;
		for(i=2;i<=a;++i)
		{
			if (a%2==0)
			{
				flag=true;
				break;
			}
		}
		if(flag!=true)
		{
			System.out.println("The Given number is prime no");
		}
		else
		{
			System.out.println("The Given no is not a prime no");	
		}
		
	}
}
