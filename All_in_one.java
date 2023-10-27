import java.util.*;
public class All_in_one {
    public static void main(String[] args) {
        int ch;
        Scanner sc= new Scanner (System.in);
        System.out.println("1.Even or odd ");
        System.out.println("2.Prime Number checker");
        System.out.println("3.palindrome or not");

        System.out.print("Enter your choice:");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
            int n;
            
            System.out.print("Enter the number to be checked which is even or odd:");
            n=sc.nextInt();
            if(n%2==0)
            {
                System.out.println(n+" is an even number");
            }
            else
            {
                System.out.println(n+" is an odd number");
            }
            break;


            case 2:
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
            break;
            
            case 3:
            int r,num,temp;
            int sum=0;
            System.out.println("Enter the number to be check which is palindrome or not:");
            num=sc.nextInt();

            temp=num;
            while(num>0)
            {
                 r=num%10;
                sum=(sum*10)+r;
                num=num/10;
            }

            if(temp==sum)
            {
                System.out.println(temp+" is a palindrome number");
            }
            else
            {
                System.out.println(temp+" is not a palindrome");
            }
            break;


        
            default:
                break;
        }
        
    }
}
