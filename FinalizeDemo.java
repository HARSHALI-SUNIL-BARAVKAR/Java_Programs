class FinalizeDemo  //class FinalizeDemo extends Object
{
    public static void main(String A[])
    {
        Marvellous mobj1= new Marvellous();
        Marvellous mobj2= new Marvellous(11,21);
        mobj1 = null;
        mobj2 =null;
        System.gc();                            //gc garbage collector
    }
}

class Marvellous   //class Marvellous extends Object
{
    public int No1;
    public int No2;
    public Marvellous()
    {
        No1=0;
        No2=0;
        System.out.println("Inside default constructor");
    }
    public Marvellous(int a, int b)
    {
        No1=a;
        No2=b;
        System.out.println("Inside parameterised constructor");

    }
    
    protected void finalize()
    {
        System.out.println("Inside Finalize method");
    }
}