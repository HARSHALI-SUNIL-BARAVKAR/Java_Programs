class SuperDemo
{
    public static void main(String Arg[])
    {
    Derived dobj = new Derived();
    dobj.gun();
}
}

class Base
{
    public int A;
    public Base()
    {
        System.out.println("Inside Base Default Constructor");
        this.A=11;
    }
    public Base(int i)
    {
        System.out.println("Inside Base Parameterised Constructor");
        this.A=i;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base  // class Derived : pblic Base //in c++
{
    public int X;
    public Derived()
    {
        super(11);   //3 restriction is it shoul be 1st line of constructor
        System.out.println("Inside Derived Constructor");
        this.X=51;
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
        System.out.println("Value of A :"+A);  //51
        System.out.println("Value of A :"+this.A);  //51
        System.out.println("Value of A :"+super.A);  //11
        
        super.fun(); //2
    }
}



/*
1 Access datA of parent from child
2 call method of parent from child
3 call constructor of parent from child
 */