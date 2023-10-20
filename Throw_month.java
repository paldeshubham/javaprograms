import java.util.*;
class  Throw_month{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("Enter the month:");
        month= sc.nextInt();
        if(month>12)
        {
            throw new ArithmeticException("Invalid month");
        }
        else
        {
            System.out.println("The given month is: "+month);
        }
    }
}