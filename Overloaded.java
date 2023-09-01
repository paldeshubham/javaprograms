public class Overloaded
{
	int l,b,h;
	Overloaded(int l)
	{
	 	
	}
	Overloaded(int l,int b)
	{
		
		
	}
	Overloaded(int l,int b, int h)
	{
		
	}
	void display()
	{
		System.out.println("The square is:"+(l*l));
		System.out.println("The areais:"+(l*b));
		System.out.println("The volume is:"+(l*b*h));
	}
	public static void main(String [] args)
	{
	Overloaded s1= new Overloaded(2);
	Overloaded s2= new Overloaded(2,3);
	Overloaded s3= new Overloaded(2,3,4);
	s1.display();
	s2.display();
	s3.display();
	
	
	}
}

