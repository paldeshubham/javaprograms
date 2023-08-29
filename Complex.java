import java.util.*;
public class Complex
{	
	public static void main(String[] args)
	{
	int c1,c2,sum,diff;
		
		Scanner sc =new Scanner(System.in);
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		
		System.out.print( "First complex number :");
		
		System.out.println( a1 + " + " + b1 + "i ");
		System.out.print( "Second complex number :");
		System.out.println( a2 + " + " + b2 + "i ");
		
		System.out.print( "Addition :");
		
		System.out.println( (a1+a2) + " + " + (b1+b2) + "i ");
		System.out.print( "Subtraction :");
		
		if(b1>b2)
		{
			System.out.println( (a1-a2) + "+" + (b1-b2) + "i ");
		}
		else
		{
			System.out.println( (a1-a2) + " " + (b1-b2) + "i ");
		}
		
	}
}
