import java.util.*;
public class All_exception {
    public static void main(String[] args) {
        int ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("1.arithmetic exception");
        System.out.println("2.Null pointer exception");
        System.out.println("3.Number foramt exception");
        System.out.println("4.ArrayIndexOutOfBoundsException");
        System.out.println("enter your choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1://Arithmwetic exception
            try{
                int a=50/0;
            }
             catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occur");
            }
            break;

            case 2://Null pointer exception\
            try {
                String s=null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            }
            break;

            case 3://Number format Exception
            try {
                String s= "Shubham";
                int i= Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
            }
            break;

            case 4://Array index out of bound
            try {
                int b[]=new int[6];
                b[6]=50;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
    
        }
    }
}   


    

