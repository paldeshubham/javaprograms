import java.util.*;
public class Complex{
		public static void main(String[] args)
		{
			float a1,a2,b1,b2, c,d,a;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter value of a1:");
			a1=sc.nextFloat();
			System.out.print("Enter value of a2:");
			a2=sc.nextFloat();
			System.out.print("Enter value of b1:");
			b1=sc.nextFloat();
			System.out.print("Enter value of b2:");
			b2=sc.nextFloat();
			System.out.print("The first complex no is:");
			System.out.println(a1+"+"+b1+"i");
			System.out.print("The first complex no is:");
			System.out.println(a2+"+"+b2+"i");
			System.out.print("The first complex no is:");
			System.out.print("\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5. Exit \n");
			System.out.print("Enter your choice:");
			int ch= sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("The Addition of first Complex no and Second Complex no is:");
					System.out.println((a1+a2)+"+"+(b1+b2)+"i");
					break;
				case 2:
					System.out.print("The Addition of first Complex no and Second Complex no is:");
					if(b1>b2){
					System.out.println((a1-a2)+"+"+(b1-b2)+"i");
					}
					else{
					System.out.println((a1-a2)+""+(b1-b2)+"i");
					}
					break;
				case 3:
					System.out.print("The Multiplication of first Complex no and Second Complex no is:");
					System.out.print(((a1*a2)-(b1*b2))+"+"+((a1*a2)+(b1*b2))+"i");
					break;
				case 4:
					System.out.println("The Division Of first complex no and second complex no is:");
					a=(a2*a2) + (b2*b2);
					c=(a1*a2)+(b1*b2);
					d=(b1*a2)-(a1*b2);
					System.out.println((c/a)+"+"+(d/a)+"i");
				 	break;
				case 5:
					System.exit(0);	
			}
		}
}
