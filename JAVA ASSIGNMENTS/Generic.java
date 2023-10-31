import java.util.*;
public class Generic {
        public static void main(String[] args) {
            int ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("1.check even or odd");
            System.out.println("2.check prime or not");
            System.out.println("3.check palindrome or not");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch (ch) {
                case 1://even or not
                    int n;
                    System.out.println("enter the number you want to check:");
                    n=sc.nextInt();
                    ArrayList<Integer> number = new ArrayList<>(); 
                    number.add(n);
                    System.out.println(number);
                    if(n%2==0)
                    {
                        System.out.println(number+" is an even number");
                    }
                    else
                    {
                        System.out.println(number+" is an odd number");
                    }
                    
                    break;
                case 2://prime or not
                    ArrayList<Integer> number1 = new ArrayList<>();
                    System.out.print("Enter the value of a:");
		            int a=sc.nextInt();
                    number1.add(a);
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
		            if(flag==true)
		            {
			            System.out.println("The Given number is not prime no");
		            }
		            else
		            {
			            System.out.println("The Given no is a prime no");	
		            }
                    break;

                case 3://palindrome or not
                    int num,r,temp;
                    ArrayList<Integer> number2 = new ArrayList<>();
                    int sum=0;
                    System.out.println("Enter the number to be check which is palindrome or not:");
                    num=sc.nextInt();
                    number2.add(num);

                    temp=num;
                    
                    while(num>0)
                    {
                        r=num%10;
                        sum=(sum*10)+r;
                        num=num/10;
                    }

                    if(temp==sum)
                    {
                        System.out.println(number2+" is a palindrome number");
                    }
                    else
                    {
                        System.out.println(number2+" is not a palindrome");
                    }
                    break;
                    
                    

            
                default:
                    break;
            }
        }  
}