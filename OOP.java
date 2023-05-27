
class OOP
{
    public static void main(String Arg[])
    {
        System.out.println("Inside main function");
        
        Arithmatic obj1 = new Arithmatic();
        Arithmatic obj2 = new Arithmatic(11,10);

        int iRet = 0;
       
        iRet = obj1.Addition(); //0
        System.out.println("Addition is: "+iRet);
    
        iRet = obj1.Substraction(); //0
        System.out.println("Substraction is: "+iRet);
    
        iRet = obj2.Addition(); //21
        System.out.println("Addition is: "+iRet);
   
        iRet = obj2.Substraction(); //1
        System.out.println("Substraction is: "+iRet);
    }
}

class Arithmatic
{
    public int No1;
    public int No2;

    public Arithmatic()  //Default constructor
    {
        System.out.println("Inside default constructor");
        this.No1=0;
        this.No2=0;
    }
    public Arithmatic(int i, int j)  // parameterised constructor
    {
        System.out.println("Inside parameterised constructor");
        this.No1=i;
        this.No2=j;
    }

    public int Addition()
    {
        int Ans=0;
        Ans= this.No1 + this.No2;
        return Ans;
    }
    public int Substraction()
    {
        int Ans=0;
        Ans= this.No1 - this.No2;
        return Ans;
    }
}

/*
//it just create  the reference not object
Arithmatic obj;
obj = new Arithmatic();

single line object creation
Arithmatic obj = new Arithmatic();
*/