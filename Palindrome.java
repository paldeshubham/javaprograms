import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int r,num,temp;
        Scanner sc =new Scanner(System.in);
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






    }
    
}
