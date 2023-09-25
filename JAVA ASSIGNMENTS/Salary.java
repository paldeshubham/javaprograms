import java.util.*;

import javax.swing.text.StyledEditorKit;
class Employee
{
    int id;
    long  mobile_no;
    String name,mail_id,address;
    Scanner sc=new Scanner(System.in);

    void getdata()
    {
        System.out.println("Enter id of Employee:");
        id = sc.nextInt();
        System.out.println("Enter Mobile no of employee:");
        mobile_no = sc.nextLong();
        System.out.println("Enter name of employee:");
        name=sc.next();
        System.out.println("Enter employees mail id:");
        mail_id= sc.next();
        System.out.println("Enter adress of employee");
        address=sc.next();
    }

    void display()
    {
        System.out.println("Employee id is:"+id);;
        System.out.println("Employee name is :"+name);
        System.out.println("Employee Mobile no is:"+mobile_no);
        System.out.println("Employee mail id is: "+mail_id);
        System.out.println("Employee address is:"+address);
    }

}
class Programmer extends Employee{
    double gross_salary;
    double net_salary;
    double bp, hra,  clubfees , pf, da;
    void programsalary( )
    {
        // 97%da,10%hra,12%pf,0.1%scf;
        System.out.println("Enter basic saalry salary of programmer:");
        bp=sc.nextDouble();
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        clubfees=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+clubfees));


    }
}
class Teamlead extends Employee{
    double gross_salary;
    double net_salary;
    double bp, hra,clubfees , pf, da ;
    void teamleadsalary( )
    {
        // 97%da,10%hra,12%pf,0.1%scf;
        System.out.println("Enter basic saalry salary of programmer:");
        bp=sc.nextDouble();
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        clubfees=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+clubfees));


    }
}
class Asspromanager extends Employee{
    double gross_salary;
    double net_salary;
    double bp, hra,clubfees , pf, da ;
    void Promanagersalary()
    {
        // 97%da,10%hra,12%pf,0.1%scf;
        System.out.println("Enter basic saalry salary of programmer:");
        bp=sc.nextDouble();
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        clubfees=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+clubfees));
    }
}

class Projectmanager extends Employee{
    double gross_salary;
    double net_salary;
    double bp, hra,clubfees , pf, da ;
    void projectmanagersalary( )
    {
        // 97%da,10%hra,12%pf,0.1%scf;
        System.out.println("Enter basic saalry salary of programmer:");
        bp=sc.nextDouble();
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        clubfees=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+clubfees));
    }
}
class salary{
    public static void main(String[]args)
    {
        int ch;
        Scanner sc=new Scanner (System.in);
        System.out.println("\n 1.programer Salary \n 2.Teamlead Salary \n 3.Assistant Project Manager Salary \n 4.PRoject manager Salary\n");
        System.out.println("Enter The number whose salary do you want choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            Programmer obj=new Programmer();
            obj.getdata();
            obj.display();
            obj.programsalary();
            break;

            case 2:
            Teamlead obj2 = new Teamlead();
            obj2.getdata();
            obj2.display();
            obj2.teamleadsalary();
            break;

            case 3:
            Asspromanager obj3= new Asspromanager();
            obj3.getdata();
            obj3.display();
            obj3.Promanagersalary();
            break;

            case 4:
            Projectmanager obj4 = new Projectmanager();
            obj4.getdata();
            obj4.display();
            obj4.projectmanagersalary();
            break;

            default:
            break;



        }
        

    }
}

