// creating a claaa

//class 1 (parent class)
 class Poly{
 	void print(){
		System.out.println("This is main class");
	}
}	
	
// this is class 2
class Sub1 extends Poly {
	void print(){
	System.out.println("This is sub class 1");
	}
}

// this is class 3
class Sub2 extends Poly {
	void print(){
	System.out.println("This is sub class 2");
 	}
}

// main class is now here from where the code will be execute
class Test{
	public static void main(String[] args)
	{ 	
		//creating object to the class
		Poly a;
		 a = new Sub1();
		a.print();
		
		a= new Sub2();
		a.print();
	}
}
