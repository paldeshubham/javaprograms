
 interface Vehicle {
    void changegear(int a);
    void increasespeed(int a);
    void apply_brakes(int a);
    void currentstate();
}

class Bicycle implements Vehicle{
    int speed=0;
    int gear;

    public void changegear(int newGear)
    {
        gear=newGear;
    }
    public void increasespeed(int increment)
    {
        speed+=increment;
    }
    public void apply_brakes(int decrement)
    {
        speed-=decrement;
    }
    public void currentstate()
    {
        System.out.println("The speed of the bicycle is:"+speed+"and gear is:"+gear);
    }
}
class car implements Vehicle{
    int speed=0;
    int gear;

    public void changegear(int newGear)
    {
        gear=newGear;
    }
    public void increasespeed(int increment)
    {
        speed+=increment;
    }
    public void apply_brakes(int decrement)
    {
        speed-=decrement;
    }
    public void currentstate()
    {
        System.out.println("The speed of the car is:"+speed+"and gear is:"+gear);
    }
}
class Bike implements Vehicle{
    int speed=0;
    int gear;

    public void changegear(int newGear)
    {
        gear=newGear;
    }
    public void increasespeed(int increment)
    {
        speed+=increment;
    }
    public void apply_brakes(int decrement)
    {
        speed-=decrement;
    }
    public void currentstate()
    {
        System.out.println("The speed of the bike is:"+speed+"and gear is:"+gear);
    }
}
class ass5
{
    public static void main(String[] args) {
        Bicycle b1= new Bicycle();
        b1.changegear(1);
        b1.increasespeed(25);
        b1.apply_brakes(20);
        b1.currentstate();
    }
}
