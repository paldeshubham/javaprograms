abstract class Shape{
    abstract public void compute_area(int a,int b);
    //abstract public void calculate_area();
}

class Triangle extends Shape{
    public  int base;
    public int height;
    public void compute_area(int base,int height)
    {
        //this.base=base;
        //this.height=height;
        System.out.println("the area of the Rectangle is:"+(0.5*base*height));
    }
    //public void calculate_area()
    //{
       // System.out.println("the area of the triangle is:"+(0.5*base*height));
    //}
}
class Rectangle extends Shape{
    public  int base;
    public int height;
    public void compute_area(int base,int height)
    {
        //this.base=base;
        //this.height=height;
        System.out.println("the area of the Rectangle is:"+(base*height));

    }
    //public void calculate_area()
    //{
        //System.out.println("the area of the Rectangle is:"+(base*height));
    //}
}

class Abstract
{
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.compute_area(24, 53);
        //t1.calculate_area();
        Rectangle r1= new Rectangle();
        r1.compute_area(25, 36);
        //r1.calculate_area();
    }

}