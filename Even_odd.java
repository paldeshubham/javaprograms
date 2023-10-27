import java.util.*;

public class Even_odd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
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
    }
    
}
