import java.util.*;
public class Switch
{
	public static void main(String[] args)
	{
		int ch;
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the value of a:");		
		int a= sc.nextInt();
		System.out.print("Enter the value of b:");
		int b = sc.nextInt();
		
		do{
			System.out.println("1.Add");
			System.out.println("2.Substract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println(a+b);
					break;
				case 2:
					System.out.println(a-b);
					break;
				case 3:
					System.out.println(a*b);
					break;
				case 4:
					System.out.println(a/b);
					break;
				case 5:
					 System.exit(0);
					
					
			}
			
		}while(ch>0);
		
		
	}
}
