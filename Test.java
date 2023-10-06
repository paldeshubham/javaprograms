 class Add {
    int a;
    int b;

    Add(int a,int b)
    {
        this.a=a;
        this.b=b;


    }
    void display()
    {
        System.out.println("addition of aand b is:"+(a+b));
    }
    
}
class Test{
    public static void main(String[] args)
    {
        Add A1=new Add(2,3);
        A1.display();
    }

}
