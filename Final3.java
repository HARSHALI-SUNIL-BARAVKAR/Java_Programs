class Final3
{
    public static void main(String Arg[])
    {
        Base bobj = new Base();
      
    }
}

final class Base   // this class can inherit other base class but that should not be final
{
    //code    
}
class Derived extends Base  //error bcoz we cant inherit final class
{
    //code
}